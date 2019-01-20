package edu.eci;

import java.nio.file.*;
import org.apache.tika.Tika;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;

public class FileSpy {
	private static final String FILE_TYPE = "text/csv";
	private static final String DIR_TO_WATCH = "C:\\Users\\2121990\\Documents\\ARSW_PRUEBA\\file-spy\\resources";
	private static final String DIR_TO_W = "C:\\Users\\Andres\\Documents\\final\\ARSW-LAB1\\MAVEN\\file-spy\\src\\main\\java\\edu\\eci\\resources";
	private static final String FINAL = new java.io.File("").getAbsolutePath()+"\\src\\main\\java\\edu\\eci\\resources";
	public static void main(String[] args) throws Exception {
		Path dir = Paths.get(FINAL);
        Tika tika = new Tika();
        WatchService watchService = FileSystems.getDefault().newWatchService();
        dir.register(watchService, ENTRY_CREATE);
        WatchKey key;
        do {
            key = watchService.take();
            key.pollEvents().stream().filter(e -> {
                Path filename = (Path) e.context();
                String type = tika.detect(filename.toString());
                return FILE_TYPE.equals(type);
            }).forEach(e ->
                    System.out.printf("File found: %s%n", e.context())
            );
        } while (key.reset());
    }
}

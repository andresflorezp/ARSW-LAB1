# Laboratorio 1 Introducción MVN-GIT ARSW


## Empezando

>Para clonar el archivo 

git clone https://github.com/andresflorezp/andresflorezp/ARSW-LAB1.git
>
### Prerrequisitos
* Maven
* Java
* Git


### Instalación

Despues de clonar el archivo para correrlo con:

* mvn package

## Construido con

* [Maven] (https://maven.apache.org/) - Gestión de dependencias

## Parte GIT

Como primer paso debemos crear el repositorio en github.

![Screenshot](screenshot.png)

Luego de eso debemos hacer la configuracion basica de usuario,correo,y remote.

Los comandos son los siguientes:

* **git init-→Permite iniciar el repositorio**

* **git config –global user.name “nombre-del-usuaio”**

* **git config –global user.mail “correo-del-usuaio”**

* **git remote add origin https://github.com/nombre_user/name_repositorio.git**

En lo siguiente hacemos la configuracion:

![Screenshot](screenshot.png)

Si queremos añadir los archivos al repositorio local lo hacemos con **git add .** Para hacer un commit **git commit -m “Descripcion del commit”**.

Siguiendo con los problemas indicados el usuario 1, en este caso Andres Giovanne Florez Perez.

Mostramos lo que se realiza en el primer problema Antes que nada debemos traer de el repositorio remoto a donde estamos trabajando para que la rama se actualize para ello utilizamos **git pull –rebase origin master**.

![Screenshot](screenshot.png)

y luego seguimos los pasos mencionados anteriormente.

![Screenshot](screenshot.png)

Para el primer problema mostramos que es aceptado.

![Screenshot](screenshot.png)

Luego el segundo compañero es decir Juan Nicolas Nontoa Caballero hace los comandos básicos de configuración de git es decir el user,email,remote. **git pull origin master-→ Permite traer las cosas de la rama** y luego resuelve el problema.


![Screenshot](screenshot.png)

Luego hacemos git pull origin master para traer los cambios y por ultimo subir el reporte al github.

![Screenshot](screenshot.png)

## Parte MAVEN

**mvn archetype:generate -B -DgroupId=edu.eci -DartifactId=file-spy**

* What do means the -B option in the command?
       
* What do means the -D option in the command?

* What do means the groupId, artifactId properties in the command?

       groupId es el identificador único de la organización o grupo que crea el proyecto (se podría decir que es el identificador de la aplicación), y artifactId es el identificador único del artefacto principal de este proyecto (se podría decir que es el identificador del módulo
dentro de la aplicación), es decir, este será el nombre del jar.

* Describe the content of the directory that has been created.

       Se creo un proyecto el cual contiene el POM.xml y una carpeta src en la cual tiene dos carpetas, main y test.

* What do means the word SNAPSHOT in the version value?

       Al indicar SNAPSHOT se quiere decir que es una versión evolutiva, es decir que estamos trabajando para obtener al versión 1.0.
       
* What is the purpose of the packing tag into the POM file?

       Con packaging se indica el tipo de empaquetado que hay que hacer con el proyecto. Podemos usar jar, war, ear, pom.

* What is the purpose of the dependencies and dependency tags into the POM file?

       El proposito de los tags es mantener una estructura ordenada.

The three principal Maven lifecycles areclean, defaultand site. Describe each one.

       Clean Elimina todos los .class y .jar generados. Después de este comando se puede comenzar un compilado desde cero.
 
       Site  Genera un sitio web con la información de nuestro proyecto. Dicha información debe escribirse en el fichero pom.xml y ficheros .apt separados.
 
       Default no existe como comando de maven.

* Using the terminal execute the command mvn compile. What is this command using for? What are transitive dependencies?

       Compila el codigo fuente del proyecto y sigue la fase de tests.

* Using the terminal execute the command mvn package. What is this command using for?

       Toma el codigo compilado y empaquetarlo en su formato distribuible, como un JAR.

* Using the terminal execute the command mvn install. What is this command using for?

       Instalar el paquete en el repositorio local, para su uso como una dependencia en otros proyectos a nivel local.

* Generate a new maven project in other folder using the maven command line tools, this project should has as groupId "edu.eci" and as artifactId "another-maven-project". 

* Replace the code of the App.java class with the following code and do all the necessary steps to compile the code.

## Autores

* **Andres Giovanne Florez Perez**  ARSW-LAB1 - [andresflorezp] (https://github.com/andresflorezp)

* **Juan Nicolas Nontoa Caballero**  ARSW-LAB1 - [nontoa] (https://github.com/nontoa)

Consulte también la lista de [colaboradores] (https://github.com/your/project/contributors) que participaron en este proyecto.

## licencia

Este proyecto está licenciado bajo la Licencia MIT - vea el archivo [LICENSE.md](LICENSE.md) para más detalles.


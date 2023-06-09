# mvn-example

## How to recreate this project
If you don't have [Homebrew](https://brew.sh) installed, start by installing it:
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
Then install maven with Homebrew:
```
brew install maven
```

```
mvn -B archetype:generate -DgroupId=org.diego -DartifactId=mvn-example -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
```

Update 1.7 to 1.8
```
    <properties>  
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>  
      <maven.compiler.source>1.8</maven.compiler.source>  
      <maven.compiler.target>1.8</maven.compiler.target>  
    </properties>
```

Make the JAR executable:

```
<plugins>
      <plugin>
        <!-- Build an executable JAR -->
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.0.2</version>
        <configuration>
          <archive>
            <manifest>
              <addClasspath>true</addClasspath>
              <mainClass>org.diego.App</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
```
## How to run this project

Compile:
```commandline
mvn compile
```

Package:
```commandline
mvn package
```

Excecute from command line:
```commandline
java -jar target/mvn-example-1.0-SNAPSHOT.jar
```

Clean and Package:
```commandline
mvn clean package
```

Run all tests:
```commandline
mvn test
```

Run tests from 1 class: SListTest
```commandline
 mvn -Dtest=SListTest test
```

Run 1 test testSList from class SListTest
```commandline
mvn -Dtest=SListTest#testSList test
```
## How to open in Intellij
In Intellij, choose File > Open
![](docs/intellij01.png)

Navigate to the folder mvn-example and choose open:
![](docs/intellij02.png)

Edit the configuration.  Click the + button to add a new configuration.  Choose "Application".
![](docs/intellij03.png)

Type in the path to the runnable class. In this example it is "org.diego.App"
![](docs/intellij04.png)

Create tests by right clicking on the class you want to add test for and choose "Show Context Actions"
![](docs/intellij05.png)

Choose Create Test
![](docs/intellij06.png)

Give the Test a Class name
![](docs/intellij07.png)

## Sources
- [Running a Maven Project from the Command Line (and Building Jar Files)](https://www.sohamkamani.com/java/cli-app-with-maven/)
- [How to run unit test with Maven - Mkyong.com](https://mkyong.com/maven/how-to-run-unit-test-with-maven/)
- [Maven Quickstart Archetype – Maven Quickstart Archetype](https://maven.apache.org/archetypes/maven-archetype-quickstart/)

# Apache Maven: Beginner to Ozay TUNÇTAN

This respository contains code examples for the online course [Apache Maven: Beginner to Guru.](https://www.udemy.com/draft/2043700/?couponCode=GITHUB_REPO)
### POPULAR MAVEN PLUGINS

# Maven Generate XSD SCHEMA
# Dependencies
```xml
<dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>${jaxb.version}</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-core</artifactId>
            <version>${jaxb.version}</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-impl</artifactId>
            <version>${jaxb.version}</version>
        </dependency>
````
#  Plugin
````xml
 <plugin>
                <groupId>org.jvnet.jaxb2.maven2</groupId>
                <artifactId>maven-jaxb2-plugin</artifactId>
                <version>0.14.0</version>
                <executions>
                    <execution>
                        <id>xjc-1</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <schemaDirectory>${project.basedir}/src/main/resources/wsdl/</schemaDirectory>
                            <schemaIncludes>
                                <include>*.xsd</include>
                            </schemaIncludes>
                            <generatePackage>tr.com.otunctan.ws</generatePackage>
                            <generateDirectory>target/generated-sources/xjc/xjc-1</generateDirectory>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
````
           

# Maven Generate JSON SCHEMA 
- org.jsonschema plugin use 
- http://json-schema.org/
# Dependencies
````xml
  <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.2.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.13.0</version>
        </dependency>
````
# Plugin
          
````xml
            <plugin>
                <groupId>org.jsonschema2pojo</groupId>
                <artifactId>jsonschema2pojo-maven-plugin</artifactId>
                <version>1.2.1</version>
                <executions>
                    <execution>
                        <id>2</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <sourceDirectory>${project.basedir}/src/main/resources/json</sourceDirectory>
                            <targetPackage>tr.com.otunctan.model</targetPackage>
                            <useCommonsLang3>true</useCommonsLang3>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
````
## Project Lombok
# Dependency
````xml
    <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.24</version>
            <scope>provided</scope>
        </dependency>
````
## Mapstruct
# Dependency
````xml
    <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.24</version>
            <scope>provided</scope>
        </dependency>
````
# Plugin
````xml
       <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.0</version>
                <configuration>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>${mapstruct.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
````

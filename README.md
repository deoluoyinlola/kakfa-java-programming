# kakfa-java-programming
A simple Java project using Gradle that can interact with Kafka cluster, developing Kafka producers and consumers in Java.

## Prerequisites;
- Download and installed IDE, preferably IntelliJ Community IDEA
- Get Java JDK installed. I will be using version 17.0.7 and Gradle to set up the project.

## Steps
- Step 1; Project file creation
In IntelliJ IDEA, create a new Java Gradle project (File > New > Project); first-kafka > Location; [choose-a-path] > Language; Java > Build System; Gradle > JDK; version 17.0.7 > I keep all the default ‘Advanced Setting’. This will create a new project. While it will take some time for cradle to sync. 

Image - kafka-1
Image - kafka-2

- Step 2; Project Organization
1.) create sub-project; select and delete the src directory, right click on the first-kafka directory > choose ‘’’New’’’ > ‘’’Module’’’ > Pick Gradle, Java and version 17.0.7, Name; kafka-basics, Advance Settings remain the same.  The new module will automatically be populate with src directory, .gitignore and build.gradle.kts. Disregard the newly created src directory at the root of this project.
2.) add Kafka dependencies; Define the Kafka Dependencies in the dependencies { ... } block.


Load the Gradle changes with the menu from the right hand side to import the dependencies
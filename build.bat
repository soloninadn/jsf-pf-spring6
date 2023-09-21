@echo off
set JAVA_HOME=c:\java\jdk-17.0.6
set MAVEN_HOME=c:\java\apache-maven
set PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

java -version

mvn -Dmaven.test.skip=false clean install
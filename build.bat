@echo off

rem create a file named b-next.bat and place it in your ~\\b-next folder with the following content (changed to your location of java and maven).
set JAVA_HOME=c:\java\jdk-17.0.6
set MAVEN_HOME=c:\java\apache-maven

rem call %userprofile%\.bnext\b-next.bat

set PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%
java -version

if %1.==. (
    echo No parameters have been provided - using default profile
    set PORTAL_PROFILE=helaba-qa
) else (
    echo Using profile: %1
    set PORTAL_PROFILE=%1
)

mvn -Dmaven.test.skip=false clean install -P%PORTAL_PROFILE%
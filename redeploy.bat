set CATALINA_HOME=c:\java\apache-tomcat10
set PATH=%CATALINA_HOME%\bin;%PATH%

del /Q /S C:\java\apache-tomcat10\webapps\*
rmdir /Q /S C:\java\apache-tomcat10\webapps\demo
copy target\*.war %CATALINA_HOME%\webapps\

java -version
startup


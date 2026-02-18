@echo off

rem Dany 2.01 by Jon Baer 
rem (jonbaer@digitalanywhere.com)
rem This is the startup script for Win9x/NT
rem Edit it as needed by your system
rem See README.txt for details

rem for speech
set PATH=%PATH%;./bin/dany/;

rem set dany classpath
set DANY_CLASSPATH=%JAVA_HOME%/lib/tools.jar;./lib/jasper.jar;./lib/speech.jar;./lib/dany.jar;./lib/webserver.jar;./lib/servlet.jar;./lib/xml.jar;
rem set DANY_CLASSPATH=%JAVA_HOME%/lib/tools.jar;./classes/

rem set dany data path
set DANY_DATAPATH=./data

rem run dany
rem have fun ;-)

start java -classpath %CLASSPATH%;%DANY_CLASSPATH% org.dany.gui.Main %DANY_DATAPATH%
start java -classpath %CLASSPATH%;%DANY_CLASSPATH% -Dtomcat.home="./" org.apache.tomcat.startup.Tomcat %2 %3 %4 %5 %6 %7 %8 %9



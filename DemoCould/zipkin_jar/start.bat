@ECHO OFF
set STORAGE_TYPE=mysql

set MYSQL_HOST=111.231.195.187
set MYSQL_TCP_PORT=3306

set MYSQL_USER=root

set MYSQL_PASS=1406100143Dr!!
set MYSQL_DB=zipkin

set MYSQL_USE_SSL=false


set JAVA_OPTS="-XX:ReservedCodeCacheSize=64m" 

java -jar zipkin-server-2.11.7-exec.jar

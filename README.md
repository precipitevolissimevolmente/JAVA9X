# This project is used for demo and experiments with JAVA 11

## Running Code before and after JAVA 8 
### JAVA 9 (based on module path)
    -p == --module-path 
java -p Modules -m ModuleB/user.FirstUser
java -p Serviceloader -m Ratefinder/ratefinder.RateFinder
### JAVA 8 (based on classpath)
    -cp == classpath
    -classpath <class search path of directories and zip/jar files>
java -cp .\ModuleA.jar;.\ModuleB.jar user.FirstUser

## Docker MySQL setup:
docker run -p 3306:3306 --name university -e MYSQL_ROOT_PASSWORD=wsx456 -d mysql:8
docker run -it --link university:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -u root -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
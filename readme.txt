JAVA 9
java -p Modules -m ModuleB/user.FirstUser
JAVA 8
java -cp .\ModuleA.jar;.\ModuleB.jar user.FirstUser

exports util to VARU;

requires transitive ModuleA;
opens impl;

java -p Serviceloader -m Ratefinder/ratefinder.RateFinder

F:\JavaProjects\JAVA9X\out\artifacts>jLink --module-path Modules --add-modules ModuleA --add-modules ModuleB --output myApp --launcher myApp=ModuleB/user.FirstUser

Docker:
docker run -p 3306:3306 --name university -e MYSQL_ROOT_PASSWORD=wsx456 -d mysql:8
docker run -it --link university:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -u root -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
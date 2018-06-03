JAVA 9
java -p Modules -m ModuleB/user.FirstUser
JAVA 8
java -cp .\ModuleA.jar;.\ModuleB.jar user.FirstUser

exports util to VARU;

requires transitive ModuleA;
opens impl;

java -p Serviceloader -m Ratefinder/ratefinder.RateFinder

F:\JavaProjects\JAVA9X\out\artifacts>jLink --module-path Modules --add-modules ModuleA --add-modules ModuleB --output myApp --launcher myApp=ModuleB/user.FirstUser
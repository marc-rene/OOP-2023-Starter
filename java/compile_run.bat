
javac -classpath "./;./lib/minim.jar;./lib/core.jar" -d bin src/ie/tudublin/*.java

java -classpath "./bin;./lib/minim.jar;./lib/core.jar;./lib/jsminim.jar;./lib/mp3spi1.9.5.jar;./lib/tritonus_share.jar;./lib/tritonus_aos.jar;./lib/jl1.0.1.jar;./lib/sqlite-jdbc-3.23.1.jar" ie.tudublin.Main


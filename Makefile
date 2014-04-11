
all:
	javac -cp src src/hw5_2/Main.java -d bin/

run:
	java -cp bin hw5_2.Main

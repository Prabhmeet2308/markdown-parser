MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
run: MarkdownParse.class
	java MarkdownParse
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class MarkdownParse.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java MarkdownParse.java
run: MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest
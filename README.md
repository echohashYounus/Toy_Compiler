### This project is an implementation of a compiler for a custom programming language designed using ANTLR4. It includes a TestDriver for parsing and analyzing code written in UpdatedLanguage.

## Requirements

- Java JDK 11 or above
- ANTLR 4.9.1

- 1. Install ANTLR4 and set up the environment:
    ```bash
    export CLASSPATH=".:/path/to/antlr4-runtime-4.9.1.jar:$CLASSPATH"
    ```

    2. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/updatedlanguage-compiler.git
    ```

    # Compilation

To compile the grammar into Java classes:
```bash
antlr4 UpdatedLanguage.g4 -o gen
javac -cp .:antlr4-runtime-4.9.1.jar gen/*.java TestDriver.java


# Running the TestDriver

#### Run the TestDriver with an input file to parse:

java -cp .:antlr4-runtime-4.9.1.jar TestDriver input.txt

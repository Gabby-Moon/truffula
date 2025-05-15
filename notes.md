# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
- This is where we will compile our overall tree output
- It will contain a path, and may contain flags in the argument
    - Flag for colored text
    - Flag for hidden files
- We'll create a truffulaOptions object that is passed to the truffulaPrinter

## ConsoleColor.java
- Stores codes for colors that can be printed on the console
- Can give the code of a certain color

## ColorPrinter.java / ColorPrinterTest.java
- Sets up the color output within the terminal
- Takes the ConsoleColor enum of colors, and applies them to a specific String either permanently or temporarily.
-  Tests will verify the effectiveness of the methods by verifying color output.

## TruffulaOptions.java / TruffulaOptionsTest.java
- Uses two flags in any order and path needs to be at the end
- Has methods for showing the variables
- Has a toString showing all the variables
- Has a constructor that uses the command-line and one using set variables
    - The command-line constructor can throw two exceptions for missing path and incorrect directory
- The test makes a directory and gets the path from it
- And it also tests wether the hidden files and no color are being followed

## TruffulaPrinter.java / TruffulaPrinterTest.java
- Compiles our ColorPrinter and TruffulaOptions files into the TruffulaPrinter.
    - This gives access to both color settings and file settings
- Everything is combined to output a tree of file data
    - Case-insensitive, but sorted lexicographically
    - Hidden files shown or not shown
    - Specific color settings, including default options
- Testing will check if windows or hidden, and test the compiled output structure of files & colors.
    - Testing setup will be extensive for TruffulaPrinter, as each file and folder needs to individually be set up, along with the color coding for each.

## AlphabeticalFileSorter.java
- Passed in an array of the type File and it compares the name (ignoring the case) and sorts them
- It returns the sorted files array
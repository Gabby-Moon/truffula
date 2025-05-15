import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnWithGreenColorAndNoReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.GREEN);

    // Act: Print the message
    String message = "I am the color GREEN";
    printer.println(message, false);

    String expectedOutput = ConsoleColor.GREEN + "I am the color GREEN" + System.lineSeparator();

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithPurpleColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.PURPLE);

    // Act: Print the message
    String message = "Why am I purple?";
    printer.print(message);

    String expectedOutput = ConsoleColor.PURPLE + "Why am I purple?" + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithCyanColorAndNoReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.CYAN);

    // Act: Print the message
    String message = "Tickle cuddle fish number 17-5.";
    printer.print(message, false);

    String expectedOutput = ConsoleColor.CYAN + "Tickle cuddle fish number 17-5.";

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnTwoParamsWithYellowColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.YELLOW);

    // Act: Print the message
    String message = "Hello? Monster under the bed? Your rent is due!";
    printer.println(message);

    String expectedOutput = ConsoleColor.YELLOW + "Hello? Monster under the bed? Your rent is due!" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintlnTwoParamsWithBlueColorAndNoReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.BLUE);

    // Act: Print the message
    String message = "I... don't wanna think about the... genetic structure of a cup.";
    printer.println(message, false);

    String expectedOutput = ConsoleColor.BLUE + "I... don't wanna think about the... genetic structure of a cup." + System.lineSeparator();

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintTwoParamsWithBackColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.BLACK);

    // Act: Print the message
    String message = "Would you like a cup of tea?";
    printer.print(message);

    String expectedOutput = ConsoleColor.BLACK + "Would you like a cup of tea?" + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintTwoParamsWithWhiteColorAndNoReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    
    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.WHITE);
    
    // Act: Print the message
    String message = "Ma'am, as you said earlier, I am a sponge.";
    printer.print(message, false);

    String expectedOutput = ConsoleColor.WHITE + "Ma'am, as you said earlier, I am a sponge.";

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testGetCurrentColor() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    
    // Act: Change the Color
    printer.setCurrentColor(ConsoleColor.RED);

    // Assert: Verify the color
    assertEquals(ConsoleColor.RED, printer.getCurrentColor());
  }
}

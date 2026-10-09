import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Part 2.1: Java Program Architecture
       
        System.out.println("--- Part 2.1 ---");
        System.out.println("Hello World");

        // Part 2.2 & 2.3: Program Documentation Types
     
        System.out.println("\n--- Part 2.2 & 2.3 ---");
        // Inline note format
        /* Block syntax for multi-line notes */
        /** Documentation generator style */
        System.out.println("Documented code successfully.");

      
        // Part 2.4: Execution Units and Scopes
     
        System.out.println("\n--- Part 2.4 ---");
        System.out.println("Individual statement line");
        {
            System.out.println("First line in block");
            System.out.println("Second line in block");
        }

        // Part 2.5 & 2.6: Naming Conventions & System Words
   
        System.out.println("\n--- Part 2.5 & 2.6 ---");
        int studentAge = 19;
        double $baseSalary = 200.00;
        int primaryVal = 10;
        System.out.println("Student Age: " + studentAge + ", Base Salary: " + $baseSalary);

   
        // Part 2.7: Fixed Value Expressions
      
        System.out.println("\n--- Part 2.7 ---");
        int countLit = 5;
        double piLit = 3.1415;
        char letterLit = 'A';
        String textLit = "Hello World";
        boolean flagLit = true;
        System.out.println("Text Literal: " + textLit);

     
        // Part 2.8: Memory & Type Specifications
    
        System.out.println("\n--- Part 2.8 ---");
        boolean isComplete = true;
        char symbolVal = 'a';
        byte byteNum = 100;
        short shortNum = 10000;
        int intNum = 100000;
        long longNum = 100000L;
        float floatNum = 15.50f;
        double doubleNum = 123.4;
        System.out.println("Primitive types configured.");

        // Part 2.9 & 2.10: Variable Allocation
     
        System.out.println("\n--- Part 2.9 & 2.10 ---");
        int testScore1 = 3, testScore2 = 10;
        byte profileAge = 19;
        double circleRatio = 3.14159;
        char menuOption = 'x';
        System.out.println("Scores: " + testScore1 + ", Profile Age: " + profileAge);

     
        // Part 2.11: Direct Values vs Pointer References
       
        System.out.println("\n--- Part 2.11 ---");
        int rawPrimitive = 10;
        String objReference = "SAGANA SANTIAGO CITY";
        System.out.println("Direct Value: " + rawPrimitive + ", Reference Value: " + objReference);

       
        // Part 2.12: Value Assignment Operations
      
        System.out.println("\n--- Part 2.12 ---");
        int computedVal;
        computedVal = 42;
        System.out.println("Assigned value: " + computedVal);

       
        // Part 2.13: Console Output Methods
   
        System.out.println("\n--- Part 2.13 ---");
        System.out.print("white ");
        System.out.print("blue ");
        System.out.println("black ");
        System.out.println("pink ");

        // Part 2.14: Interactive User Console Input
    
        System.out.println("\n--- Part 2.14 ---");
        Scanner consoleReader = new Scanner(System.in);

        System.out.print("John Ivan Adas Soriano: ");
        String inputName = "John Ivan Adas Soriano";

        if (consoleReader.hasNextLine()) {
            String enteredName = consoleReader.nextLine();
            if (!enteredName.trim().isEmpty()) {
                inputName = enteredName;
            }
        }

        System.out.println("\nRegistered name: " + inputName);

        // Part 2.15: String Merging Operators

        System.out.println("\n--- Part 2.15 ---");
        String prefixText = "Hello";
        String combinedMessage = prefixText + " my dear!";
        System.out.println(combinedMessage);


        // Part 2.16: Basic Math Computation

        System.out.println("\n--- Part 2.16 ---");
        int numX = 20, numY = 9;
        System.out.println("Sum Result: " + (numX + numY));
        System.out.println("Modulo Result: " + (numX % numY));

        // Part 2.17: Mathematical Precedence Hierarchy

        System.out.println("\n--- Part 2.17 ---");
        int mathEvaluation = ((7 % 4) * 10) + (4 / 2) + 55 - 15;
        System.out.println("Evaluated Math Result: " + mathEvaluation);

        // Part 2.18: Prefix/Postfix Modification

        System.out.println("\n--- Part 2.18 ---");
        int loopIndex = 1;
        int preIncrement = ++loopIndex;
        int postIncrement = loopIndex++;
        System.out.println("Pre-incremented: " + preIncrement + ", Post-incremented: " + postIncrement);

        consoleReader.close();
    }
}

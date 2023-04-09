import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner inputObj = new Scanner(System.in);

    System.out.println("Please enter your name");
    String name = inputObj.nextLine();

    System.out.println("Welcome " + name);

    System.out.println(name + " please enter the amount of money you'd like to borrow");
    int amount = inputObj.nextInt();
    int L = amount;

    if (amount <= 0) {
      System.out.println("Please try again and be sure to enter a valid amount");
      System.exit(0); // exit condition if user enters 0 or a negative number
    }

    System.out.println(name = "how long would you like the length of the loan to be?");
    int length = inputObj.nextInt();
    int n = length;

    if (length <= 0) {
      System.out.println("Please enter a valid number");
      System.exit(0);
    }

    System.out.println("okay lastly, what kind of interest rate are you looking to have on this loan?");
    double interest = inputObj.nextDouble();
    double R = interest;

    if (interest <= 0) {
      System.out.println("please enter a number greater than 0. Must be a decimal");
      System.exit(0);
    }

    System.out.println("Okay so you want to borrow " + "$" + amount + "and pay us back over the course of" + length
        + " years" + "at an interest rate of" + interest + "?");

    System.out.println("Is that correct?");
    String yesOrNo = inputObj.next();

    if (yesOrNo == "yes") {
      System.out.println("Alright let me calculate that for you");
    }
    if (yesOrNo == "no") {
      System.out.println("Okay try again later");
      System.exit(0);
    }

    // L = integer loan amount
    // R = float or double interest rate
    // n = desired integer length in years

    // i = interest calculation
    // M = integer monthly payment

    double i = R / 100;

    double M = L * i * (1 + i) * n / ((1 + i) * n - 1); // formula

    System.out.println(M);
  }

}
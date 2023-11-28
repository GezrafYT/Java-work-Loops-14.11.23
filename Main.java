import java.util.Scanner;

public class Main
{

  public static void problemOne()
  {
      Scanner scan = new Scanner(System.in);
      int grade = 0, count = 0, sum = 0;
      for(int i = 0; i<5; i++)
      {
          System.out.println("Enter grade: ");
          grade = scan.nextInt();
          sum += grade;
          count++;
      }
      int avg = sum / grade;
      System.out.println("The grade average is " + avg);
  }

  public static void problemTwo()
  {
      Scanner scan = new Scanner(System.in);
      String word = "";
      int count = 0;
      while(!(word.equals("enter")))

      {
          System.out.println("Enter word: ");
          word = scan.nextLine();
          count ++;
      }
      System.out.println("Count of words: " + count);

  }

  public static void problemThree() {
      Scanner scan = new Scanner(System.in);
      int code;
      int attempts = 3;
      do {
          System.out.println("Enter code: ");
          code = scan.nextInt();
          if (Integer.toString(code).length() != 4) {
              System.out.println("Error.");
              attempts--;
          } else {
              System.out.println("How much money?");
          }
      } while (attempts > 0);
  }

  public static boolean problemFour(String word)
  {
      int length = word.length();

      for(int i = 0; i < length / 2; i++)
      {
          if (word.charAt(i) != word.charAt(length - 1 - i))
          {
              return false;
          }
      }
      return true;
  }

  public static String problemFive(int num)
  {
      String result = "";
      String final_result = "";
      for(int i = 2; i < num; i++)
      {
          if(num % i == 0)
          {
              result += (i + ",");
          }
      }

      for(int j = 0; j < result.length() - 1; j++)
      {
        final_result += result.charAt(j);
      }

      return final_result;
  }

  public static void problemSix()
  {
      for(int i = 1; i < 11; i++)
      {
          for(int j = 1; j < 11; j++)
          {
              System.out.print(i * j + "\t");
          }

          System.out.println();
      }
  }

  public static void problemSeven()
  {
      Scanner scan = new Scanner(System.in);
      int grade;
      int max = 0, min = 0;

      System.out.println("Enter grade: ");
      grade = scan.nextInt();
      min = grade;

      for(int i = 0; i < 6; i++)
      {
          System.out.println("Enter grade: ");
          grade = scan.nextInt();
          if(min > grade)
          {
              min = grade;
          }

          if(max < grade)
          {
              max = grade;
          }
      }

      System.out.println("Lowest grade: " + min);
      System.out.println("Highest grade: " + max);
  }



    public static boolean problemEight(int n) {
        int a = 0, b = 1;
        int temp;
        while (a < n) {
            temp = a;
            a = b;
            b = temp + b;
        }

        return a == n;
    }

    public static void problemNine(int a, int b)
    {
        int result = 0;
        for(int i = 0; i < b; i++)
        {
            result += a;
        }

        System.out.println("Result: " + result);
    }


    public static void problemTen(int height) {
        for(int i = 1; i <= height; i++) {

            for(int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
//      problemOne(); // שאלה 1
//      problemTwo(); // שאלה 2
//      problemThree(); // שאלה 3


//      System.out.println("Enter word: "); // שאלה 4
//      String word = scan.nextLine();
//
//      if(problemFour(word))
//      {
//          System.out.println("The word is a palindrome.");
//      }
//
//      else
//      {
//          System.out.println("The word isn't a palindrome.");
//      }

//      System.out.println("Enter num: "); // שאלה 5
//      int num = scan.nextInt();
//      System.out.println(problemFive(num));

//      problemSix(); //שאלה 6


//      problemSeven(); //שאלה 7



//      System.out.println("Enter num: "); //שאלה 8
//      int num = scan.nextInt();
//      if (problemEight(num)) {
//          System.out.println("The number is in the fibonacci series.");
//      }
//      else
//      {
//          System.out.println("The number isn't in the fibonacci series.");
//      }


//        System.out.println("Enter first num: "); //שאלה 9
//        int a = scan.nextInt();
//        System.out.println("Enter second num: ");
//        int b = scan.nextInt();
//        problemNine(a, b);



//      System.out.println("Enter triangle height: "); //שאלה 10
//      int height = scan.nextInt();
//      problemTen(height);



  }
}

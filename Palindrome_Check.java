import java.util.Scanner;
import java.util.Random;
public class Assignment1{
  public static void main(String[] args){
      System.out.printf("The average is " + "%.3f", getAverage());
      System.out.print("\n\n");
      System.out.print(checkPalindrome());
      System.out.print("\n\n");
      int x[] = winners();
      for (int i = 0; i< 3; i++) {
    	  System.out.println(x[i]);
      }
  }

  public static double getAverage(){
	Scanner kb = new Scanner(System.in);
    System.out.println("Enter three decimal numbers: ");

    double a = kb.nextDouble();
    double b = kb.nextDouble();
    double c = kb.nextDouble();

    double average = (a + b + c) / 3;

    return average;
   }

  public static boolean checkPalindrome() {
	  Scanner kb = new Scanner (System.in);
	  System.out.println("Enter a word to be checked to see if it is a palindrome: ");

	  String word;
	  word = kb.nextLine().toLowerCase().replaceAll(" ","");

	  String reverse = "";

	  int length = word.length();
	  for (int i = length - 1; i >= 0; i--) {
		  reverse += word.charAt(i);

	  }
	  if (reverse.equalsIgnoreCase(word)) return true;
	  else return false;

  }

  public static int[] winners(){
	   Random rand = new Random();
	   int finalists[] = new int[10];
	   for (int i = 0; i < 10; i++) {
		   finalists[i] = i + 1;
	   }

	   int finalist1 = rand.nextInt(10) + 1;
	   int finalist2 = rand.nextInt(10) + 1;
	   int finalist3 = rand.nextInt(10) + 1;
	   if (finalist1 == finalist2) finalist2 = rand.nextInt(10) + 1;
	   if (finalist2 == finalist3) finalist3 = rand.nextInt(10) + 1;
	   if (finalist1 == finalist3) finalist3 = rand.nextInt(10) + 1;

	   int[] finalists2 = {finalist1, finalist2, finalist3};

	   return finalists2;
  }
 }

//Code was discussed with Afm Ehsan & Fernando Carbajal

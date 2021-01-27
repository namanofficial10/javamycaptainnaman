import java.util.Scanner;

public class mintoyear{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();

    
    int hours = minutes/60;
    int day = hours/24;
    int year = day/365;
    
    int days = day - (year*365);


    System.out.println(minutes + " minutes is approxiamately " + year + " years and "  +  days + " days ");
    }

   }

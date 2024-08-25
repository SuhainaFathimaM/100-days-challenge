import java.util.Scanner;

public class Star {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in); //Input

System.out.println("Enter the number of rows: ");

int rows = sc.nextInt();

for (int i = 0; i <= rows - 1; i++) { //For Loop for Row 

for (int j = 0; j <= i; j++) { //For Loop for Col

System.out.print("*" + " "); //prints * and blank space

}

System.out.println(""); // new line

}

for (int i = rows - 1; i >= 0; i--) { //For Loop for Row

for (int j = 0; j <= i - 1; j++) { //For Loop for Col

System.out.print("*" + " "); //prints * and blank space

}

System.out.println("");// new line

}

sc.close();

}

}
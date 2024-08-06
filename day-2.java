import java.util.Scanner;

public class Student {
      public static void main(String[] args) {
        int age = 15;
        double cgp = 9.8;
        char init ='M';
        char last ='A';
        boolean attendance = true;
        String firstname="Jainab";
        String lastname="Afra";
        char initial=firstname.charAt(0);
        String fullname=firstname+" "+lastname;

        System.out.println(age);
        System.out.println(cgp);
        System.out.println(init);
        System.out.println(last);
        System.out.println(attendance);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(initial);
        System.out.println(fullname);
        System.out.println(firstname+" "+lastname+" is "+age+" years old.");
        System.out.println("What do you want to update??");
        Scanner input= new Scanner(System.in);
        age=input.nextInt();
        System.out.println(firstname+" "+lastname+" is "+age+" years old.");
        
      }
    
}

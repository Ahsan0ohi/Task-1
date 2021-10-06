
//Ahshanul Haque Chowdhury
// 2012020107



package Ahsan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Section");
        String section=scanner.nextLine();

        Info info=new Info();
        Hobby hobby=new Hobby();

        System.out.println(section);
        System.out.println(info.name);
        System.out.println(info.id);
        System.out.println(hobby.hobbyName);

    }
}


//     public static void main(String[] args) {
//         System.out.print("hello class ");
//         System.out.print("how are you bro");
//     }
// }
// import java.util.Scanner;
// class hello
// {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
       
//         System.out.print("what is your name=");
//         String name = scanner.nextLine();
//         System.out.print("how old are you ");
//         int age=scanner.nextInt();

        

//         System.out.println("hello "+name);
//         System.out.println("your are " +age+ " year old");
//         System.out.print("yes iam ");
//         int aeg=scanner.nextInt();
//         System.out.println("yes iam "+aeg);
//         System.out.println("what you like to eat");
//         String food = scanner.nextLine();
//         System.out.println("i will like to eat"+food);
     
//     }
// }

// import java.util.Scanner;

// class hello {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("What is your name = ");
//         String name = scanner.nextLine();

//         System.out.print("How old are you = ");
//         int age = scanner.nextInt();

//         System.out.println("Hello " + name);
//         System.out.println("You are " + age + " years old");

//         System.out.print("Yes I am ");
//         int aeg = scanner.nextInt();

//         System.out.println("Yes I am " + aeg);

//         scanner.nextLine(); // 👈 consume leftover newline here Always add 
//         // an extra scanner.nextLine() after using nextInt(), 
//         // nextDouble(), etc., if you want to safely read a String afterward.

//         System.out.println("What do you like to eat?");
//         String food = scanner.nextLine();  // now it waits for input
//         System.out.println("I would like to eat " + food);
//     }
// }

// import java.util.Scanner;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner scanner = new Scanner(System.in);
//         int a=16;
//         String b="hello";
       

//         System.out.println(a);
//         System.out.println(b);

//         System.out.print("what is your mame = ");
//         String name= scanner.nextLine();
//         System.out.println("my name is "+name);


        
//     }
// }



// class hello 
// {
//     public static void main(String[]args)
//     {
//         int age=75;
//         if(age>=18)
//         {
//             System.out.println("you are an adult");
//         }
//         else if(age>=75)
//         {
//             System.out.println("ok bro");
//         }
//         else
//         {
//             System.out.println("you are not an adult");
//         }
//     }
// }

// class hello{
//     public static void main(String[]args){
//         System.out.println("hello world ");
//     }
// }

public class ArgsExample {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
            
            if (args.length > 1) {
                System.out.println("Second argument: " + args[1]);
            }
            
            System.out.println("Total arguments: " + args.length);
        } else {
            System.out.println("No arguments provided!");
            System.out.println("Try: java ArgsExample YourName");
        }
    }
}
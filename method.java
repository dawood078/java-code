

// void =>
// return=>
// parameterised=>
// non parameterised=>

// class hello
// {
//     public static void main(String[]args)
//     {
        
//     }

// }

// import java.util.*;
// public class fun
// {
//     public static void printMyName(String name)
//     {
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("plese enter you name =");
//         String hello = sc.next();
//         printMyName(hello);//call kiya function ko
        

//     }
// }

// import java.util.*;

// class fun
// {
//     public static void main(String[]args)
//     {
//         sum();
//     }
//     static void sum()
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter number 1 = ");
//         int num1 =sc.nextInt();
//         System.out.println("Enter the number 2 = ");
//         int num2 = sc.nextInt();
//         int sum = num1+num2;
//         System.out.println("the sum = "+sum);
//     }
// }

// import java.util.*;

// class fun
// {
//     public static void main(String[]args)
//     {
//        int ans = sum2();
//        System.out.println(ans);
  
//     }

//     static int sum2()
//     {
//        Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number1 = ");
//         int num1=sc.nextInt();
//         System.out.print("Enter the number2 = ");
//         int num2 =sc.nextInt();
//         int num3=num1+num2;
//         // System.out.println("this is the sum of two number ="+(num1+num2));
//         return num3;
 
//     }
//     static void sum()
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number1 = ");
//         int num1=sc.nextInt();
//         System.out.print("Enter the number2 = ");
//         int num2 =sc.nextInt();
//         int num3=num1+num2;
//         System.out.println("this is the sum of two number ="+(num1+num2));

//     }
// }

// class hello{
//     public static void main(String[]args)
//     {
//         String name="bro";
//         int age=25;
//         muNameIs(name,age);
//         muNameIs(name, age); //method call
        
//     }
//     static void muNameIs(String name, int age)
//     {
//         System.out.println("hello how are you ");
//         System.out.println("every thing is fine "+name);
//         System.out.println("you are "+age+" years old\n");
//     }
// }

// public class fun
// {
//     public static void main(String[] args)
//     {
//         System.out.println(square(4));
//         System.out.println(cube(3));
//     }
    
//     static int  square(int number)
//     {
//         return number *number;
//     }
//     static int  cube(int  number)
//     {
//         return number *number*number;
//     }
// }


// class hello
// {
//     public static void main(String[] args)
//     {
//         String fullName = getfullName("dawood","ahmad");
//         System.out.println(fullName); 
//     }

//     static String getfullName(String first,String last)
//     {
//         return first+" "+last;
//     }
// }

// class hello{
//     public static void main(String[] args) {
//         System.out.println(square(4));
//         System.out.println(cube(5));

        
//     }
//     static int square(int number)
//     {
//         return number*number;
//     }
//     static int cube(int number)
//     {
//         return number*number*number;
//     }
// }


// class hello
// {
//     public static void main(String[]args)
//     {
//         System.out.println("10+5="+add(10,5));
//         System.out.println("20-8="+sub(20,8));
//         System.out.println("20*2="+multi(20, 2));
//     }
//     static int add(int a,int b)
//     {
//         return a+b;
//     }
//     static int  sub(int a,int b)
//     {
//         return a-b;
//     }
//     static int  multi(int a,int b)
//     {
//         return a*b;
//     }
// }


// class hello 
// {
//     public static void main(String[] args) {
//     System.out.println("retangale are (5*3)="+recarArea(5,3));
//     System.out.println("circle area (radius 4)="+araeofCircle(4));
//     System.out.println("arae of the traingle (base 6*hight 3)="+traingleArea(6,3));    
//     }

//     static int recarArea(int length,int width)
//     {
//         return length*width;
//     }
//     static double araeofCircle(double radius)
//     {
//         return 3.14*radius*radius;
//     }
//     static int traingleArea(int base,int hight)
    
//     {
//         return (base*hight)/2;
//     }

// }

// import java.util.*;
// class hello
// {
//     public static void main(String[]args)
//     {
//         int ans =sum2();
//         System.out.println(ans);
//     }

//     static int sum2()
//     {
//             Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number 1=");
//         int num1 = sc.nextInt();
//         System.out.print("Enter number 2= ");
//         int num2 = sc.nextInt();

//         int sum=num1+num2;
//         System.out.print("this is the sum of three num="+sum);
//         return sum;
//     }
//     static void sum()
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number 1=");
//         int num1 = sc.nextInt();
//         System.out.print("Enter number 2= ");
//         int num2 = sc.nextInt();

//         int sum=num1+num2;
//         System.out.print("this is the sum of two num="+sum);
//     }

// }


// class stringExample{
//     public static void main(String[] args) {
//         String message = greet();
//         System.out.println(message);
        
//     }
//     static String greet()
//     {
//         String greeting = "how are you";
//         return greeting;
//     }
// }
// public class fun
// {
//     public static void main(String[] args) {
        
//     }

// }
public class he{

    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C");
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}
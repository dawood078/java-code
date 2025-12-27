

// class second
// {
//     public static void main(String[]args)
//     {
//         Scanner scanner=new Scanner(System.in);

        
//         System.out.print("hey give me your age= ");
//         int x = scanner.nextInt();

//         if (x>=18)
//         {
//             System.out.println("hello adult ");
//         }
//         else if (x<=18)
//         {
//             System.out.println("hello teen ");
//         }
//         else
//         {
//             System.out.println("hello boy");
//         }
//     }
// }

// import java.util.Scanner;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("what is your percentage = ");
//         int x= scanner.nextInt();

//         if (x<25)
//         {
//             System.out.println("you are fale");
//         }

//         else if(x>25 && x<44)
//         {
//             System.out.println("your grate is E grate");
//         }
//         else if(x>45 && x<49)
//         {
//             System.out.print("your grate is D garte");
//         }
//         else if(x>50 && x<59)
//         {
//             System.out.println("your grate is C grate ");
//         }
//         else if (x>60 && x<79)
//         {
//             System.out.println("your garte is B grate ");
//         }
//         else if (x>80 && x<100)
//         {
//             System.out.println("your garte is A grate");
//         }

//     }
// }


// import java.util.Scanner;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("what is you age = ");
//         int age=scanner.nextInt();

//         if(age<18)
//         {
//             System.out.println("you are not eligible for jobs");
//         }
//         else if(age<=18)
//         {
//             System.out.println("you are eligible for jobs");
//         }
//         else if(age>=55 && age<=57)
//         {
//             System.out.println("you are eligible for jobs but retirement soon");
//         }
//         else
//         {
//             System.out.println("retirement time");
//         }
//     }
// }

// class shitch
// {
//     public static void main(String[]args)
//     // switch =//
//     {
//        String day = "pioza";
//        switch (day) {
//            case "sunday": System.out.println("It is sunday");
          
//            case "monday": System.out.println("It is monday");
           
//            case "tuesday": System.out.println("It is tuesday");
           
//            case "wednesday": System.out.println("It is wednesday");
           
//            case "thurusday": System.out.println("It is thrusday");
           
//            case "friday": System.out.println("It is friday");
           
//            case "saturday": System.out.println("It is saturday");
//            default: System.out.println("that is not a day");
           

//        }

//     }
// }

// import java.util.Scanner;
// class hello
// {
//     public static void main(String[] args) 
//         {
//             Scanner scanner=new Scanner(System.in);
//             System.out.println("chose the number = ");
            
//             int day=scanner.nextInt();

//             switch(day)
//             {
//                 case 1:
//                 System.out.println("Monday");
//                 break;
//                 case 2:
//                 System.out.println("Tuesday");
//                 break;
//                 case 3:
//                 System.out.println("Wednesday");
//                 break;
//                 case 4:
//                 System.out.println("Thrusday");
//                 break;
//                 case 5:
//                 System.out.println("Friday");
//                 break;
//                 case 6:
//                 System.out.println("Saturday");
//                 break;
//                 case 7:
//                 System.out.println("Sunday");
//             }
//         }
    
// }
// import java.util.Scanner;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner scanner= new Scanner(System.in);
//         System.out.print("take a number = ");
//         int num = scanner.nextInt();

//         switch(num)
//         {
//             case 1:
//             System.out.println("this is monday");
//             break;
//             case 2:
//             System.out.println("this is tuesday");
//             break;
//             case 3:
//             System.out.println("this is wenesday");
//             break;
//             case 4:
//             System.out.println("this is thrusday");
//             break;
//             case 5:
//             System.out.println("this is friday");
//             break;
//             case 6:
//             System.out.println("this is saturday");
//             break;
//             case 7:
//             System.out.println("this is sunday");
//             break;
//             default:
//             System.out.println("this is no day");

//         }

//     }
// }

// array ******************************

// class Food
// {
//     public static void main(String[] args)
//     {
//         Food[] refrigerator = new Food[3];

//         Food food1 = new Food("piza");
//         Food food2 = new Food("burger");
//         Food food3 = new Food ("roti");
//         refrigerator[0] = food1;
//         refrigerator[1] = food2;
//         refrigerator[2] = food3;
//         System.out.println(refrigerator[0].name);
//         System.out.println(refrigerator[1].name);
//         System.out.println(refrigerator[2].name);
//     }
// }

// class Food 
// {
//     String name;

//     Food(String name)
//     {
//         this.name = name;
//     }
// }

// class hello {
//     public static void main(String[] args) {
//         Food[] refrigerator = new Food[3];

//         Food food1 = new Food("piza");
//         Food food2 = new Food("burger");
//         Food food3 = new Food("roti");

//         refrigerator[0] = food1;
//         refrigerator[1] = food2;
//         refrigerator[2] = food3;

//         System.out.println(refrigerator[0].name);
//         System.out.println(refrigerator[1].name);
//         System.out.println(refrigerator[2].name);
//     }
// }
// arry++++++++++++++++++++++++++

// class hello
// {
//     public static void main(String[]args)
//     {
//         int[] number ;
//         number = new int[10];
//         number = new int[]{10,20,30,40,50,60,70,80,90};

//         System.out.println(number[0]);
//         System.out.println(number[1]);
//         System.out.println(number[2]);
//         System.out.println(number[3]);
//         System.out.println(number[4]);
//         System.out.println(number[5]);
//         System.out.println(number[6]);
//         System.out.println(number[7]);
//         System.out.println(number[8]);

//     }
// }
// import java.util.
// class hello
// {
//     public static void main(String[]args)
//     {
//         int[] marks = new int[3];
//         marks[0]=99;
//         marks[1]=80;
//         marks[2]=70;
//         System.out.println(marks[0]);

//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//     }
// }

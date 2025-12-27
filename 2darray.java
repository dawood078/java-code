// import java.util.*;
// class hello {
//     public static void main(String[] args) {
//         int[][] number = new int[3][5]; // 3 rows, 5 columns

        
//         number[0][0] = 9;
//         number[0][1] = 3;
//         number[0][2] = 4;
//         number[0][3] = 6;

//         number[1][0] = 3;
//         number[1][1] = 4;
//         number[1][2] = 9;
//         number[1][3] = 7;

//         number[2][0] = 4;
//         number[2][1] = 2;
//         number[2][2] = 5;
//         number[2][3] = 7;

//         // ✅ Correct nested loops
//         for (int i = 0; i < number.length; i++) { //(number.length) // rows
//             for (int j = 0; j < number[i].length; j++) { //(number[i].length)//columns
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println(); // new line after each row
//         }
//     }
// }


// import java.util.*;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         for(int i=0;i<rows;i++)
//         {
//             for(int j=0;j<cols;j++)
//             {
//                 numbers[i][j] =sc.nextInt();

//             }
//         }
//         for(int i=0;i<rows;i++)
//         {
//             for(int j=0;j<cols;j++)
//             {
//                 System.out.print(numbers[i][j]+"");
            
//             }
//                 System.out.println();
//             }
//         }

//     }



// import java.util.*;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("take a number for the table = ");
//         int n = sc.nextInt();
//         for(int i=1 ;i<=10;i++ )
//         {
//             System.out.println(n+"*"+i+"="+(n*i));
//         }
//     }
// }


// import java.util.*;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number = ");
//         int n = sc.nextInt();

//         for(int i=1; i<=n;i++)
//         {
//             System.out.println(i);
//         }
        
//     }
// }


// import java.util.*;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the row = ");
//         int row=sc.nextInt();
//         System.out.print("enetr the com");
//         int com=sc.nextInt();
//         int number[][]= new int[row][com];

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<com;j++)
//             {
//                 number[i][j]=sc.nextInt();
//             }
//         }

//             System.out.println("this is the matrix");

//             for(int i=0;i<row;i++)
//             {
//                 for(int j=0;j<com;j++)
//                 {
//                     System.out.print(number[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

// import java.util.*;
// class hello
// {
//     public static void main(String[]args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the row = ");
//         int row=sc.nextInt();
//         System.out.print("enter the colm = ");
//         int colm=sc.nextInt();

//         int numbers[][]= new int[row][colm];

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<colm;j++)
//             {
//                 numbers[i][j]= sc.nextInt();
//             }
//         }
//         int x=sc.nextInt();

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<colm;j++)
//             {
//                 if(numbers[i][j]==x)
//                 {
//                     System.out.println("x found at location "+i+j);
//                 }
//             }
//         }
//     }
// }


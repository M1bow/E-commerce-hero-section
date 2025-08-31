import java.util.Scanner;


public class in {

    // static int c=0;
    // static int fun(int x){  //4
    //     if( x==1 | x==0) return x;   
    //     // c++;    
    //     return ( fun(x-1)+ fun(x-2)); //fib(3) + fib(2) ---> 2 + fib(2)
    //                                       //f(2) --> 1 + 1
    //                                         //f(1)+f(0) -> 1
    //                                             //2+ f(2) --> 2+ f(1) + f(0)   -> 2+1+0=3
    // }


    static int n1=-1,n2=1,n3;
    static void printfib(int x){
if(x>0){
    n3=n1+n2;  //1  1  2  3
    n1=n2;  //2
    n2=n3;   //3
    System.out.print(n3+ " ");  //0  1  1  2  3
    printfib(x-1); //4  3  2  1 0
    
}
    }

    static int sum(int n1,int n2){
        if(n1<n2){
            return n1+ sum(n1+1,n2);
        }
        else if(n2<n1){
            return n2+sum(n2+1,n1);
        }
        else{
            return n1;
        }
    }

    public static void main(String[] args) {
        // System.out.print("enter a num: ");
        // Scanner in = new Scanner(System.in);
        // int n= in.nextInt();
        // System.out.println("number is: "+ n);
        // System.out.println(Math.abs(-1.2));
        // System.out.println(fun(4));

        // System.out.print(n1+ " "+ n2);
        
        // printfib(1); 

// System.out.println(sum(0,0));

        // int n1=-1,n2=1,fib;

        // for(int i=0;i<=4;i++){
        //     fib=n1+n2;
        //     System.out.print(fib +" ");
        //     n1=n2;
        //     n2=fib;

        // }
           int arr1[]={10,20,30};
           int arr2 []={22,33,44};
           int arr3[] = {25,35,45};

           arr1=arr2=arr3;
           System.out.println(arr1[0]+" "+arr2[0]+" "+arr3[0]);



    }
}
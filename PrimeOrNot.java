
import java.util.Scanner;
class PrimeOrNot{
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter integer number :-");
    //     int n = sc.nextInt();
    //     int count=0;
    //     for(int i=1; i<=n; i++){
    //         if(n%i==0){
    //             count++;
    //         }
    //     }
    //     if(count==2){
    //        System.out.println(n+" :- This number is prime ");
    //     }
    //     else
    //         System.out.println(n+ " :-number is not prime ");
    // }



    // ............................using while looo......................
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter integer number :-");
    int n = sc.nextInt();
    int i=1,count=0;
    while(i<=n){
        if(n%i==0){
            count=count+1;

        }
        i=i+1;
    }
    if(count==2){
        System.out.println(n+" :- Number is prime ");
    }
    else{
        System.out.println(n+" :- Number is not prime ");
    }
}
}





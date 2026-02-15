public class CallByValue {
    void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        CallByValue sc=new CallByValue();
        int a=20,b=30;
        System.out.println("Before calling : a = "+a +" b = "+b);
        sc.swap(a, b);
        System.out.println("Before calling : a = "+a +" b = "+b);

    }
}

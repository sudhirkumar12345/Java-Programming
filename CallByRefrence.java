class Test{
    int a,b;
}
class CallByRefrence{
  void Swap(Test t){
    int temp = t.a;
    t.a=t.b;
    t.b=temp;
  }
    public static void main(String[] args) {
        CallByRefrence sc=new CallByRefrence();
        Test t=new Test();
        t.a=10;
        t.b=20;
        System.out.println("before swap : a = "+t.a+" b = : "+t.b);
        sc.Swap(t);
        System.out.println("After swap : a = "+t.a+" b = : "+t.b);

    }
}
class A{
void m1(){
System.out.println("inside m1 ---->  parent" );    
}
}

class B extends A{
void m1(){
System.out.println("inside m2 ----> child");
}
}


class C extends B{
void m1(){
System.out.println("inside m3");
}
}

class exp{



public static void main(String av[]){
A a = new B();
a.m1(); //a.m2();

//B b = new C();
//b.m1(); b.m2();

//C c = (C) b;
//c.m1(); c.m2(); c.m3();
}
}
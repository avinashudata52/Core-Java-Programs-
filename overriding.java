class demo{
int a =10;
void m1(){
System.out.println("inside m1");
}
}

class sample extends demo{
int b=4;
void m2(){
System.out.println("inside m2");
}
}

class cyber{
void test(demo d1){
System.out.println("inside test");
sample s = new sample();
s.m1(); s.m2();
d1.m1();
}

}

class overriding{
public static void main(String ars[]){
cyber ob  = new cyber();
ob.test(new sample());


}
}
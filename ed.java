class p {
void m1(){
System.out.println("inside parent m1 parent");
}
}

class c extends p {
void m1(){
System.out.println("inside child m1");
}
}

class ed{
public static void main(String ars[]){
p o =new c();
o.m1();
}
}
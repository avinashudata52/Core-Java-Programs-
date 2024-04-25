import java.util.*;
class demo{
	String u,p,c="vinayak",s="admin123",a="21";
	int i,j;
	Scanner sc = new Scanner(System.in);

	public void get(){
	System.out.println("enter username");
	u=sc.nextLine();
	System.out.println("enter password");
	p=sc.nextLine();
	System.out.println("enter Age");
	a=sc.nextLine();
	sc.close();
	}

	public void show(){
	if(u.equals(c)){
		if(p.equals(s)){
		System.out.println("Login Successfull");
		System.out.println("Welcome"+u);
		}
	}
	else{
	System.out.println("Invalid credentials");
	}
	}
	
	public static void main(String avi[]){
	demo ob = new demo();
	ob.get();
	ob.show();
	}
	}
			

package org.test.task;


public class Task {
	int a=11;
	public void method1() {
		int a=30;
		System.out.println(a);
		int a2=this.a;
		System.out.println(a2);
//		this.a=a;
//		System.out.println(a);
	}
	
public static void main(String[] args) {
	Task s= new Task();
	int a2=s.a;
	System.out.println(a2);
	s.method1();
	System.out.println(s.a);
    
    
	

}
}

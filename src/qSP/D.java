package qSP;

public class D {

	public static void main(String[] args) {
		C c1=new C(0);
		c1.setValue(10);
		int j=c1.getValue();
		System.out.println(j);
		//c1.i=10; error
		//int j=c1.i; error
	}

}

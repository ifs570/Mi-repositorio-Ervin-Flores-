import java.util.*;
public class calculator {
	public static void main(String args[]) {
		int a,b;
		double c;
		Scanner scan=new Scanner(System.in);
		boolean d=true;
		String resp;
		while(d) {
			System.out.println("Ingrese primer numero: ");
			a=scan.nextInt();
			System.out.println("Ingrese segundo numero: ");
			b=scan.nextInt();
			System.out.println("Que operacion desea realizar: +, - ,* ,/");
			String oper=scan.next();
		if(oper.equals("+")) {
			c=a+b;
			System.out.println(a+"+"+b+"="+c);
			}
		else if(oper.equals("-")){
			c=a-b;
			System.out.println(a+"-"+b+"="+c);
		
		}
		else if(oper.equals("*")){
			c=a*b;
			System.out.println(a+"*"+b+"="+c);
		
		}
		else if(oper.equals("/")){
			if(b==0) {
				System.out.println("No se puede realizar una division entre 0");
			}else {
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
			}	
			}
		else {
			System.out.println("Operacion no valida");
			System.out.println("Ingrese una operacion valida");
		}
		System.out.println("Desea realizar otra operacion: s/n");
		resp=scan.next();
		if(resp.equals("s")) {
			d=true;
		}
		else if(resp.equals("n")) {
			d=false;
		}
		}
	}
}

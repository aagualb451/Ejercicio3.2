package Ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		
		
		
		
		//1
		System.out.println("lunes".matches("lunes"));
		//2
		System.out.println("sol".matches("[a-z][a-z][a-z]\\p{Lower}"));
		//3
		System.out.println("adios".matches("[^ñzx][^ñzx][^ñzx][^ñzx][^ñzx]"));
		//4
		System.out.println("nada".matches("[^0-9][a-z][a-z][a-z]"));
		//5
		System.out.println("a".matches("[a-z&&[^b]]"));
		//6
		System.out.println("655187442".matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"));
		//7
		System.out.println("123456789p".matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-z]"));
	}
}

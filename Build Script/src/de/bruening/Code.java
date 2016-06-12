package de.bruening;
/**
*	@author Eric Bruening
*	@version 0.1
**/

public class Code {

		public int min (int a, int b){
			// return a-b+1; mit fehler
			return a-b;
		}
		public int mult (int a, int b){
			return a*b;
		}
		public int add (int a, int b){
			return a+b;
		}
		public int div (int a, int b){
		if (b == 0) throw new IllegalArgumentException("Dividend = 0");//faengt b=0 ab
			return a/b;
		}
		
	}
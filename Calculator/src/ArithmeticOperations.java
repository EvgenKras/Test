
class ArithmeticOperations {
	
	static int addition(int a, int b) {return a + b;}
	static int subtraction(int a, int b) {return a - b;}
	static int multiplication(int a, int b) {return a * b;}
	static int division(int a, int b) {
		try {
			return a / b;
		}catch(ArithmeticException e) {
			System.out.println("Деление на ноль");			
			System.exit(0);
		}
		return 0;
		
	}
}

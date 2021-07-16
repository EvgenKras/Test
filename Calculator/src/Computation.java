import java.util.Scanner;

public class Computation {
	private boolean f = false;	//римские или арабские цифры
	private String c;			//операция
	private int a, b, result;
	
	public Computation() throws CheckInException {
		input();				//ввод данных
		result = checkOp(c);	//вычисление
		output(result);			//вывод данных
	}
			
	private void input() throws CheckInException {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		c = sc.next();
		s2 = sc.next();
		sc.close();
		checkInput(s1, s2);

	}

	private void checkInput(String s1, String s2) throws CheckInException {
		if(RomNum.checkNum(s1) && RomNum.checkNum(s2)) {
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			f = false;
		}else if(RomNum.checkRom(s1) && RomNum.checkRom(s2)) {
			a = RomNum.romToInt(s1);
			b = RomNum.romToInt(s2);
			f = true;
		}else {
			throw new CheckInException("Неправильный ввод данных");
		}
	}

	private int checkOp(String s) throws CheckInException {

		switch(s){
			case "+":
				return ArithmeticOperations.addition(a, b);			
			case "-":
				return ArithmeticOperations.subtraction(a, b);
			case "*":
				return ArithmeticOperations.multiplication(a, b);
			case "/":
				return ArithmeticOperations.division(a, b);
			default:
				throw new CheckInException("Недопустимая операция");
		}
	}
	
	private void output(int res) {
		if(f) {
			System.out.println(RomDec.intToRom(res) + RomNum.intToRom(res%10));
			
		}else {System.out.println(res);}
		
	}
	

}
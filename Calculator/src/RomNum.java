
enum RomNum {
	I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6),
	VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10);
	
	private int num;
	private String rn;
	
	RomNum(String rn, int num) {
		this.rn = rn;
		this.num = num;
	}
	
	private int getNum() {
		return num;		
	}
	
	private String getRn() {
		return rn;
	}
	
	static int romToInt(String rn) {
		for(RomNum r: RomNum.values()) {
			if(r.getRn().equals(rn)) {return r.getNum();}
		}
		return 0;
	}
	
	static String intToRom(int num) {
		for(RomNum r: RomNum.values()) {
			if(num == r.getNum()) {return r.getRn();}
		}
		return "";
	}
	
	static boolean checkNum(String s) {
		
		for(RomNum r: RomNum.values()) {
			if(s.equals(String.valueOf(r.getNum()))) {return true;}
		}
		return false;
	}
	
	static boolean checkRom(String s) {
		
		for(RomNum r: RomNum.values()) {
			if(s.equals(r.getRn())) {return true;}
		}
		return false;
	}
		
}


public enum RomDec {
	X("X", 10), XX("XX", 20), XXX("XXX", 30), XL("XL", 40), L("L", 50), LX("LX", 60),
	LXX("LXX", 70), LXXX("LXXX", 80), XC("XC", 90), C("C", 100);
	
	private String rn;
	private int n;
	
	RomDec(String str, int i) {
		rn = str;
		n = i;
	}

	private String getRn() {
		return rn;
	}

	private int getN() {
		return n;
	}
	static String intToRom(int num) {
		for(RomDec r: RomDec.values()) {
			if((num / 10 * 10) == r.getN()) {return r.getRn();}
		}
		return "";
	}
}

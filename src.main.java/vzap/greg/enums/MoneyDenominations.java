package vzap.greg.enums;

public enum MoneyDenominations
{
	R200(200),
	R100(100),
	R50(50),
	R20(20),
	R10(10),
	R5(5),
	R2(2),
	R1(1),
	C50(50),
	C20(20),
	C10(10),
	C5(5),
	C2(2),
	C1(1);
	
	private int value;
	
	private MoneyDenominations (int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	@Override
	public String toString()
	{
		switch(this)
		{
			case R200 : return "R200";
			case R100 : return "R100";
			case R50 : return "R50";
			case R20 : return "R20";
			case R10 : return "R10";
			case R5 : return "R5";
			case R2 : return "R2";
			case R1 : return "R1";
			case C50: return "50 cents";
			case C20: return "20 cents";
			case C10: return "10 cents";
			case C5: return "5 cents";
			case C2: return "2 cents";
			case C1: return "1 cents";
		}
		return "R0.00";
	}
}

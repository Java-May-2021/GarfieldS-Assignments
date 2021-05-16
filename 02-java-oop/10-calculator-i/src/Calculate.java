
public class Calculate {
	double OperandOne;
	double OPerandTwo;
	String OPeration;
	private double results;
	
	
	public double getresults() {
		return results;
	}
	public void setOperandOne(double OperandOne) {
		this.OperandOne = OperandOne;
	}
	
	public void setOPerandTwo(double oPerandTwo) {
		OPerandTwo = oPerandTwo;
	}
	public void setOPeration(String oPeration) {
		OPeration = oPeration;
	}
	
	//methods
	
	public void perfromOperation() {
		if (OPeration=="+") {
			results=OperandOne+OPerandTwo;			
		}
		else if(OPeration=="-") {
			results=OperandOne-OPerandTwo;
		} else {
			System.out.println("Operation not avaliabel");
		}
	}

}


public class Calculator {

	public static void main(String[] args) {
		Calculate Operation = new Calculate();
		
		Operation.setOPerandTwo(10.5);
		Operation.setOPeration("+");
		Operation.setOperandOne(5.2);
		
		Operation.perfromOperation();
		System.out.println(Operation.getresults());
		

	}

}

package Test1;

public class TotalButton extends Button {

	@Override
	void press(int value) {
		CU c=new CU();
		System.out.print("Total button pressed. ");
		c.checkTotal();
	}
		
	}



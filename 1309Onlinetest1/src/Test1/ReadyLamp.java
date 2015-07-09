package Test1;

public class ReadyLamp extends Lamp{

	@Override
	public void on() {
		System.out.println("RED LIGHT!The unit is switched on");
		
	}

	@Override
	public void off() {
		System.out.println("The unit is switched off");
		
	}

}

package Test1;

public class BU implements EVM{
Lamp ready;
	@Override
	public void enablePolling(Boolean isBusy) {
		System.out.println("You can vote now!!");
		isBusy=false;
	}

	@Override
	public void On(Boolean isReady) {
		// TODO Auto-generated method stub
		ready=new ReadyLamp();
		ready.on();
		
	}

}

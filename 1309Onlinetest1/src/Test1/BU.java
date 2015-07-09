package Test1;

public class BU implements EVM{
Lamp ready;
CandidateButton cb=new CandidateButton();
	@Override
	public void enablePolling(Boolean isBusy) {
		ready=new BusyLamp();
		ready.on();
		System.out.println("You can vote now!!");
		cb.press(3);
		isBusy=false;
		ready.off();
	}

	@Override
	public void On(Boolean isReady) {
		// TODO Auto-generated method stub
		ready=new ReadyLamp();
		ready.on();
		
	}

}

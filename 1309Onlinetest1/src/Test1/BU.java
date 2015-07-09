package Test1;

public class BU implements EVM{
Lamp ready;
CandidateButton cb=new CandidateButton();


	@Override
	public Boolean enablePolling(Boolean isBusy) {
		CandidateIDScreen ci=new CandidateIDScreen();	
		ci.display("BJP","AAP","Congress");
		ready=new BusyLamp();
		ready.on();
		System.out.println("You can vote now!!");
		cb.press(3);
		isBusy=false;
		ready.off();
		return isBusy;
	}

	@Override
	public void On(Boolean isReady) {
		// TODO Auto-generated method stub
		ready=new ReadyLamp();
		ready.on();
		
	}

}

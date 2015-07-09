package Test1;

public class CU implements EVM {
	static int soFarPolls; 
	BU b=new BU();
	OnLamp ol=new OnLamp();
	TotalButton tb=new TotalButton();
	Display d=new Display();
	
	 Boolean isReady,isEnable,isBusy;
	@Override
	public Boolean enablePolling(Boolean isReady) {
	
		if(isReady){
			isEnable=true;
			System.out.println("status of enability is "+ isEnable);
			isBusy=true;
			b.enablePolling(isBusy);
			System.out.println("Done");
			tb.press(0);
			isEnable=false;
			System.out.println("status of enability is "+ isEnable);
	}
		return isEnable;
	}
	
	public Boolean getIsReady() {
		return isReady;
	}
	public void setIsReady(Boolean isReady) {
		this.isReady = isReady;
	}

	@Override
	public void On(Boolean isReady) {
		if(isReady){
		 ol.on();
	     b.On(true);
		}
		
	}
	public int checkTotal(){
		soFarPolls=soFarPolls+1;
		d.show(soFarPolls);
		
		return soFarPolls;
	}
	
	

}

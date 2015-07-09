package Test1;

public class CU implements EVM {
	BU b=new BU();
	OnLamp ol=new OnLamp();
	 Boolean isReady,isEnable,isBusy;
	@Override
	public void enablePolling(Boolean isReady) {
		if(isReady){
		
			isEnable=true;
			isBusy=true;
			b.enablePolling(isBusy);
			System.out.println("Done");
		}
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

}

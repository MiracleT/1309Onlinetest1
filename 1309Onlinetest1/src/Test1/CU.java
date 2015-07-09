package Test1;

public class CU implements EVM {
	BU b;
	Boolean isReady;
	@Override
	public void enablePolling(Boolean isReady) {
		if(isReady){
			b=new BU();
			b.enablePolling(isReady);
		}
	}
	public Boolean getIsReady() {
		return isReady;
	}
	public void setIsReady(Boolean isReady) {
		this.isReady = isReady;
	}

}

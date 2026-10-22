class Batch{
	private int batchName;
	private int batchStatus;
	
	Batch(int batchName, int batchStatus){
		this.batchName = batchName;
		this.batchStatus = batchStatus;
	}
	
	public int getBatchStatus(){
		return batchStatus;
	}
	
	public int getBatchName(){
		return batchName;
	}
	
	public void setStatus(int batchStatus){
		this.batchStatus = batchStatus;
	}
	
	@Override
	public String toString(){
		return batchName+" "+batchStatus;
	}
}

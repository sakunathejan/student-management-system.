import java.util.Arrays;
class BatchCollection{
	
	//Batch Reference Array
	public static Batch[] batchArray = new Batch[]{
		new Batch(105, 0),
		new Batch(106, 0),
		new Batch(107, 0),
		new Batch(108, 0),
		new Batch(109, 1),
		new Batch(110, 1),
	};
	
	//Check wheather the batch is open or not
	public static boolean isValid(int batchNum){
		for (int i = 0; i < batchArray.length; i++){
			if(batchArray[i].getBatchName()== batchNum){
				if(batchArray[i].getBatchStatus() == 0){
					return true;
				}
			}
		}
		return false;
		
	}
	
	public static boolean isAvailable(String batchNo){
		
		//int batchNumber = Integer.parseInt(batchNo);		
		
		for (int i = 0; i < batchArray.length; i++){
			
			String batchNumber = Integer.toString(batchArray[i].getBatchName());
			
			if( batchNumber.equals(batchNo)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean saveBatchArray(String batchNum){
		Batch [] tempBatchArray = new Batch[batchArray.length + 1];
		int batchNumber = Integer.parseInt(batchNum);
		
		for (int i = 0; i < batchArray.length; i++){
			tempBatchArray[i] = batchArray[i];			
		}
		tempBatchArray[tempBatchArray.length - 1] = new Batch(batchNumber, 1);
		batchArray = tempBatchArray;
		System.out.println(Arrays.toString(batchArray));
		return true;
		
	}
	
	public static int checkStatus(String batchNum){
		int batchNumber = Integer.parseInt(batchNum);
		
		for (int i = 0; i < batchArray.length; i++){
			if(batchNumber == batchArray[i].getBatchName()){
				return batchArray[i].getBatchStatus();
			}
		}
		return -1;
	}
	
	
	public static void setStatus(int status, String batchNum){
		//int batchNumber = StudentCollection.getBatchNumberRegNo(batchNum);
		int batchNumber = Integer.parseInt(batchNum);
		
		for (int i = 0; i < batchArray.length; i++){
			if(batchNumber == batchArray[i].getBatchName()){
				if(batchArray[i].getBatchStatus() != status){
					batchArray[i].setStatus(status);
				}
			}
		}
		System.out.println(Arrays.toString(batchArray));
		
	}
	
	
	
	
}

class Student{
	private String regNo;
	private String studentName;
	private String studentNic;
	private int prfMarks;
	private int dbmsMarks;
	
	Student(String regNo,  String studentName, String studentNic, int prfMarks, int dbmsMarks){
		this.regNo = regNo;
		this.studentName = studentName;
		this.studentNic = studentNic;		
		this.prfMarks = prfMarks;
		this.dbmsMarks = dbmsMarks;
	}
	
	//SETTERS
	
	public void setStudentNewNic(String updatedNic){
		this.studentNic = updatedNic;
	}
	
	public void setStudentNewName(String updatedName){
		this.studentName = updatedName;
	}
	
	public void setPrfMarks(int prfMarks){
		this.prfMarks = prfMarks;
	}
	
	public void setDbmsMarks(int dbmsMarks){
		this.dbmsMarks = dbmsMarks;
	}
	
	
	//GETTERS
	
	public String getNic(){
		return studentNic;
	}
	
	public String getRegNo(){
		return regNo;
	}
	
	public String getStuName(){
		return studentName;
	}
	
	public int getPrfMarks(){
		return prfMarks;
	}
	
	public int getDbmsMarks(){
		return dbmsMarks;
	}
	
	
	@Override
	public String toString(){
		return regNo+" "+studentName+" "+studentNic+" "+prfMarks + " " + dbmsMarks;
	}

}

class AccessStudentCollection{
	private static AccessStudentCollection accessStudentCollection;
	private static StudentCollection studentCollection;
	
	private AccessStudentCollection(){
		studentCollection = new StudentCollection();
	}
	
	public static AccessStudentCollection getInstance(){
		if(accessStudentCollection==null){
			accessStudentCollection=new AccessStudentCollection();
		}
		return accessStudentCollection;
	}

	
	public StudentCollection getStudentCollection(){
		return studentCollection;
	}
}

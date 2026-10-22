import java.util.*;

class StudentCollection{
	//Student Reference Object Array
	public static Student[] studentArray = new Student[]{
		new Student("PR24105001", "Gunawardena Weerasinghe", "199501012345", 85, 66),
		new Student("PR24105002", "Senanayake Silva", "199503153872", 39, 45),
		new Student("PR24105003", "Silva Kumara", "199506202198", -1, 93),
		new Student("PR24105004", "Kumara Herath", "199509102983", 72, 58),
		new Student("PR24105005", "Rathnayake Herath", "199511258739", 44, -1),
		new Student("PR24105006", "Wijesinghe Bandara", "199512303498", 91, 37),
		new Student("PR24105007", "Rajapaksha Herath", "199502183764", 60, 88),
		new Student("PR24105008", "Senanayake Karunaratne", "199504223198", 38, 21),
		new Student("PR24105009", "Karunaratne Jayasinghe", "199508153210", 95, 79),
		new Student("PR24105010", "Gunawardena Silva", "199510293417", 49, 40),

		new Student("OR24105011", "Weerasinghe Rajapaksha", "199601102375", -1, 76),
		new Student("OR24105012", "Silva Rathnayake", "199604182938", 67, 54),
		new Student("OR24105013", "Fernando Perera", "199606243879", 23, -1),
		new Student("OR24105014", "Kumara Abeysekera", "199608142178", 58, 69),
		new Student("OR24105015", "Ekanayake Rathnayake", "199610312475", 88, 92),
		new Student("PR24105016", "Herath Gunawardena", "199611173452", 81, 25),
		new Student("PR24105017", "Abeysekera Silva", "199603293481", 73, 84),
		new Student("PR24105018", "Weerasinghe Silva", "199605083217", 29, 33),
		new Student("OR24105019", "Jayasinghe Dias", "199607232198", 62, 60),
		new Student("OR24105020", "Bandara Rathnayake", "199609192375", -1, 71),
		new Student("PR24105021", "Silva Perera", "199701212483", 79, 59),
		new Student("PR24105022", "De Silva Dias", "199703132487", 53, -1),
		new Student("OR24105023", "Abeysekera Jayasinghe", "199706253478", 94, 98),
		new Student("OR24105024", "Rajapaksha Senanayake", "199708083298", 47, 27),
		new Student("PR24105025", "Kumara Karunaratne", "199710243651", 35, 48),

		new Student("PR24106001", "Silva Abeysekera", "199712152983", 93, 35),
		new Student("PR24106002", "Jayasinghe Bandara", "199702182734", 15, 91),
		new Student("PR24106003", "Rathnayake Kumara", "199704293187", -1, 60),
		new Student("PR24106004", "Weerasinghe Rajapaksha", "199705142375", 82, -1),
		new Student("PR24106005", "Senanayake Herath", "199709083751", 45, 72),
		new Student("PR24106006", "Perera Ekanayake", "199801032874", 88, 49),
		new Student("PR24106007", "Herath Jayasinghe", "199803232871", 23, 26),
		new Student("PR24106008", "Kumara Gunawardena", "199806193428", 79, 80),
		new Student("PR24106009", "Abeysekera Silva", "199808013764", 37, 14),
		new Student("PR24106010", "Dias Fernando", "199810242374", -1, 89),
		new Student("OR24106011", "Karunaratne Weerasinghe", "199812302984", 68, 67),
		new Student("OR24106012", "Ekanayake Bandara", "199802152348", 100, -1),
		new Student("OR24106013", "Rajapaksha Kumara", "199805213471", 59, 31),
		new Student("OR24106014", "Silva De Silva", "199807172398", 29, 94),
		new Student("OR24106015", "Gunawardena Rathnayake", "199811283472", 92, 53),
		new Student("PR24106016", "Bandara Karunaratne", "199901122471", 12, 78),
		new Student("PR24106017", "Fernando Perera", "199903052984", 77, 5),
		new Student("PR24106018", "De Silva Silva", "199906213874", 38, 90),
		new Student("OR24106019", "Rajapaksha Gunawardena", "199908093412", 66, 24),
		new Student("OR24106020", "Herath Weerasinghe", "199910273894", 9, 86),
		new Student("PR24106021", "Karunaratne Dias", "199912153482", 84, 39),
		new Student("PR24106022", "Jayasinghe Silva", "199902202394", 51, -1),
		new Student("OR24106023", "Senanayake Abeysekera", "199904163874", 32, 61),
		new Student("OR24106024", "Silva Jayasinghe", "199907293481", -1, 73),
		new Student("PR24106025", "Rathnayake Kumara", "199911083479", 97, 100),

		new Student("PR24107001", "Gunawardena Kumara", "200001112374", 95, 38),
		new Student("PR24107002", "Rajapaksha Silva", "200003143478", -1, 91),
		new Student("PR24107003", "Perera Jayasinghe", "200006293874", 63, -1),
		new Student("PR24107004", "Silva Ekanayake", "200008103471", 88, 74),
		new Student("PR24107005", "Dias Senanayake", "200010252984", 32, 55),
		new Student("PR24107006", "Herath Abeysekera", "200012043894", 76, 82),
		new Student("PR24107007", "Rathnayake Fernando", "200002193874", 97, 66),
		new Student("PR24107008", "Kumara Herath", "200004212374", 54, 49),
		new Student("PR24107009", "Weerasinghe Silva", "200005183492", -1, 99),
		new Student("PR24107010", "Senanayake Karunaratne", "200007153871", 23, 13),
		new Student("OR24107011", "Abeysekera Silva", "200101232984", 90, 80),
		new Student("OR24107012", "Bandara Gunawardena", "200103083471", 35, 70),
		new Student("OR24107013", "Karunaratne Weerasinghe", "200106273894", 81, 93),
		new Student("OR24107014", "Perera Herath", "200108123984", 61, 36),
		new Student("OR24107015", "Fernando Dias", "200110043728", 44, 59),
		new Student("PR24107016", "Weerasinghe Gunawardena", "200112213874", 67, 85),
		new Student("PR24107017", "Rathnayake Kumara", "200102253471", 100, 47),
		new Student("PR24107018", "Senanayake Fernando", "200104103874", 17, 90),
		new Student("OR24107019", "Silva Bandara", "200105293784", 85, -1),
		new Student("OR24107020", "Herath Rajapaksha", "200107202983", 29, 22),
		new Student("PR24107021", "Kumara Jayasinghe", "200201013874", 70, 77),
		new Student("PR24107022", "Abeysekera Perera", "200203253471", 42, 34),
		new Student("OR24107023", "Rathnayake Jayasinghe", "200206143874", -1, 63),
		new Student("OR24107024", "Kumara Weerasinghe", "200208083471", 60, 100),
		new Student("PR24107025", "Rajapaksha Ekanayake", "200210293874", 86, 29),

		new Student("PR24108001", "Fernando Rajapaksha", "200212183471", 86, 79),
		new Student("PR24108002", "Silva Gunawardena", "200202103874", 57, 62),
		new Student("PR24108003", "Perera Wijesinghe", "200204123894", 91, 87),
		new Student("PR24108004", "Herath Abeysekera", "200205283471", 35, -1),
		new Student("PR24108005", "Rajapaksha Ekanayake", "200207153874", -1, 54),
		new Student("PR24108006", "Karunaratne Silva", "200301093874", 76, 46),
		new Student("PR24108007", "Weerasinghe Fernando", "200303283471", 48, 99),
		new Student("PR24108008", "Silva Bandara", "200306153874", 94, 39),
		new Student("PR24108009", "Abeysekera Weerasinghe", "200308123471", 23, 70),
		new Student("PR24108010", "Kumara Karunaratne", "200310083874", 69, -1),
		new Student("OR24108011", "Dias Rajapaksha", "200312243471", 80, 75),
		new Student("OR24108012", "Herath Perera", "200302273874", 55, 83),
		new Student("OR24108013", "Rathnayake Gunawardena", "200304203471", 88, 58),
		new Student("OR24108014", "Ekanayake Jayasinghe", "200305123874", 32, 92),
		new Student("OR24108015", "Gunawardena Silva", "200307213471", 100, 30),
		new Student("PR24108016", "Rajapaksha Perera", "200401153874", 67, 91),
		new Student("PR24108017", "Karunaratne Jayasinghe", "200403123471", 43, 40),
		new Student("PR24108018", "Weerasinghe Abeysekera", "200406293874", -1, 63),
		new Student("OR24108019", "Rathnayake Fernando", "200408083471", 90, 95),
		new Student("OR24108020", "Kumara Herath", "200410213874", 60, 68),
		new Student("PR24108021", "Silva Weerasinghe", "200412153471", 77, -1),
		new Student("PR24108022", "Herath Karunaratne", "200402203874", 25, 66),
		new Student("OR24108023", "Abeysekera Silva", "200404273471", 71, 21),
		new Student("OR24108024", "Gunawardena Ekanayake", "200405143874", 84, 88),
		new Student("PR24108025", "Weerasinghe Kumara", "200407183471", 92, 37),

		new Student("PR24109001", "Weerasinghe Kumara", "200501023874", 68, 67),
		new Student("PR24109002", "Rajapaksha Abeysekera", "200503193471", 63, 91),
		new Student("PR24109003", "Gunawardena Perera", "200506153874", 88, 85),
		new Student("PR24109004", "Karunaratne Silva", "200508213471", 75, 73),
		new Student("PR24109005", "Herath Wijesinghe", "200510083874", 90, 70),
		new Student("PR24109006", "Rathnayake Ekanayake", "200512293471", 57, 63),
		new Student("PR24109007", "Silva Fernando", "200502123874", 79, 76),
		new Student("PR24109008", "Abeysekera Rajapaksha", "200504153471", 92, 88),
		new Student("PR24109009", "Fernando Bandara", "200505283874", 62, 55),
		new Student("PR24109010", "Perera Herath", "200507173471", 100, 64),

		new Student("OR24109011", "Weerasinghe Jayasinghe", "200203456782", -2, 79),
		new Student("OR24109012", "Silva Karunaratne", "200305678901", -2, 80),
		new Student("OR24109013", "Rathnayake Gunawardena", "199601234567", -2, 59),
		new Student("OR24109014", "Herath Kumara", "199511223344", -2, 92),
		new Student("OR24109015", "Abeysekera Silva", "200412345678", -2, 68),
		new Student("PR24109016", "Ekanayake Bandara", "200512345678", -2, 100),
		new Student("PR24109017", "Rajapaksha Fernando", "199909876543", -2, 77),
		new Student("PR24109018", "Gunawardena Weerasinghe", "199812346789", -2, 83),
		new Student("OR24109019", "Kumara Karunaratne", "200010203040", -2, 45),
		new Student("OR24109020", "Silva Dias", "200608789012", -2, 62),
		new Student("PR24109021", "Perera Weerasinghe", "200012345678", -2, 66),
		new Student("PR24109022", "Karunaratne Rajapaksha", "199812345679", -2, 59),
		new Student("OR24109023", "Jayasinghe Silva", "199902345678", -2, 78),
		new Student("OR24109024", "Rathnayake Perera", "199712345670", -2, 85),
		new Student("PR24109025", "Silva Ekanayake", "200102345671", -2, 56),

		new Student("PR24110001", "Silva Karunaratne", "200203456782", -2, -2),
		new Student("PR24110002", "Herath Fernando", "200305678901", -2, -2),
		new Student("PR24110003", "Kumara Jayasinghe", "199601234567", -2, -2),
		new Student("PR24110004", "Weerasinghe Perera", "199511223344", -2, -2),
		new Student("PR24110005", "Abeysekera Rajapaksha", "200412345678", -2, -2),
		new Student("PR24110006", "Rathnayake Karunaratne", "200512345678", -2, -2),
		new Student("PR24110007", "Ekanayake Bandara", "199909876543", -2, -2),
		new Student("PR24110008", "Gunawardena Perera", "199812346789", -2, -2),
		new Student("PR24110009", "Silva Wijesinghe", "200010203040", -2, -2),
		new Student("PR24110010", "Rajapaksha Jayasinghe", "200608789012", -2, -2),
		new Student("OR24110011", "Rathnayake Fernando", "200012345678", -2, -2),
		new Student("OR24110012", "Karunaratne Kumara", "199812345679", -2, -2),
		new Student("OR24110013", "Perera Silva", "199902345678", -2, -2),
		new Student("OR24110014", "Gunawardena Ekanayake", "199712345670", -2, -2),
		new Student("OR24110015", "Bandara Rajapaksha", "200102345671", -2, -2),
		new Student("PR24110016", "Silva Herath", "200203456782", -2, -2),
		new Student("PR24110017", "Rathnayake Weerasinghe", "200305678901", -2, -2),
		new Student("PR24110018", "Perera Gunawardena", "199601234567", -2, -2),
		new Student("OR24110019", "Herath Karunaratne", "199511223344", -2, -2),
		new Student("OR24110020", "Silva Rajapaksha", "200412345678", -2, -2),
		new Student("PR24110021", "Ekanayake Kumara", "200512345678", -2, -2),
		new Student("PR24110022", "Bandara Herath", "199909876543", -2, -2),
		new Student("OR24110023", "Weerasinghe Rajapaksha", "199812346789", -2, -2),
		new Student("OR24110024", "Karunaratne Abeysekera", "200010203040", -2, -2),
		new Student("PR24110025", "Perera Dias", "200012345678", -2, -2)
	};
	
	//Check wheather the student is already in the system
	public static boolean isDuplicate(String studentNic){
		for (int i = 0; i < studentArray.length; i++){
			if(studentArray[i].getNic().equals(studentNic)){
				return true;
			}
		}
		return false;
		
	}
	
	//Reg No generation
	public static String regNumGenarator(int batchNumber, String lectureMode){
	
		int batchNum = 0;
		int batchIndex = 0;
		
		String prefix = ("PHYSICAL".equals(lectureMode)) ? "PR" : "OR";
		
		for (int i = 0; i < studentArray.length ; i++){
			if(studentArray[i] != null){
				String regNo = studentArray[i].getRegNo();
				
				if(regNo != null){
					batchNum = Integer.parseInt(regNo.substring(4, 7));
			
					if(batchNum == batchNumber){
						batchIndex++;			
					}
				}
			}		
		}
		
		batchIndex += 1;
		String formattedStudentNo = String.format("%03d", batchIndex);
		
		return prefix + "24" + batchNumber + formattedStudentNo;
	}
	
	
	//Add new student
	public static boolean addNewStudent(Student student){
		Student tempStudentDetailArray [] = new Student[studentArray.length + 1];
		
		for (int i = 0; i < studentArray.length; i++){
			tempStudentDetailArray[i] = studentArray[i];	
		}
		tempStudentDetailArray[tempStudentDetailArray.length - 1] = student;		
		studentArray = tempStudentDetailArray;
		
		System.out.println(Arrays.toString(studentArray));
		return true;
		
		
	}
	
	
	//Reg No Duplicate Check
	public static boolean isAvailable(String regNo){
		for (int i = 0; i < studentArray.length ; i++){
			if(studentArray[i].getRegNo().equals(regNo)){
				return true;
			}
		}
		return false;	
		
	}
	
	public static boolean deleteStudent(String regNo){
		Student [] tempArray = new Student[studentArray.length - 1];
		
		int index = findIndex(regNo);
		
		for (int i = 0, j=0; i < studentArray.length; i++){
			if(i == index){
				continue;
			}
			tempArray[j] = studentArray[i];
			j++;
		}
		studentArray = tempArray;
		return true;
		
	}
	
	//Find index
	public static int findIndex(String regNo){		
		for (int i = 0; i < studentArray.length; i++){
			if(studentArray[i] != null){
				if(regNo.equals(studentArray[i].getRegNo())){
					return i;
				}
			}
		}
		return -1;
		
	}
	
	//Set the new student nic (UPDATE STUDENT NIC)
	public static boolean updateNicArray(String updatedNic, String regNo){
		
		int index = findIndex(regNo);
		
		if(index == -1){
			return false;
		}
		
		studentArray[index].setStudentNewNic(updatedNic);
		
		System.out.println(Arrays.toString(studentArray));
		return true;
		
		
		
	}
	
	//Set the new student name (UPDATE STUDENT NAME)
	public static boolean updateNameArray(String regNo, String updatedName){
		
		int index = findIndex(regNo);
		
		if(index == -1){
			return false;
		}
		
		studentArray[index].setStudentNewName(updatedName);
		
		System.out.println(Arrays.toString(studentArray));
		return true;
		
		
		
	}
	
	//Search studnet and return the object
	public static Student searchStudent(String id){
		for (int i = 0; i < studentArray.length; i++){
			if(id.equalsIgnoreCase(studentArray[i].getRegNo())){
				return studentArray[i];
			}
		}
		return null;
	}
	
	//Calculate GPA
	public static double calculateGPA(int marks){
		
		if(marks < 0){
			return 0.00;
		}else{
			if(marks >= 90){
				return 4.25;
			}else if(marks >= 80){
				return 4.00;
			}else if(marks >= 75){
				return 3.70;
			}else if(marks >= 70){
				return 3.30;
			}else if(marks >= 65){
				return 3.00;
			}else if(marks >= 60){
				return 2.70;
			}else if(marks >= 55){
				return 2.30;
			}else if(marks >= 50){
				return 2.00;
			}else if(marks >= 45){
				return 1.70;
			}else if(marks > 40){
				return 1.30;
			}else if(marks >= 30){
				return 1.00;
			}else if(marks >= 20){
				return 0.70;
			}
			return 0.0;
		}
		
		
		
	}
	
	//Overall GPA
	public static double calculateOverallGpa(int prfMarks, int dbmsMarks){
		double prfGpa = calculateGPA(prfMarks);
		double dbmsGpa = calculateGPA(dbmsMarks);
		
		return (prfGpa + dbmsGpa) / 2.0;
	}

	//Get batch from Reg Num
	public static int getBatchNumberRegNo(String regNo){
		String batchPart = regNo.substring(4, 7);
		return Integer.parseInt(batchPart);
	}
	
	//Count students in batch
	public static int countStudentInBatch(String batchNum){
		int batchNumber = Integer.parseInt(batchNum);
		int count = 0;		
		
		for(int i=0; i<studentArray.length; i++){
			int batchOfStudent = getBatchNumberRegNo(studentArray[i].getRegNo());
			
			if(batchOfStudent == batchNumber){
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
}













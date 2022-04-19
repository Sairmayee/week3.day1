package week3.day1;

public class Students {
	
	public void getStudentInfo(int id, String name) {
		System.out.println("ID - "+id);
		System.out.println("Name - "+name);
		
	}
	
	public void getStudentInfo(String email, Long phone) {
		System.out.println("Email - "+email);
		System.out.println("Phone -"+phone);
	}
	
	public static void main(String[] args) {
		Students getinfo = new Students();
		getinfo.getStudentInfo(732,"Sairmayee");
		getinfo.getStudentInfo("sairmayee@gmail.com",9885888188L);
		

	}

}

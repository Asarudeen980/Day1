package day1_datatypes;

public class StudentMark {
	public static void main(String[]args) {
		String name="Asarudeen";
		int rollNumber=14002;
		int tamilMark=89;
		int englishMark=78;
		int mathsMark=89;
		int scienceMark=98;
		int socialMark=88;
		int totalMark=tamilMark+englishMark+mathsMark+scienceMark+socialMark;
		int average=totalMark/5;
		System.out.println("Name :"+name+" Roll Number :"+rollNumber+" Average :"+average);
	}

}

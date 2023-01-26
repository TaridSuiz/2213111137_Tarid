package ex10;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student fs = new Student("First Student","1 nova");
		System.out.println(fs);
		
		fs.setAddress("sss");
		System.out.println(fs);
		System.out.println(fs.getName());
		System.out.println(fs.getAddress());
		
		fs.addCourseGrade("INT107",25);
		fs.addCourseGrade("INT108",79);

		fs.addCourseGrade("MSC202",69);
		fs.printGrade();
		
		System.out.printf("The average grade is %.2f \n",fs.getAverageGrade());

	}

}

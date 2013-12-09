public class UseTeacher {
	public static void main(String[] args){
		UseTeacher ut = new UseTeacher();
		ut.launch();
	}
	public void launch(){
		Lecturer sir = new Lecturer("Socrates");
		sir.doResearch("C++ programming");
		sir.teach("Piano");
		System.out.println("The name of your lecturer is " + sir.getName());
	}
}
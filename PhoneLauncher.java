public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
		SmartPhone myPhone = new SmartPhone("HTC");
		myPhone.browseWeb("www.guardian.co.uk");
		System.out.println(myPhone.findPosition());
		myPhone.ringAlarm("Get the hell up!!!");
		myPhone.playGame("Words with Friends");
		myPhone.addLastNum(8090);
		myPhone.addLastNum(4717178);
		myPhone.addLastNum(4967833);
		myPhone.addLastNum(111);
		myPhone.addLastNum(999);
		myPhone.addLastNum(40732);
		myPhone.printLastNumbers();
		myPhone.call("286644");
		myPhone.call("00643853255");
		System.out.println(myPhone.getBrand());
	}
}
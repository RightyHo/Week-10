public class EvenNums extends String {
	private String entireStr;

	public EvenNums(String entireStr){
		super();
		this.entireStr = entireStr;
	}
	public void printEven(){
		for(int i=0;i<entireStr.length();i++){
			if(i%2 == 1){
				System.out.print(entireStr.substring(i,i+1));
			}
		}
	}
}
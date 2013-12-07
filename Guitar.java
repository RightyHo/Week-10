public class Guitar {
	public static void main(String[] args){
		Guitar lead = new Guitar();
		lead.launch();
	}
	public void launch(){
		MusicalInstrument music = new MusicalInstrument();
		WoodenObject wood = new WoodenObject();
		music.play();
		wood.burn();
	}
}
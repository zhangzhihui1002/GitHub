

public class ClientClass {
	public static void main(String[] args){
		//Factory factor=new WFactory();
		Factory factor=(Factory)XMLUtil.getBean();
		Gamerole gamerole=factor.CreateGamerole();
		gamerole.play();
	}
	public String factory(String gamerolename){
		if(gamerolename.equals("Warrior")) 
			return "Warrior";
		if(gamerolename.equals("Mage")) 
			return "Mage";
		return null;
	}
}


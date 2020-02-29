package yuanxing;

public class Client {
	public static void main(String[] args)throws CloneNotSupportedException{
		Sheep sheep=new Sheep("tom",1,"°×É«");
		Sheep sheep1=(Sheep) sheep.clone();
		System.out.println(sheep.toString());
		System.out.println(sheep1.toString());
		System.out.println(sheep.hashCode()+","+sheep1.hashCode());

	}

}

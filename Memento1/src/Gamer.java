
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {

    private static  String[] FruitsSame={"�㽶","ƻ��","����","����"};
    
    private int menoy;
    private List fruits=new ArrayList();
    private  Random random=new Random();
    
    public int getMenoy(){
        return menoy;
    }
    
    public Gamer(int menoy){
        this.menoy=menoy;
    }
    
    public void bet(){
        int next=random.nextInt(6)+1;
        if(next==1){
            menoy+=100;
            System.out.println("��Ǯ������100,��ǰ��ǮΪ��"+menoy);
        }else if(next==2){
            menoy/=2;
            System.out.println("��Ǯ������һ�룬��ǰ��ǮΪ��"+menoy);
        }else if(next==6){
            String f=getFruit();
            fruits.add(f);
            System.out.println("�����ˮ��:"+f+"����ǰ��ǮΪ��"+menoy);
        }else {
            System.out.println("��Ǯû�з����ı䣬��ǰ��ǮΪ��"+menoy);
        }
    }
    
    private String getFruit() {

        String prefix="";
        if(random.nextBoolean()){
            prefix="�óԵ�";
        }
        return prefix+FruitsSame[random.nextInt(FruitsSame.length)];
        
    }
    
    public Memento createMemento(){
        Memento m=new Memento(menoy);
        Iterator it=fruits.iterator();
        while(it.hasNext()){
            String fruit=(String)it.next();
            if(fruit.startsWith("�óԵ�")){
                m.addFruits(fruit);
            }
        }
        return m;
    }
    
    public  void restoreMemento(Memento memento){
        this.menoy=memento.getMenoy();
        this.fruits=memento.getFruits();
    }
    
    public String toString(){
        return "Menoy��"+menoy+" ,Fruits:"+fruits;
    }
    
}
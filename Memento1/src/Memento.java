
import java.util.ArrayList;
import java.util.List;

public class Memento {
    
    private int menoy;
    private ArrayList fruits;

    //խ�ӿڣ����ʲ�����Ϣ
    public int getMenoy(){
        return menoy;
    }
    
    //��ӿڣ�����֮�ڽԿɷ���
    Memento(int menoy){
        this.menoy=menoy;
        fruits=new ArrayList();//ÿ�ε��õ�ʱ���������ɣ�����Ҫ
    }
    //��ӿڣ�����֮�ڽԿɷ���
    List getFruits(){
        return (List) fruits.clone();
    }
    //��ӿڣ�����֮�ڽԿɷ���
    void  addFruits(String fruit){
        fruits.add(fruit);
    }

}

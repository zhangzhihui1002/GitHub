

public class Main {

    public static void main(String[] args) {
        Gamer gamer=new Gamer(100);
        Memento memento=gamer.createMemento();
        for(int i=0;i<100;i++){
            System.out.println("��ǰ״̬��"+i);
            System.out.println("��ǰ��"+gamer.getMenoy());
            gamer.bet();
            if(gamer.getMenoy()<memento.getMenoy()/2){
                System.out.println("��Ǯ���٣��ָ�����ǰ��״̬��");
                gamer.restoreMemento(memento);
                System.out.println("��ʱ״̬Ϊ��"+gamer);
            }else if(gamer.getMenoy()>memento.getMenoy()){
                System.out.println("��Ǯ���࣬���浱ǰ״̬��");
                memento=gamer.createMemento();
                System.out.println("��ʱ״̬Ϊ��"+gamer);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
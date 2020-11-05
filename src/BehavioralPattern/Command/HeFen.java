package BehavioralPattern.Command;

//具体实现的命令类
public class HeFen implements Breakfast {
    private HeFenChef receiver;

    HeFen(){
        this.receiver = new HeFenChef();
    }
    @Override
    public void cooking() {
        receiver.cooking();
    }
}

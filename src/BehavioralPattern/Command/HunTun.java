package BehavioralPattern.Command;


public class HunTun implements Breakfast {
    private HunTunChef receiver;

    HunTun(){
        receiver = new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}

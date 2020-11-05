package BehavioralPattern.Command;

//调用者：服务员
public class Waiter {
    private Breakfast changFen, hunTun,heFen;


    public void setChangFen(Breakfast changFen) {
        this.changFen = changFen;
    }

    public void chooseChangFen() {
        changFen.cooking();
    }


    public void setHunTun(Breakfast hunTun) {
        this.hunTun = hunTun;
    }

    public void chooseHunTun(){
        hunTun.cooking();
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }

    public void chooseHeFen(){
        heFen.cooking();
    }
}

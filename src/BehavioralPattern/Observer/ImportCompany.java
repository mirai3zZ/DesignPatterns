package BehavioralPattern.Observer;

public class ImportCompany implements Company{
    @Override
    public void response(int number) {
        int num = number*2;
        System.out.println("进口公司修改汇率: " + num);
    }
}

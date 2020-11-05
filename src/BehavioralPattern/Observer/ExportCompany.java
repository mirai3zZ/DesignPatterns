package BehavioralPattern.Observer;

public class ExportCompany implements Company{
    @Override
    public void response(int number) {
        int num = number/2;
        System.out.println("出口公司的汇率改变： " + num);

    }
}

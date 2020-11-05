package BehavioralPattern.Observer;

public class RMBrate extends Rate{
    @Override
    void change(int number) {
        for (Company obs:companyList){
            obs.response(number);
        }
    }
}

package BehavioralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

//抽象目标
abstract class Rate {
    protected List<Company> companyList = new ArrayList<Company>();

    //增加观察者方法
    public void addCompany(Company company) {
        companyList.add(company);
    }
    //删除观察者方法
    public void removeCompany(Company company) {
        companyList.remove(company);
    }


    abstract void change(int number);//通知观察者方法
}

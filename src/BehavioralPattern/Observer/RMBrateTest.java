package BehavioralPattern.Observer;

public class RMBrateTest {
    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company iCompany = new ImportCompany();
        Company eCompany = new ExportCompany();

        rate.addCompany(iCompany);
        rate.addCompany(eCompany);

        rate.change(10);
    }
}

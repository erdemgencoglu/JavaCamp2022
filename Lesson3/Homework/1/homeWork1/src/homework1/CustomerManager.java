package homework1;

public class CustomerManager {

    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager) {
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }

    public void save(int id, String firstName, String lastname, String nationalIdentity) {
        System.out.println("Müşteri kaydedildi");
    }

    public void save(Customer customer) {
        System.out.println("Müşteri kaydedildi :");
    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi :");
    }

    public void giveCredit() {
        iCreditManager.calculate();
    }
}

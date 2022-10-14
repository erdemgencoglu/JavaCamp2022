package homework1;

public class HomeWork1 {

    public static void main(String[] args) {
        /*
        // Değer tipine örnek
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        //Referans tipine örnek
        int[] sayilar1 = {1, 2, 3};
        int[] sayilar2 = {10, 20, 30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]);
         */
        CreditManager creditManager = new CreditManager();//new methodundan hemen anla referans tipi
        creditManager.calculate();
        creditManager.save();

        Customer cm = new Customer();
        cm.id = 1;
        //cm.firstName = "Engin";
        //cm.lastName = "Demiroğ";
        //cm.nationalIdentity = "123456";

        //CustomerManager customerManager = new CustomerManager(cm);//instance creation(Örnek oluşturduğumda bellekte referansı oluşmuş olur)
        //Bu methodtaki ekstra bir parametre eklenmesi ile yapılacak değişiklik tüm kodlarda bunu ifadeyi içeren heryerde problem oluşturur
        //Bu durumda polimorphism akla gelmelidir.
        //customerManager.save(1, "Engin", "Demiroğ", "123456");
        //customerManager.save(cm);
        //customerManager.delete(cm);
        Company company = new Company();
        company.taxNumber = "10000";
        company.companyName = "Arçelik";
        company.id = 100;

        Person person = new Person();
        person.nationalIdentity = "123456";

        //inheritance -> referans tipidir.
        // CustomerManager customerManager2 = new CustomerManager(new Person());
        //CustomerManager customerManager3 = new CustomerManager(new Company());
        //
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();

        //Interface sayesinde Military ve Teacher için ayrı ayrı referanslarını tutabildiğinden 
        //ayrı ayrı verip tek metotda ayrı işlemleri gerçekleştirmiş olduk.
        CustomerManager customerManager = new CustomerManager(cm, new MilitaryCreditManager());
        customerManager.giveCredit();
        CustomerManager customerManager2 = new CustomerManager(cm, new TeacherCreditManager());
        customerManager2.giveCredit();
        
        //Aynı zamanda polimorfizime örnektir credtManagerı farklı biçimlerde kullanmış oluyoruz 
        //bir class birden fazla Abstract class implement edemez
    }

}

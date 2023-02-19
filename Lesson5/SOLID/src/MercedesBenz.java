public class MercedesBenz  extends BaseCar{

    public int TripKm;
    public void Go(){
        System.out.println("Car is now going");
    }
    public void Stop(){
        System.out.println("Car has stopped");
    }

    //Surucuye bilgilendirme yapan metot
    /*
        1- Single responsibility prensibi geregi 1 metot icinde 2 farkli isi yapan islemler icermemelidir.
        Mail ve Sms gonderme islemleri ayrilmalidir.
        2- Ayrica class bazinda da single responsibility sorgulanabilir. Mercedes benz clasinda neder surucuye bilgi veren metot var?

    public void SendTripInfoToDriver(DriverInfo driver){
        if(!driver.getEmailAdress().isEmpty()){
            MailMessage msg= new MailMessage();
            msg.send();
        }
        if(!driver.getPhoneNumber().isEmpty()){
            SmsSender sms=new SmsSender();
            sms.send();
        }
    } */

    //Not Yeni bir arac olarak bmw clasi geldiginde bu ozellikleri kullanabilecegimiz baseCar sinifini olusturup icerisine tasidik

}

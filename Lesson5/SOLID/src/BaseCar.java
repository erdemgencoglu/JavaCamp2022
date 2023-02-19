public class BaseCar {

    public void SendTripInfoMailToDriver(DriverInfo driver){
        if(!driver.getEmailAdress().isEmpty()){
            MailMessage msg= new MailMessage();
            msg.send();
        }
    }

    public void SendTripInfoSmsToDriver(DriverInfo driver){
        if(!driver.getPhoneNumber().isEmpty()){
            SmsSender sms=new SmsSender();
            sms.send();
        }
    }
}

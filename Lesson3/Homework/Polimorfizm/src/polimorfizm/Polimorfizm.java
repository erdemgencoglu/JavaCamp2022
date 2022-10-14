package polimorfizm;

public class Polimorfizm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        
        for (BaseLogger logger : loggers) {
            logger.log("Log mesajı");
        }*/
        CustomerManager cm = new CustomerManager(new DatabaseLogger());
        cm.add();
    }
    
}

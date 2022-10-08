package classlar;

public class Classlar {

    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        //Bu referansı tutan bir değer yok ise java garbage collector sayesinde belli bir süre sonra bellekten siler.
        CustomerManager cm2 = new CustomerManager();
        cm.Add();
        cm.Update();
        cm.Delete();
    }

}

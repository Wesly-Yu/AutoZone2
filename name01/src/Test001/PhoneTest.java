package Test001;


import com.mooc.tel.Camera;
import com.mooc.tel.FourthTelphone;
import com.mooc.tel.IPhoto;

public class PhoneTest {
    public static void main(String[] args) {
        FourthTelphone  phone = new FourthTelphone();
        phone.call();
        phone.playgame();
//        phone.takephoto();
        phone.message();
        System.out.println("===================================");
        IPhoto ip = new FourthTelphone();
        ip.photo();
        ip = new Camera();
        ip.photo();
    }
}

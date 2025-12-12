import com.tka.entity.Amazon;
import com.tka.entity.Mobile;

public class Main {
    public static void main(String[] args) {
        Mobile iphone = new Mobile();
        iphone.loginAmazon();
        iphone.addProduct();
        iphone.loginFlipCart();
        iphone.simActivate();
        iphone.simInfo();

        Amazon amazon = new Mobile();
        amazon.loginAmazon();


    }
}
package decorate;

/**
 * @author CookiesEason
 * 2018/12/07 14:22
 */
public class Test {

    public static void main(String[] args) {

        Phone phone = new NormalPhone();
        PhoneDecorator smartPhone = new SmartPhone();
        PhoneDecorator testPhone = new TestPhone();

        smartPhone.setPhone(phone);
        System.out.println(smartPhone.function());
        System.out.println("-----------");
        testPhone.setPhone(smartPhone);
        System.out.println(testPhone.function());
    }

}

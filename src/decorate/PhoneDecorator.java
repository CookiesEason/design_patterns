package decorate;

/**
 * @author CookiesEason
 * 2018/12/07 14:19
 */
public abstract class PhoneDecorator implements Phone {

    protected Phone phone;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String function() {
        return phone.function();
    }

}

package decorate;

/**
 * @author CookiesEason
 * 2018/12/07 14:20
 */
public class SmartPhone extends PhoneDecorator {

    @Override
    public String function() {
        return super.function() + otherFunction();
    }

    private String otherFunction() {
        return "现在加入视频通话";
    }
}

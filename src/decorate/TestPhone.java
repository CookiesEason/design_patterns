package decorate;

/**
 * @author CookiesEason
 * 2018/12/07 14:24
 */
public class TestPhone extends PhoneDecorator {

    @Override
    public String function() {
       return super.function() + otherFunction();
    }

    private String otherFunction() {
        return "现在加入测试功能";
    }

}


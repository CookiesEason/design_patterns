package prototype;

/**
 * @author CookiesEason
 * 2018/12/14 19:57
 */
public abstract class Shape implements Cloneable {

    protected Integer id;

    protected String type;

    abstract void draw();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

package prototype;

/**
 * @author CookiesEason
 * 2018/12/14 19:57
 */
public abstract class Shape implements Cloneable {

    protected Integer id;

    protected String type;

    protected Xxx xxx = new Xxx();

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

    public Xxx getXxx() {
        return xxx;
    }

    public void setXxx(Xxx xxx) {
        this.xxx = xxx;
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

    public Object deepClone() {
        Object clone = null;
        try {
            clone = super.clone();
            ((Shape) clone).xxx = (Xxx) this.xxx.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

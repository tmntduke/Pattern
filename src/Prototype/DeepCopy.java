package Prototype;

import java.util.Date;

/**
 * 深拷贝 所持有的引用类型必需重写clone方法
 * Created by tmnt on 2017/4/2.
 */
public class DeepCopy implements Cloneable{

    private String name;
    private Date date;

    public DeepCopy(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy copy = (DeepCopy) super.clone();
        copy.date = (Date) date.clone();
        return copy;
    }
}

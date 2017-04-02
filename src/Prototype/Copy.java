package Prototype;

import java.util.Date;

/**
 * ǳ����
 * Created by tmnt on 2017/4/2.
 */
public class Copy implements Cloneable {

    private String id;
    private String name;
    private Date date;

    public Copy(String id, String name, Date date) {
        this.id = id;
        this.name = name;
        this. date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Copy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

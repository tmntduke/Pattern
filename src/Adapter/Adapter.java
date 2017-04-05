package Adapter;

/**
 * Created by tmnt on 2017/4/5.
 */
public class Adapter implements Target {

    private Adapat adapat;

    public Adapter(Adapat adapat) {
        this.adapat = adapat;
    }

    @Override
    public void handle() {
        adapat.request();
    }
}

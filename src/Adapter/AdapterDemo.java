package Adapter;

/**
 * Created by tmnt on 2017/4/5.
 */
public class AdapterDemo {

    public void show(Target t){
        t.handle();
    }

    public static void main(String[] args) {

        AdapterDemo adapterDemo=new AdapterDemo();

        Adapat adapat=new Adapat();

        adapterDemo.show(new Adapter(adapat));

    }
}

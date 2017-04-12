package Template;

/**
 * Created by tmnt on 2017/4/12.
 */
public class TemplateDemo {
    public static void main(String[] args) {

        Template template = new Bank();
        template.process();

        new Template() {
            @Override
            public void transact() {
                System.out.println("other transact");
            }
        }.process();
    }
}

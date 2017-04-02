package Builder;

/**
 * Created by tmnt on 2017/4/2.
 */
public class BuilderDemo {
    public static void main(String[] args) {

        Person person=new Person.Builder()
                .setId("007")
                .setName("tmnt")
                .setAge(20)
                .setJob("coder")
                .setFavorit("java")
                .setSchool("qinghua")
                .build();

        System.out.println(person.toString());

    }
}

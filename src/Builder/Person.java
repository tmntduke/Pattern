package Builder;

/**
 * Created by tmnt on 2017/4/2.
 */
public class Person {

    private String name;
    private String id;
    private int age;
    private String school;
    private String job;
    private String favorit;

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.school = builder.school;
        this.job = builder.job;
        this.favorit = builder.favorit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFavorit() {
        return favorit;
    }

    public void setFavorit(String favorit) {
        this.favorit = favorit;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", job='" + job + '\'' +
                ", favorit='" + favorit + '\'' +
                '}';
    }

   static class Builder {
        private String name;
        private String id;
        private int age;
        private String school;
        private String job;
        private String favorit;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFavorit(String favorit) {
            this.favorit = favorit;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

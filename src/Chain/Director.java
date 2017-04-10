package Chain;

/**
 * Created by tmnt on 2017/4/10.
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handle(Leave leave) {
       if (leave.getDays()<=3){
           System.out.println(name+" pass");
       }else {
           if (this.leader!=null){
               this.leader.handle(leave);
           }
       }
    }
}

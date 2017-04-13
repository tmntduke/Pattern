package Status;

import Strategy.*;

/**
 * µ±Ç°×´Ì¬
 * ÇÐ»»×´Ì¬
 * Created by tmnt on 2017/4/13.
 */
public class StatusDemo {
    public static void main(String[] args) {

        FreeStatus freeStatus = new FreeStatus();
        Context context = new Context();
        context.setStatus(freeStatus);
    }
}

package Mediator;

/**
 * Created by tmnt on 2017/4/11.
 */
public interface Depatment {
    /**
     * 自身操作
     */
    void selfAction();

    /**
     * 向上申请
     */
    void request(String request);
}

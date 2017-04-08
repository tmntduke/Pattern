package Composite;

/**
 * Created by tmnt on 2017/4/8.
 */
public interface Composite extends Component {

    void add(Component component);

    void remove(Component component);

    Component get(int position);

}

/**
 * Created by dllo on 17/11/2.
 */
public class Mang extends Worker{

    public Mang(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + "打dota...");
    }
}

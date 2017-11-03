/**
 * Created by dllo on 17/11/2.
 */
public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + "写程序-测bug");
    }
}

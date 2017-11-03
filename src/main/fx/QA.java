/**
 * Created by dllo on 17/11/2.
 */
public class QA extends Worker {
    public QA(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + "写测试-提交bug");
    }
}

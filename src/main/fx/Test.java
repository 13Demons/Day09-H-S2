/**
 * Created by dllo on 17/11/2.
 */
public class Test {
    public static void main(String[] args) {
        Worker it1 = new ITWorker("小明");
        it1.workOneDay();
        Worker hr = new HP("小李");
        hr.workOneDay();
        Worker Mang = new Mang("小王");
        Mang.workOneDay();
        Worker qa = new QA("小赵");
        qa.workOneDay();

    }
}

/**
 * Created by dllo on 17/11/2.
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public final void workOneDay(){
        System.out.println("--work start--");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("--work end--");
    }
    //工作
    public abstract void work();


    private void computerOn(){
        System.out.println(name + "打开电脑");
    }

    private void computerOff(){
        System.out.println(name + "关闭电脑");
    }

    public void enterCompany(){
        System.out.println(name + "进入公司");
    }

    public void exitCompany(){
        System.out.println(name + "离开公司");
    }


}

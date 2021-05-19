package templete;

public abstract class Dad {
    public String fun1(){
        String res = null;
        // 把这步获取res的任务交给sub class去做
        res = fun2();
        return res;
    }
    protected abstract String fun2();
}

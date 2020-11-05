package CreativePatterns.Singleton;

public class SingletonLazy {
    private static volatile SingletonLazy instance=null;    //保证 instance 在所有线程中同步
    private SingletonLazy(){}    //private 避免类在外部被实例化
    public static synchronized SingletonLazy getInstance()
    {
        //getInstance 方法前加同步
        if(instance==null)
        {
            instance=new SingletonLazy();
        }
        return instance;
    }
}

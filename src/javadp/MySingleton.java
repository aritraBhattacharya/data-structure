package javadp;

public class MySingleton {

    private static volatile MySingleton instance = null;
    private MySingleton(){}

    public static MySingleton getInstance() {
        if(instance!=null){
            return instance;
        }
        else{
            synchronized (MySingleton.class){
                if(instance==null){
                    instance = new MySingleton();
                }
                return instance;
            }
        }
    }
}

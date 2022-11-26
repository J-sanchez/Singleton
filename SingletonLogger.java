public class SingletonLogger {
    //Eager initialization not memory efficient

    // private static SingletonLogger intstance = new SingletonLogger();
    private static SingletonLogger instance;

    private SingletonLogger() {
    }

    //Lazy 
    public static synchronized SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void logMessageStart() {
        System.out.println("Start Message is Logged");
    }

    public void logMessageStop() {
        System.out.println("Stop Message is Logged");
    }
}
//Cannot create two instances of the same object the only instance the object can take is SingletonLogger instance 
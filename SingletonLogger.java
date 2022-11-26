public class SingletonLogger {
    private static SingletonLogger intstance = new SingletonLogger();

    private SingletonLogger() {
    }

    public static SingletonLogger getInstance() {
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

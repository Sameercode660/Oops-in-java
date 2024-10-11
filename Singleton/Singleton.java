package Singleton;

public class Singleton {
    
}


class Sample {
    
    private Sample() {

    }

    private static Sample instance;

    public static Sample getInstance() {
        if(instance == null) {
            instance = new Sample();
        }

        return instance;
    }
}
static class Singleton {
    private static volatile Singleton instance = null;

    private String value = null;

    private Singleton() {
        this.value = "GrayScale";
    }

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        System.out.println("value changed to"+ value);
    }
    
}

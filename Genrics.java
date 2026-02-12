class Genrics <T>{
    T value;

    public  Genrics(T value)
    {
        this.value=value;
    }

//    void set(T value)
//    {
//        this.value=value;
//    }

    T get()
    {
        return value;
    }

    public static void main(String[] args) {
       Genrics<String> stringbox= new Genrics<>("Hello there");
        System.out.println(stringbox.get());
        Genrics<Integer> intbox=new Genrics<>(121);
        System.out.println(intbox.get());
    }
}
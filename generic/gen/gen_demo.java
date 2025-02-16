class gen <T>{
    T ob;
    
    gen(T obj){
        ob = obj;
    }

    T getob(){
        return ob;
    }

    void showtype(){
        System.out.println("type of T is " + ob.getClass().getName());
    }
}

class GenDemo{
    public static void main(String args[]){
        //Create a Gen object for integer
        gen<Integer> iob = new gen<Integer>(88);
        iob.showtype();

        int v = iob.getob();
        System.out.println("v is " + v);

        //Create a Gen integer for string

        gen<String> sob = new gen<String>("Hello");
        sob.showtype();

        String str = sob.getob();
        System.out.println(str);
    }
}
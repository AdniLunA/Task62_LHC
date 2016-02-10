
public class Test {

    public static void main(String ... args){
        System.out.println("test");

        BosonString bosonString = new BosonString();
        String testStringWithHibo = bosonString.insertHibo(bosonString.getBosonString());

        System.out.println(testStringWithHibo);
    }
}

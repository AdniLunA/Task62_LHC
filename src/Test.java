
public class Test {

    public static void main(String ... args){
 //       System.out.println("test");
/*
        BosonString bosonString = new BosonString();
        String testString = "abscjioajoijavjoiaewjrojoad091238409283";
        String testStringWithHibo = bosonString.insertHibo(bosonString.getBosonString());

        System.out.println(testStringWithHibo);
        System.out.println(testString.length());
        System.out.println(testStringWithHibo.length());*/

        BosonString bosonStringObj = new BosonString();
        FilterX xless = new FilterX();
        FilterY yless = new FilterY();
        FilterZ zless = new FilterZ();

        /*
        String xTest = xless.filterObjects("hjhhxjkhkjhxxxhkj");
        System.out.println(xTest);
        String yTest = yless.filterObjects("aaayaddyaddfdys");
        System.out.println(yTest);
        String zTest = zless.filterObjects("aazayzazddzyzazddfdys");
        System.out.println(zTest);
        */

       // System.out.println(bosonStringObj.getBosonString());

        String xyzLessString = zless.filterObjects(yless.filterObjects(xless.filterObjects(bosonStringObj.getBosonString())));
   //     System.out.println("Number of Symbols: "+bosonStringObj.getBosonString().length());
   //     System.out.println("filtering...");
     //   System.out.println(xyzLessString);
       // System.out.println("Number of Symbols: "+xyzLessString.length());

//        System.out.println("insert hibo...");
        String testStringWithHibo = bosonStringObj.insertHibo(xyzLessString);
  //      System.out.println(testStringWithHibo);
    //    System.out.println("Number of Symbols: "+testStringWithHibo.length());

    }
}

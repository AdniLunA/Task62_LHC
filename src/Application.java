import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Filter;

public class Application {
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String... args) {
        int componentType = 1;
        String componentSubPath = "";

        //Create Listener
        ControlCenter controlCenter = new ControlCenter();
        IPhysicianListener physician = new PhysicianListener();
        controlCenter.setListener(physician);

        //****Creating Hibo String ****
        BosonString bosonStringObj = new BosonString();
        FilterX xless = new FilterX();
        FilterY yless = new FilterY();
        FilterZ zless = new FilterZ();
        String xyzLessString = zless.filterObjects(yless.filterObjects(xless.filterObjects(bosonStringObj.getBosonString())));
        String hiboString = bosonStringObj.insertHibo(xyzLessString);
        System.out.println();
        //****Hibo String created ****


        if (componentType == 1)
            componentSubPath = "exchangeComponent01";
        else if (componentType == 2)
            componentSubPath = "exchangeComponent02";


        String userDirectory = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        String pathToJar = userDirectory + fileSeparator + componentSubPath + fileSeparator + "Component.jar";
        System.out.println("pathToJar : " + pathToJar);

        try {
            URL[] urls = {new File(componentSubPath + "/Component.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls,Application.class.getClassLoader());
            Class clazz = Class.forName("Component",true,urlClassLoader);
            System.out.println("clazz : " + clazz.toString()+ "-" + clazz.hashCode());

           Method method1 = clazz.getDeclaredMethod("getVersion");
           System.out.println(method1);

            Object instance = clazz.getMethod("getInstance", new Class[0]).invoke(null,new Object[0]);
            String version = (String)method1.invoke(instance);
            System.out.println("version : " + version);

            Class[] parameterTypes = {String.class, String.class};
            Object port = clazz.getDeclaredField("port").get(instance);
            Method method2 = port.getClass().getMethod("stringSearch",parameterTypes);
            Object[] parameterValues = {"hibo", hiboString};
            int result = (int)method2.invoke(port,parameterValues);
            controlCenter.foundHibo(result);
            //System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
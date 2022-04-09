package by.incubator;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        System.out.println("Hello from jar!");

        URL[] urls = new URL[] {new URL("file:///C://Users//Александр//IdeaProjects//CORE1//out//example.jar")};
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class<?> clazz = classLoader.loadClass("by.incubator.Main");
    try {
        Main instance = (Main) clazz.newInstance();
        instance.main(new String[]{});
    } catch (MalformedURLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}


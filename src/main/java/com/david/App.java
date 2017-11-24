package com.david;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String str = "!!!!!Hello World!!!!!";
        StringServer server = new StringServer();

        System.out.println(str);
        System.out.println(server.toReverse(str));
        System.out.println(server.toLower(str));
        System.out.println(server.toUpper(str));
        System.out.println(server.toRemoveSpaces(str));

    }
}

package com.david;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String str = "!!!!!Hello World!!!!!";
        StringServer stringServer = new StringServer();

        System.out.println(str);
        System.out.println("Reverse - " + stringServer.toReverse(str));
        System.out.println("To lower - " + stringServer.toLower(str));
        System.out.println("To Upper - " + stringServer.toUpper(str));
        System.out.println("Remove Spaces - " + stringServer.toRemoveSpaces(str));

    }
}

package cn.kerison;

import cn.kerison.utils.ArraysProvider;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test start ...\n\n");
        TestProvider provider = new ArraysProvider();
        provider.test();
        System.out.println("\n\nTest end ...");
    }
}

package com.andrewkravets;

import org.apache.camel.spring.Main;

/**
 * User: andrey.kravets
 * Date: 1/14/14 12:20 PM
 */
public class CamelApplication {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("camel_config.xml");
        main.start();
        Thread.sleep(1000);
        main.stop();
    }
}

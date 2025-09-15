package de.reptudn.velocityServerSigns.utils;

public class Logger {

    public static void log(String message) {
        System.out.println("[VelocityServerSigns] " + message);
    }

    public static void error(String message) {
        System.err.println("[VelocityServerSigns] ERROR: " + message);
    }

}

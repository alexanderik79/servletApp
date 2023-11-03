package com.example.demo.handlers;

import java.io.PrintWriter;

public class StatusHandler {
    public static void handleSaveStatus(int status, PrintWriter out) {
        if (status > 0) {
            out.print("Record saved successfully!");
        } else {
            out.println("Sorry! unable to save record");
        }
    }
}

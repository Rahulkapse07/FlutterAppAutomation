package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SessionManager {
	
	private static final String SESSION_FILE = "session.txt";

    public static void saveSessionId(String sessionId) {
        try (FileWriter writer = new FileWriter(SESSION_FILE)) {
            writer.write(sessionId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSessionId() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SESSION_FILE))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

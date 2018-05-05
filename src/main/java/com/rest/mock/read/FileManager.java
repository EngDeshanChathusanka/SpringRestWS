package com.rest.mock.read;

import java.io.File;

public class FileManager {

    public static String getTomcatHome() {
        return System.getProperty("catalina.base");
    }

    public static String getFilePath(String fileName) {
        String filePath = getTomcatHome() + "/resource/mock/" + fileName;
        File file = new File(filePath);
        return filePath;
    }

    public static File getFile(String fileName) {
        File file = new File(getFilePath(fileName));
        return file;
    }

}

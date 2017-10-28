//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240403
//Name: #Tee Li Hong

package com.tlh.rt_assignment1.countfni;

import java.util.ArrayList;
import java.io.File;

public class FileList implements Runnable {

    private static final ArrayList<String> list = new ArrayList();
    private static File dir;
    private static int count = 0;

    public FileList(final File fileList) {
        dir = fileList;
    }

    @Override
    public void run() {
        setList(dir);
    }

    //enter into the directory for the sake to count the number of file
    public static void setList(File dir) {

        for (final File fileEntry : dir.listFiles()) {
            if (fileEntry.isDirectory()) {
                setList(fileEntry);
            } else {
                list.add((fileEntry.getName()));
            }
        }

    }

    public static ArrayList<String> getList() {
        return list;
    }

}

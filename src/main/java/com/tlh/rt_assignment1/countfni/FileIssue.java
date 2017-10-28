//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240403
//Name: #Tee Li Hong

package com.tlh.rt_assignment1.countfni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIssue implements Runnable {

    private static int countf = 0, counti = 0;
    private static ArrayList<String> fileL = new ArrayList();
    private static String pfolder, pathfolder = "";

    //count file
    public FileIssue(ArrayList<String> fileName, String pfolder) {
        fileL = fileName;
        FileIssue.pfolder = pfolder;
    }

    @Override
    public void run(){
        setCountFile(fileL);
        countIssue(pfolder, fileL);
    }

    public void setCountFile(ArrayList<String> fileL) {

        for (int i = 0; i < fileL.size(); i++) {
            boolean javaFind = fileL.get(i).contains(".java");
            if(javaFind==true)
                countf++;
        }
    }

    public static int getCountFile() {
        return countf;
    }
    
    
    //count issue    
    public void countIssue(String pfolder, ArrayList<String> fileL) {

        String readword = "public static void main";
        
        for (int i = 0; i < fileL.size(); i++) {
            boolean javaFind = fileL.get(i).contains(".java");
            if(javaFind==true) {
               pathfolder = pfolder + "\\" + fileL.get(i);

                try (BufferedReader br = new BufferedReader(new FileReader(pathfolder))) {
                    String readCurrentLine;
                    while ((readCurrentLine = br.readLine()) != null) {
                        if (readCurrentLine.contains(readword)) {
                            counti++;
                        }                       
                    }
                } catch (IOException e) {
                    System.out.println("Error!!!");
                }
            }
        }
    }

    public static int getCountIssue(){
        return counti;
    }
}

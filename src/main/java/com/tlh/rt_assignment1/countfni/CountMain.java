//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240403
//Name: #Tee Li Hong

package com.tlh.rt_assignment1.countfni;

import java.io.File;
import java.util.ArrayList;

public class CountMain {

    public static final String PATH ="Test_files";
    
    public static void main(String[] args) throws Exception{
        
        //Class Path
        Path pathName = new Path(PATH);
        Thread pth = new Thread(pathName);
        pth.start();
        pth.join();
        String pfolder = Path.getPath();
        
       //Check path
        //System.out.println("my path is " + pfolder);
        
        //Class FileList
        final File dir = new File(pfolder);
        FileList fList = new FileList(dir);
        Thread fl = new Thread(fList);
        fl.start();
        fl.join();
        ArrayList<String> fileL = FileList.getList();
        
        //Class FileIssue
        FileIssue cfile = new FileIssue(fileL, pfolder);
        Thread cf = new Thread(cfile);
        cf.start();
        cf.join();
        int countf = FileIssue.getCountFile();
        int counti = FileIssue.getCountIssue();
        
        //Output
        System.out.println("Number of Java Files = " + countf);
        System.out.println("Number of Issues = " + counti);
    }
    
    
}

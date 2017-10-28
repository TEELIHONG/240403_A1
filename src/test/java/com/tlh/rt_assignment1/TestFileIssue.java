//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240403
//Name: #Tee Li Hong

package com.tlh.rt_assignment1;

import static com.tlh.rt_assignment1.countfni.CountMain.PATH;
import com.tlh.rt_assignment1.countfni.FileIssue;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TestFileIssue {

    @Test
    public void testCountFile() {

        ArrayList<String> existingFile = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        FileIssue fileL = new FileIssue(existingFile,PATH);
        fileL.countIssue(PATH, existingFile);

        int expectedFile = 4;
        int actualFile = fileL.getCountFile();

        Assert.assertEquals(expectedFile, actualFile);

    }

    @Test
    public void testCountIssue() {

        ArrayList<String> existingFile = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        FileIssue fileL = new FileIssue(existingFile, PATH);
        fileL.setCountFile(existingFile);
        fileL.countIssue(PATH, existingFile);

        int expectedIssue = 3;
        int actualIssue = fileL.getCountIssue();

        Assert.assertEquals(expectedIssue, actualIssue);
    }
}

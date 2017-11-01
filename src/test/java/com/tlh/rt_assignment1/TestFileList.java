//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240403
//Name: #Tee Li Hong
package com.tlh.rt_assignment1;

import static com.tlh.rt_assignment1.countfni.CountMain.PATH;
import com.tlh.rt_assignment1.countfni.FileList;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TestFileList {

    @Test
    public void testSetFileList() {

        File dir = new File(PATH);
        FileList.setList(dir);

        ArrayList<String> expectedList = new ArrayList(Arrays.asList("MySleep.java", "MyThread.java", "TestWaitNotify.java", "ThreadBlocked.java"));
        //ArrayList<String> actualList = fList.getList();

        Assert.assertEquals(expectedList, FileList.getList());
    }
}

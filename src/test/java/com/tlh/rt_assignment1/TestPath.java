//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #240403
//Name: #Tee Li Hong

package com.tlh.rt_assignment1;

import static com.tlh.rt_assignment1.countfni.CountMain.PATH;
import com.tlh.rt_assignment1.countfni.Path;
import static com.tlh.rt_assignment1.countfni.Path.folderName;
import java.io.File;
import java.nio.file.Paths;
import org.junit.Assert;
import org.junit.Test;

public class TestPath {
    
   @Test
   public void testSetPath(){
        Path pathN = new Path(PATH);
        pathN.setPath(folderName);
        
        String expectedPath = Paths.get("").toAbsolutePath().toString() + File.separator + folderName;
  
        Assert.assertEquals(expectedPath,pathN.getPath());
   }
   
}

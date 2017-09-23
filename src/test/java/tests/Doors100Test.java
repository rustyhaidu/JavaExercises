package tests;

import implementation.doors100.Doors100;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class Doors100Test {
    Doors100 doors100;

    @BeforeMethod
    public void setUp(){
        doors100 = new Doors100();
        doors100.createDoorMap();
    }

    @Test
    public void checkMapSize(){
        Map<Integer,Enum> doorMap= doors100.getDoorMap();
        int doorSize = doorMap.size();
        Assert.assertEquals(doorSize,100);
    }
}

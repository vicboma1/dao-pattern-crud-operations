package demo.base;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {

    private Data data  = new Data(99);

    @Test
    public void getId() throws Exception {
        Assert.assertEquals(data.getId(), 99);
    }

    @Test
    public void setId() throws Exception {
        Assert.assertEquals(data.getId(), 99);
        data.setId(50);
        Assert.assertEquals(data.getId(), 50);
    }

}
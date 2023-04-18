package modulnamber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModuleNumberTest {
    @Test
    public void test1(){
        assertEquals (-1, ModuleNumber.moduleNumber(-2,-1,5), 10e-5);
    }
}

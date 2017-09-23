/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment.allquizzes;
import assignment.serialization;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mushaf Ali
 */
public class allTests {
    
    public allTests() {
    }
    
    @Test
    public void serializationt(){
        allquizzes expected = serialization.deser();
        serialization.ser(expected);
        allquizzes result = serialization.deser();
        assertEquals(expected.totalquizes,result.totalquizes);
    }
    @Test
    public void dserializationt(){
        allquizzes expected = serialization.deser();
        serialization.ser(expected);
        allquizzes result = serialization.deser();
        //Assert.assertTrue(expected.quizes.equals(result.quizes));
        assertEquals(expected.totalquizes,result.totalquizes);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

package org.diginamic.demo_tests_unitaires;

import static org.junit.Assert.assertTrue;

import dev.utils.StringUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
 @org.junit.Test
    public void lapin (){
    	assertTrue(StringUtils.levenshteinDistance("lapin", "lapins")==1);
    }
 @org.junit.Test
 	public void chien (){
    	assertTrue(StringUtils.levenshteinDistance("chien", "chiens")==1); 	
    }
 @org.junit.Test
 	public void distance (){
    	assertTrue(StringUtils.levenshteinDistance("distance", "instance")==2);
    }
 @org.junit.Test
    public void machin (){
    	assertTrue(StringUtils.levenshteinDistance("machins", "machine")==1);
    }
 @org.junit.Test
 	public void robert (){
 		assertTrue(StringUtils.levenshteinDistance("robert", "robert")==0);
 }
 @org.junit.Test
 	public void testNull(){
 		assertTrue(StringUtils.levenshteinDistance(null, "route")==-1);

 	}
 
}
   
    	
    	
    	

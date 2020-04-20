//package test.java.org;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   ComputeTest.class  // Add test classes here.
})

public class Main {
    public static void main (String[] args) 
    {
       junit.textui.TestRunner.run (suite());
    }

    public static junit.framework.Test suite() 
    {
       return new JUnit4TestAdapter(Main.class);
    }
  
}
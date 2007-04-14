package com.scully.korat;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.scully.korat.finitization.FinitizationTest;
import com.scully.korat.finitization.IntArraySetTest;
import com.scully.korat.instrument.InstrumenterTest;
import com.scully.korat.map.BeanXmlMapperTest;
import com.scully.korat.map.StateSpaceBeanTest;

public class KoratTestSuite
{

    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test for com.scully.korat");
        //$JUnit-BEGIN$
//        suite.addTestSuite(KoratSearchTest.class);
        suite.addTestSuite(CandidateStateTest.class);
        suite.addTestSuite(FinitizationTest.class);
        suite.addTestSuite(StateSpaceBeanTest.class);
        suite.addTestSuite(BeanXmlMapperTest.class);
        suite.addTestSuite(InstrumenterTest.class);
        suite.addTestSuite(IntArraySetTest.class);
        suite.addTestSuite(KoratMainTest.class);
//        suite.addTestSuite(SearchTreeInstrumentTest.class);
        //$JUnit-END$
        return suite;
    }

}
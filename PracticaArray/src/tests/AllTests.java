package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testMaximaNota.class, testMedianaNotas.class, testMediaNotas.class, testMinimaNota.class })
public class AllTests {

}

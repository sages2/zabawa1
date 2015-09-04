package pl.netart.devops;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testShouldAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.add(1, 5));
    }
}

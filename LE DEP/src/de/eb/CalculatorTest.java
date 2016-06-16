package de.eb;

import junit.framework.Assert;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
@SuppressWarnings("deprecation")
public class CalculatorTest {

 @Test
 public void testAverage() {
  Injector i = Guice.createInjector();
  Calculator calci = i.getInstance(Calculator.class);
  Assert.assertEquals(4, calci.average(2,6));
  }
}
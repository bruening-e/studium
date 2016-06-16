package de.eb;

import static org.junit.Assert.*;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorTest {

 @Test
 public void testAverage() {
  Injector i = Guice.createInjector();
  Calculator calci = i.getInstance(Calculator.class);
  assertEquals(4, calci.average(2,6));
  }
}
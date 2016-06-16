package de.eb;

import com.google.inject.Binder;
import com.google.inject.Module;

public class CalculatorModule implements Module {// oder extends
 public void configure(Binder binder) {
  binder.bind(ICalc.class).to(Calc.class);
 }
}
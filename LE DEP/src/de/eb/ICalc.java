package de.eb;

import com.google.inject.ImplementedBy;
@ImplementedBy(Calc.class)
public interface ICalc {
 public int add(int a, int b);
}
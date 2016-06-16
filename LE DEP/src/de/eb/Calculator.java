package de.eb;

import com.google.inject.Inject;

//Constraint: sum will always be even
public class Calculator {
private final Calc calci;

@Inject
public Calculator(Calc aCalc){
calci = aCalc;
}
int average(int a, int b){
int sum = calci.add(a, b);
return sum / 2;
}
}
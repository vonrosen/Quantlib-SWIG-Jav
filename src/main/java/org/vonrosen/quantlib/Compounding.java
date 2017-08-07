/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public final class Compounding {
  public final static Compounding Simple = new Compounding("Simple");
  public final static Compounding Compounded = new Compounding("Compounded");
  public final static Compounding Continuous = new Compounding("Continuous");
  public final static Compounding SimpleThenCompounded = new Compounding("SimpleThenCompounded");
  public final static Compounding CompoundedThenSimple = new Compounding("CompoundedThenSimple");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Compounding swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Compounding.class + " with value " + swigValue);
  }

  private Compounding(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Compounding(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Compounding(String swigName, Compounding swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Compounding[] swigValues = { Simple, Compounded, Continuous, SimpleThenCompounded, CompoundedThenSimple };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


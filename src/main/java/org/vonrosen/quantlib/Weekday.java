/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public final class Weekday {
  public final static Weekday Sunday = new Weekday("Sunday", 1);
  public final static Weekday Monday = new Weekday("Monday", 2);
  public final static Weekday Tuesday = new Weekday("Tuesday", 3);
  public final static Weekday Wednesday = new Weekday("Wednesday", 4);
  public final static Weekday Thursday = new Weekday("Thursday", 5);
  public final static Weekday Friday = new Weekday("Friday", 6);
  public final static Weekday Saturday = new Weekday("Saturday", 7);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Weekday swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Weekday.class + " with value " + swigValue);
  }

  private Weekday(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Weekday(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Weekday(String swigName, Weekday swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Weekday[] swigValues = { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


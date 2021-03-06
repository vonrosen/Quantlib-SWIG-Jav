/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class NoArbSabrSmileSection extends SmileSection {
  private transient long swigCPtr;

  protected NoArbSabrSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NoArbSabrSmileSection_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NoArbSabrSmileSection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NoArbSabrSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NoArbSabrSmileSection(double timeToExpiry, double forward, DoubleVector sabrParameters, double shift) {
    this(QuantLibJNI.new_NoArbSabrSmileSection__SWIG_0(timeToExpiry, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters, shift), true);
  }

  public NoArbSabrSmileSection(double timeToExpiry, double forward, DoubleVector sabrParameters) {
    this(QuantLibJNI.new_NoArbSabrSmileSection__SWIG_1(timeToExpiry, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters), true);
  }

  public NoArbSabrSmileSection(Date d, double forward, DoubleVector sabrParameters, DayCounter dc, double shift) {
    this(QuantLibJNI.new_NoArbSabrSmileSection__SWIG_2(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters, DayCounter.getCPtr(dc), dc, shift), true);
  }

  public NoArbSabrSmileSection(Date d, double forward, DoubleVector sabrParameters, DayCounter dc) {
    this(QuantLibJNI.new_NoArbSabrSmileSection__SWIG_3(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters, DayCounter.getCPtr(dc), dc), true);
  }

  public NoArbSabrSmileSection(Date d, double forward, DoubleVector sabrParameters) {
    this(QuantLibJNI.new_NoArbSabrSmileSection__SWIG_4(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters), true);
  }

}

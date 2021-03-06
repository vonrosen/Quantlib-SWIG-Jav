/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class SabrSmileSection extends SmileSection {
  private transient long swigCPtr;

  protected SabrSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SabrSmileSection_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SabrSmileSection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SabrSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SabrSmileSection(Date d, double forward, DoubleVector sabrParameters, DayCounter dc, double shift) {
    this(QuantLibJNI.new_SabrSmileSection__SWIG_0(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters, DayCounter.getCPtr(dc), dc, shift), true);
  }

  public SabrSmileSection(Date d, double forward, DoubleVector sabrParameters, DayCounter dc) {
    this(QuantLibJNI.new_SabrSmileSection__SWIG_1(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters, DayCounter.getCPtr(dc), dc), true);
  }

  public SabrSmileSection(Date d, double forward, DoubleVector sabrParameters) {
    this(QuantLibJNI.new_SabrSmileSection__SWIG_2(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters), true);
  }

  public SabrSmileSection(double timeToExpiry, double forward, DoubleVector sabrParameters, double shift) {
    this(QuantLibJNI.new_SabrSmileSection__SWIG_3(timeToExpiry, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters, shift), true);
  }

  public SabrSmileSection(double timeToExpiry, double forward, DoubleVector sabrParameters) {
    this(QuantLibJNI.new_SabrSmileSection__SWIG_4(timeToExpiry, forward, DoubleVector.getCPtr(sabrParameters), sabrParameters), true);
  }

}

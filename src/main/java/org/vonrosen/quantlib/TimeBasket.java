/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class TimeBasket {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TimeBasket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeBasket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_TimeBasket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TimeBasket() {
    this(QuantLibJNI.new_TimeBasket__SWIG_0(), true);
  }

  public TimeBasket(DateVector arg0, DoubleVector arg1) {
    this(QuantLibJNI.new_TimeBasket__SWIG_1(DateVector.getCPtr(arg0), arg0, DoubleVector.getCPtr(arg1), arg1), true);
  }

  public long size() {
    return QuantLibJNI.TimeBasket_size(swigCPtr, this);
  }

  public TimeBasket rebin(DateVector arg0) {
    return new TimeBasket(QuantLibJNI.TimeBasket_rebin(swigCPtr, this, DateVector.getCPtr(arg0), arg0), true);
  }

}
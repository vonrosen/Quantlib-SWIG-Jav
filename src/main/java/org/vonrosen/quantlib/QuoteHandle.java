/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class QuoteHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected QuoteHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QuoteHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_QuoteHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public QuoteHandle(Quote arg0) {
    this(QuantLibJNI.new_QuoteHandle__SWIG_0(Quote.getCPtr(arg0), arg0), true);
  }

  public QuoteHandle() {
    this(QuantLibJNI.new_QuoteHandle__SWIG_1(), true);
  }

  public Quote __deref__() {
    return new Quote(QuantLibJNI.QuoteHandle___deref__(swigCPtr, this), true);
  }

  public boolean empty() {
    return QuantLibJNI.QuoteHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.QuoteHandle_asObservable(swigCPtr, this), true);
  }

  public double value() {
    return QuantLibJNI.QuoteHandle_value(swigCPtr, this);
  }

}

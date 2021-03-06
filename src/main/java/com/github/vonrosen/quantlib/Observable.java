/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Observable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Observable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Observable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Observable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_Observable __deref__() {
    long cPtr = QuantLibJNI.Observable___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Observable(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.Observable_isNull(swigCPtr, this);
  }

  public Observable() {
    this(QuantLibJNI.new_Observable(), true);
  }

}

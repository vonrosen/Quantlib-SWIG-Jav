/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class SampleArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SampleArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SampleArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SampleArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Array value() {
    return new Array(QuantLibJNI.SampleArray_value(swigCPtr, this), true);
  }

  public double weight() {
    return QuantLibJNI.SampleArray_weight(swigCPtr, this);
  }

}

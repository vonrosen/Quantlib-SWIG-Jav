/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Euribor10M extends Euribor {
  private transient long swigCPtr;

  protected Euribor10M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor10M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor10M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Euribor10M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor10M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor10M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor10M() {
    this(QuantLibJNI.new_Euribor10M__SWIG_1(), true);
  }

}

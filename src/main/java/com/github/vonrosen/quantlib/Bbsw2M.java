/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Bbsw2M extends Bbsw {
  private transient long swigCPtr;

  protected Bbsw2M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bbsw2M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bbsw2M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Bbsw2M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bbsw2M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Bbsw2M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Bbsw2M() {
    this(QuantLibJNI.new_Bbsw2M__SWIG_1(), true);
  }

}
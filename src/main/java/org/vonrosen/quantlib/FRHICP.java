/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class FRHICP extends ZeroInflationIndex {
  private transient long swigCPtr;

  protected FRHICP(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FRHICP_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FRHICP obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FRHICP(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FRHICP(boolean interpolated, ZeroInflationTermStructureHandle h) {
    this(QuantLibJNI.new_FRHICP__SWIG_0(interpolated, ZeroInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public FRHICP(boolean interpolated) {
    this(QuantLibJNI.new_FRHICP__SWIG_1(interpolated), true);
  }

}

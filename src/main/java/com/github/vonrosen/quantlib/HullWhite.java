/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class HullWhite extends ShortRateModel {
  private transient long swigCPtr;

  protected HullWhite(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HullWhite_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HullWhite obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_HullWhite(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HullWhite(YieldTermStructureHandle termStructure, double a, double sigma) {
    this(QuantLibJNI.new_HullWhite__SWIG_0(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a, sigma), true);
  }

  public HullWhite(YieldTermStructureHandle termStructure, double a) {
    this(QuantLibJNI.new_HullWhite__SWIG_1(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a), true);
  }

  public HullWhite(YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_HullWhite__SWIG_2(YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public double discount(double t) {
    return QuantLibJNI.HullWhite_discount(swigCPtr, this, t);
  }

  public double discountBond(double now, double maturity, double rate) {
    return QuantLibJNI.HullWhite_discountBond(swigCPtr, this, now, maturity, rate);
  }

  public static double convexityBias(double futurePrice, double t, double T, double sigma, double a) {
    return QuantLibJNI.HullWhite_convexityBias(futurePrice, t, T, sigma, a);
  }

}

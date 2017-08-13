/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CappedFlooredCoupon extends FloatingRateCoupon {
  private transient long swigCPtr;

  protected CappedFlooredCoupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CappedFlooredCoupon_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CappedFlooredCoupon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CappedFlooredCoupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CappedFlooredCoupon(FloatingRateCoupon underlying, double cap, double floor) {
    this(QuantLibJNI.new_CappedFlooredCoupon__SWIG_0(FloatingRateCoupon.getCPtr(underlying), underlying, cap, floor), true);
  }

  public CappedFlooredCoupon(FloatingRateCoupon underlying, double cap) {
    this(QuantLibJNI.new_CappedFlooredCoupon__SWIG_1(FloatingRateCoupon.getCPtr(underlying), underlying, cap), true);
  }

  public CappedFlooredCoupon(FloatingRateCoupon underlying) {
    this(QuantLibJNI.new_CappedFlooredCoupon__SWIG_2(FloatingRateCoupon.getCPtr(underlying), underlying), true);
  }

  public double cap() {
    return QuantLibJNI.CappedFlooredCoupon_cap(swigCPtr, this);
  }

  public double floor() {
    return QuantLibJNI.CappedFlooredCoupon_floor(swigCPtr, this);
  }

  public double effectiveCap() {
    return QuantLibJNI.CappedFlooredCoupon_effectiveCap(swigCPtr, this);
  }

  public double effectiveFloor() {
    return QuantLibJNI.CappedFlooredCoupon_effectiveFloor(swigCPtr, this);
  }

  public boolean isCapped() {
    return QuantLibJNI.CappedFlooredCoupon_isCapped(swigCPtr, this);
  }

  public boolean isFloored() {
    return QuantLibJNI.CappedFlooredCoupon_isFloored(swigCPtr, this);
  }

  public void setPricer(FloatingRateCouponPricer p) {
    QuantLibJNI.CappedFlooredCoupon_setPricer(swigCPtr, this, FloatingRateCouponPricer.getCPtr(p), p);
  }

}
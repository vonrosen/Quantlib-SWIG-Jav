/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class ZeroCouponInflationSwap extends Instrument {
  private transient long swigCPtr;

  protected ZeroCouponInflationSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZeroCouponInflationSwap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroCouponInflationSwap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ZeroCouponInflationSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZeroCouponInflationSwap(_ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, boolean adjustInfObsDates, Calendar infCalendar, BusinessDayConvention infConvention) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_0(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, adjustInfObsDates, Calendar.getCPtr(infCalendar), infCalendar, infConvention.swigValue()), true);
  }

  public ZeroCouponInflationSwap(_ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, boolean adjustInfObsDates, Calendar infCalendar) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_1(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, adjustInfObsDates, Calendar.getCPtr(infCalendar), infCalendar), true);
  }

  public ZeroCouponInflationSwap(_ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, boolean adjustInfObsDates) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_2(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, adjustInfObsDates), true);
  }

  public ZeroCouponInflationSwap(_ZeroCouponInflationSwap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_3(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag), true);
  }

  public double fairRate() {
    return QuantLibJNI.ZeroCouponInflationSwap_fairRate(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.ZeroCouponInflationSwap_fixedLegNPV(swigCPtr, this);
  }

  public double inflationLegNPV() {
    return QuantLibJNI.ZeroCouponInflationSwap_inflationLegNPV(swigCPtr, this);
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.ZeroCouponInflationSwap_fixedLeg(swigCPtr, this), true);
  }

  public Leg inflationLeg() {
    return new Leg(QuantLibJNI.ZeroCouponInflationSwap_inflationLeg(swigCPtr, this), true);
  }

  public _ZeroCouponInflationSwap.Type type() {
    return _ZeroCouponInflationSwap.Type.swigToEnum(QuantLibJNI.ZeroCouponInflationSwap_type(swigCPtr, this));
  }

  public final static _ZeroCouponInflationSwap.Type Receiver = _ZeroCouponInflationSwap.Type.swigToEnum(QuantLibJNI.ZeroCouponInflationSwap_Receiver_get());
  public final static _ZeroCouponInflationSwap.Type Payer = _ZeroCouponInflationSwap.Type.swigToEnum(QuantLibJNI.ZeroCouponInflationSwap_Payer_get());
}

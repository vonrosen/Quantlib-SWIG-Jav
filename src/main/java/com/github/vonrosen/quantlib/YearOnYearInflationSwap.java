/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class YearOnYearInflationSwap extends Instrument {
  private transient long swigCPtr;

  protected YearOnYearInflationSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YearOnYearInflationSwap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YearOnYearInflationSwap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_YearOnYearInflationSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YearOnYearInflationSwap(_YearOnYearInflationSwap.Type type, double nominal, Schedule fixedSchedule, double fixedRate, DayCounter fixedDayCounter, Schedule yoySchedule, YoYInflationIndex index, Period lag, double spread, DayCounter yoyDayCounter, Calendar paymentCalendar, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_YearOnYearInflationSwap__SWIG_0(type.swigValue(), nominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRate, DayCounter.getCPtr(fixedDayCounter), fixedDayCounter, Schedule.getCPtr(yoySchedule), yoySchedule, YoYInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, spread, DayCounter.getCPtr(yoyDayCounter), yoyDayCounter, Calendar.getCPtr(paymentCalendar), paymentCalendar, paymentConvention.swigValue()), true);
  }

  public YearOnYearInflationSwap(_YearOnYearInflationSwap.Type type, double nominal, Schedule fixedSchedule, double fixedRate, DayCounter fixedDayCounter, Schedule yoySchedule, YoYInflationIndex index, Period lag, double spread, DayCounter yoyDayCounter, Calendar paymentCalendar) {
    this(QuantLibJNI.new_YearOnYearInflationSwap__SWIG_1(type.swigValue(), nominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRate, DayCounter.getCPtr(fixedDayCounter), fixedDayCounter, Schedule.getCPtr(yoySchedule), yoySchedule, YoYInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, spread, DayCounter.getCPtr(yoyDayCounter), yoyDayCounter, Calendar.getCPtr(paymentCalendar), paymentCalendar), true);
  }

  public double fairRate() {
    return QuantLibJNI.YearOnYearInflationSwap_fairRate(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.YearOnYearInflationSwap_fixedLegNPV(swigCPtr, this);
  }

  public double yoyLegNPV() {
    return QuantLibJNI.YearOnYearInflationSwap_yoyLegNPV(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.YearOnYearInflationSwap_fairSpread(swigCPtr, this);
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.YearOnYearInflationSwap_fixedLeg(swigCPtr, this), false);
  }

  public Leg yoyLeg() {
    return new Leg(QuantLibJNI.YearOnYearInflationSwap_yoyLeg(swigCPtr, this), false);
  }

  public final static _YearOnYearInflationSwap.Type Receiver = _YearOnYearInflationSwap.Type.swigToEnum(QuantLibJNI.YearOnYearInflationSwap_Receiver_get());
  public final static _YearOnYearInflationSwap.Type Payer = _YearOnYearInflationSwap.Type.swigToEnum(QuantLibJNI.YearOnYearInflationSwap_Payer_get());
}

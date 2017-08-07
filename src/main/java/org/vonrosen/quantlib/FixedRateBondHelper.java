/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class FixedRateBondHelper extends BondHelper {
  private transient long swigCPtr;

  protected FixedRateBondHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FixedRateBondHelper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FixedRateBondHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FixedRateBondHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention, boolean exCouponEndOfMonth, boolean useCleanPrice) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_0(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue(), exCouponEndOfMonth, useCleanPrice), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention, boolean exCouponEndOfMonth) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_1(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue(), exCouponEndOfMonth), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_2(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue()), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_3(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_4(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate, Calendar paymentCalendar) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_5(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption, Date issueDate) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_6(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption, Date.getCPtr(issueDate), issueDate), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, double redemption) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_7(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), redemption), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_8(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue()), true);
  }

  public FixedRateBondHelper(QuoteHandle cleanPrice, long settlementDays, double faceAmount, Schedule schedule, DoubleVector coupons, DayCounter paymentDayCounter) {
    this(QuantLibJNI.new_FixedRateBondHelper__SWIG_9(QuoteHandle.getCPtr(cleanPrice), cleanPrice, settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter), true);
  }

  public FixedRateBond bond() {
    return new FixedRateBond(QuantLibJNI.FixedRateBondHelper_bond(swigCPtr, this), true);
  }

}

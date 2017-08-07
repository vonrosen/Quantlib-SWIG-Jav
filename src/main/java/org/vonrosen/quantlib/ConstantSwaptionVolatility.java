/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class ConstantSwaptionVolatility extends SwaptionVolatilityStructure {
  private transient long swigCPtr;

  protected ConstantSwaptionVolatility(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ConstantSwaptionVolatility_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConstantSwaptionVolatility obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ConstantSwaptionVolatility(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConstantSwaptionVolatility(long settlementDays, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type, double shift) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_0(settlementDays, Calendar.getCPtr(cal), cal, bdc.swigValue(), QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dc), dc, type.swigValue(), shift), true);
  }

  public ConstantSwaptionVolatility(long settlementDays, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_1(settlementDays, Calendar.getCPtr(cal), cal, bdc.swigValue(), QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dc), dc, type.swigValue()), true);
  }

  public ConstantSwaptionVolatility(long settlementDays, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_2(settlementDays, Calendar.getCPtr(cal), cal, bdc.swigValue(), QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dc), dc), true);
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type, double shift) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_3(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(cal), cal, bdc.swigValue(), QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dc), dc, type.swigValue(), shift), true);
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc, VolatilityType type) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_4(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(cal), cal, bdc.swigValue(), QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dc), dc, type.swigValue()), true);
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, QuoteHandle volatility, DayCounter dc) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_5(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(cal), cal, bdc.swigValue(), QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dc), dc), true);
  }

  public ConstantSwaptionVolatility(long settlementDays, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type, double shift) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_6(settlementDays, Calendar.getCPtr(cal), cal, bdc.swigValue(), volatility, DayCounter.getCPtr(dc), dc, type.swigValue(), shift), true);
  }

  public ConstantSwaptionVolatility(long settlementDays, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_7(settlementDays, Calendar.getCPtr(cal), cal, bdc.swigValue(), volatility, DayCounter.getCPtr(dc), dc, type.swigValue()), true);
  }

  public ConstantSwaptionVolatility(long settlementDays, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_8(settlementDays, Calendar.getCPtr(cal), cal, bdc.swigValue(), volatility, DayCounter.getCPtr(dc), dc), true);
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type, double shift) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_9(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(cal), cal, bdc.swigValue(), volatility, DayCounter.getCPtr(dc), dc, type.swigValue(), shift), true);
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc, VolatilityType type) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_10(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(cal), cal, bdc.swigValue(), volatility, DayCounter.getCPtr(dc), dc, type.swigValue()), true);
  }

  public ConstantSwaptionVolatility(Date referenceDate, Calendar cal, BusinessDayConvention bdc, double volatility, DayCounter dc) {
    this(QuantLibJNI.new_ConstantSwaptionVolatility__SWIG_11(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(cal), cal, bdc.swigValue(), volatility, DayCounter.getCPtr(dc), dc), true);
  }

}

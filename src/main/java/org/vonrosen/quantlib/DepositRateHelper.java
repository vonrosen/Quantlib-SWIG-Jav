/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class DepositRateHelper extends RateHelper {
  private transient long swigCPtr;

  protected DepositRateHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DepositRateHelper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DepositRateHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DepositRateHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DepositRateHelper(QuoteHandle rate, Period tenor, long fixingDays, Calendar calendar, BusinessDayConvention convention, boolean endOfMonth, DayCounter dayCounter) {
    this(QuantLibJNI.new_DepositRateHelper__SWIG_0(QuoteHandle.getCPtr(rate), rate, Period.getCPtr(tenor), tenor, fixingDays, Calendar.getCPtr(calendar), calendar, convention.swigValue(), endOfMonth, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DepositRateHelper(double rate, Period tenor, long fixingDays, Calendar calendar, BusinessDayConvention convention, boolean endOfMonth, DayCounter dayCounter) {
    this(QuantLibJNI.new_DepositRateHelper__SWIG_1(rate, Period.getCPtr(tenor), tenor, fixingDays, Calendar.getCPtr(calendar), calendar, convention.swigValue(), endOfMonth, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DepositRateHelper(QuoteHandle rate, IborIndex index) {
    this(QuantLibJNI.new_DepositRateHelper__SWIG_2(QuoteHandle.getCPtr(rate), rate, IborIndex.getCPtr(index), index), true);
  }

  public DepositRateHelper(double rate, IborIndex index) {
    this(QuantLibJNI.new_DepositRateHelper__SWIG_3(rate, IborIndex.getCPtr(index), index), true);
  }

}

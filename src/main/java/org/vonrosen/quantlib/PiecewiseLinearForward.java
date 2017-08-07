/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class PiecewiseLinearForward extends YieldTermStructure {
  private transient long swigCPtr;

  protected PiecewiseLinearForward(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PiecewiseLinearForward_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PiecewiseLinearForward obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_PiecewiseLinearForward(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PiecewiseLinearForward(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, double accuracy, Linear i) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_0(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, accuracy, Linear.getCPtr(i), i), true);
  }

  public PiecewiseLinearForward(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, double accuracy) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_1(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, accuracy), true);
  }

  public PiecewiseLinearForward(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_2(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates), true);
  }

  public PiecewiseLinearForward(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_3(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps), true);
  }

  public PiecewiseLinearForward(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_4(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public PiecewiseLinearForward(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, double accuracy, Linear i) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_5(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, accuracy, Linear.getCPtr(i), i), true);
  }

  public PiecewiseLinearForward(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, double accuracy) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_6(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, accuracy), true);
  }

  public PiecewiseLinearForward(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_7(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates), true);
  }

  public PiecewiseLinearForward(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_8(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps), true);
  }

  public PiecewiseLinearForward(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter) {
    this(QuantLibJNI.new_PiecewiseLinearForward__SWIG_9(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.PiecewiseLinearForward_dates(swigCPtr, this), false);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.PiecewiseLinearForward_times(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.PiecewiseLinearForward_nodes(swigCPtr, this), true);
  }

}

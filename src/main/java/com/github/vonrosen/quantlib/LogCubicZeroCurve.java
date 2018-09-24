/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class LogCubicZeroCurve extends YieldTermStructure {
  private transient long swigCPtr;

  protected LogCubicZeroCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.LogCubicZeroCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LogCubicZeroCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LogCubicZeroCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LogCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, DefaultLogCubic i, Compounding compounding, Frequency frequency) {
    this(QuantLibJNI.new_LogCubicZeroCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, DefaultLogCubic.getCPtr(i), i, compounding.swigValue(), frequency.swigValue()), true);
  }

  public LogCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, DefaultLogCubic i, Compounding compounding) {
    this(QuantLibJNI.new_LogCubicZeroCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, DefaultLogCubic.getCPtr(i), i, compounding.swigValue()), true);
  }

  public LogCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, DefaultLogCubic i) {
    this(QuantLibJNI.new_LogCubicZeroCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, DefaultLogCubic.getCPtr(i), i), true);
  }

  public LogCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_LogCubicZeroCurve__SWIG_3(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public LogCubicZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter) {
    this(QuantLibJNI.new_LogCubicZeroCurve__SWIG_4(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.LogCubicZeroCurve_times(swigCPtr, this), false);
  }

  public DoubleVector data() {
    return new DoubleVector(QuantLibJNI.LogCubicZeroCurve_data(swigCPtr, this), false);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.LogCubicZeroCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector zeroRates() {
    return new DoubleVector(QuantLibJNI.LogCubicZeroCurve_zeroRates(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.LogCubicZeroCurve_nodes(swigCPtr, this), true);
  }

}

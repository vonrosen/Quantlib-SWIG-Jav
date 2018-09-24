/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class HestonModelHelper extends BlackCalibrationHelper {
  private transient long swigCPtr;

  protected HestonModelHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HestonModelHelper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HestonModelHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_HestonModelHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HestonModelHelper(Period maturity, Calendar calendar, double s0, double strikePrice, QuoteHandle volatility, YieldTermStructureHandle riskFreeRate, YieldTermStructureHandle dividendYield, _BlackCalibrationHelper.CalibrationErrorType errorType) {
    this(QuantLibJNI.new_HestonModelHelper__SWIG_0(Period.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, s0, strikePrice, QuoteHandle.getCPtr(volatility), volatility, YieldTermStructureHandle.getCPtr(riskFreeRate), riskFreeRate, YieldTermStructureHandle.getCPtr(dividendYield), dividendYield, errorType.swigValue()), true);
  }

  public HestonModelHelper(Period maturity, Calendar calendar, double s0, double strikePrice, QuoteHandle volatility, YieldTermStructureHandle riskFreeRate, YieldTermStructureHandle dividendYield) {
    this(QuantLibJNI.new_HestonModelHelper__SWIG_1(Period.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, s0, strikePrice, QuoteHandle.getCPtr(volatility), volatility, YieldTermStructureHandle.getCPtr(riskFreeRate), riskFreeRate, YieldTermStructureHandle.getCPtr(dividendYield), dividendYield), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class QuantoForwardEuropeanEngine extends PricingEngine {
  private transient long swigCPtr;

  protected QuantoForwardEuropeanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.QuantoForwardEuropeanEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QuantoForwardEuropeanEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_QuantoForwardEuropeanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QuantoForwardEuropeanEngine(GeneralizedBlackScholesProcess process, YieldTermStructureHandle foreignRiskFreeRate, BlackVolTermStructureHandle exchangeRateVolatility, QuoteHandle correlation) {
    this(QuantLibJNI.new_QuantoForwardEuropeanEngine(GeneralizedBlackScholesProcess.getCPtr(process), process, YieldTermStructureHandle.getCPtr(foreignRiskFreeRate), foreignRiskFreeRate, BlackVolTermStructureHandle.getCPtr(exchangeRateVolatility), exchangeRateVolatility, QuoteHandle.getCPtr(correlation), correlation), true);
  }

}

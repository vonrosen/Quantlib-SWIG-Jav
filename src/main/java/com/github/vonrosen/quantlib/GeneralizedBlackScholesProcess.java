/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class GeneralizedBlackScholesProcess extends StochasticProcess1D {
  private transient long swigCPtr;

  protected GeneralizedBlackScholesProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GeneralizedBlackScholesProcess_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GeneralizedBlackScholesProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GeneralizedBlackScholesProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GeneralizedBlackScholesProcess(QuoteHandle s0, YieldTermStructureHandle dividendTS, YieldTermStructureHandle riskFreeTS, BlackVolTermStructureHandle volTS) {
    this(QuantLibJNI.new_GeneralizedBlackScholesProcess(QuoteHandle.getCPtr(s0), s0, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS), true);
  }

  public QuoteHandle stateVariable() {
    return new QuoteHandle(QuantLibJNI.GeneralizedBlackScholesProcess_stateVariable(swigCPtr, this), true);
  }

  public YieldTermStructureHandle dividendYield() {
    return new YieldTermStructureHandle(QuantLibJNI.GeneralizedBlackScholesProcess_dividendYield(swigCPtr, this), true);
  }

  public YieldTermStructureHandle riskFreeRate() {
    return new YieldTermStructureHandle(QuantLibJNI.GeneralizedBlackScholesProcess_riskFreeRate(swigCPtr, this), true);
  }

  public BlackVolTermStructureHandle blackVolatility() {
    return new BlackVolTermStructureHandle(QuantLibJNI.GeneralizedBlackScholesProcess_blackVolatility(swigCPtr, this), true);
  }

}

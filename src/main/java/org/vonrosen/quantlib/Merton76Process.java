/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Merton76Process extends StochasticProcess1D {
  private transient long swigCPtr;

  protected Merton76Process(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Merton76Process_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Merton76Process obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Merton76Process(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Merton76Process(QuoteHandle stateVariable, YieldTermStructureHandle dividendTS, YieldTermStructureHandle riskFreeTS, BlackVolTermStructureHandle volTS, QuoteHandle jumpIntensity, QuoteHandle meanLogJump, QuoteHandle jumpVolatility) {
    this(QuantLibJNI.new_Merton76Process(QuoteHandle.getCPtr(stateVariable), stateVariable, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS, QuoteHandle.getCPtr(jumpIntensity), jumpIntensity, QuoteHandle.getCPtr(meanLogJump), meanLogJump, QuoteHandle.getCPtr(jumpVolatility), jumpVolatility), true);
  }

}

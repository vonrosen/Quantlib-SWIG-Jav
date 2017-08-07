/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class BlackScholesMertonProcess extends GeneralizedBlackScholesProcess {
  private transient long swigCPtr;

  protected BlackScholesMertonProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackScholesMertonProcess_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackScholesMertonProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BlackScholesMertonProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackScholesMertonProcess(QuoteHandle s0, YieldTermStructureHandle dividendTS, YieldTermStructureHandle riskFreeTS, BlackVolTermStructureHandle volTS) {
    this(QuantLibJNI.new_BlackScholesMertonProcess(QuoteHandle.getCPtr(s0), s0, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS), true);
  }

}

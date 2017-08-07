/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class AverageBasketPayoff extends BasketPayoff {
  private transient long swigCPtr;

  protected AverageBasketPayoff(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AverageBasketPayoff_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AverageBasketPayoff obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_AverageBasketPayoff(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AverageBasketPayoff(Payoff p, Array a) {
    this(QuantLibJNI.new_AverageBasketPayoff__SWIG_0(Payoff.getCPtr(p), p, Array.getCPtr(a), a), true);
  }

  public AverageBasketPayoff(Payoff p, long n) {
    this(QuantLibJNI.new_AverageBasketPayoff__SWIG_1(Payoff.getCPtr(p), p, n), true);
  }

}

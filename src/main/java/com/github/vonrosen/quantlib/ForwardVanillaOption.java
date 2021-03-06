/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class ForwardVanillaOption extends VanillaOption {
  private transient long swigCPtr;

  protected ForwardVanillaOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ForwardVanillaOption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ForwardVanillaOption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ForwardVanillaOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ForwardVanillaOption(double moneyness, Date resetDate, Payoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_ForwardVanillaOption(moneyness, Date.getCPtr(resetDate), resetDate, Payoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}

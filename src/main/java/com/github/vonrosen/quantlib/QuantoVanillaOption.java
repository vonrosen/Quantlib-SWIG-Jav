/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class QuantoVanillaOption extends VanillaOption {
  private transient long swigCPtr;

  protected QuantoVanillaOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.QuantoVanillaOption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QuantoVanillaOption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_QuantoVanillaOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QuantoVanillaOption(Payoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_QuantoVanillaOption(Payoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public double qvega() {
    return QuantLibJNI.QuantoVanillaOption_qvega(swigCPtr, this);
  }

  public double qrho() {
    return QuantLibJNI.QuantoVanillaOption_qrho(swigCPtr, this);
  }

  public double qlambda() {
    return QuantLibJNI.QuantoVanillaOption_qlambda(swigCPtr, this);
  }

}
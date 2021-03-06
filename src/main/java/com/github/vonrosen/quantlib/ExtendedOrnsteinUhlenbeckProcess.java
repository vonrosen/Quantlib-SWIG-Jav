/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class ExtendedOrnsteinUhlenbeckProcess extends StochasticProcess1D {
  private transient long swigCPtr;

  protected ExtendedOrnsteinUhlenbeckProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ExtendedOrnsteinUhlenbeckProcess_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtendedOrnsteinUhlenbeckProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ExtendedOrnsteinUhlenbeckProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExtendedOrnsteinUhlenbeckProcess(double speed, double sigma, double x0, UnaryFunctionDelegate function, double intEps) {
    this(QuantLibJNI.new_ExtendedOrnsteinUhlenbeckProcess__SWIG_0(speed, sigma, x0, UnaryFunctionDelegate.getCPtr(function), function, intEps), true);
  }

  public ExtendedOrnsteinUhlenbeckProcess(double speed, double sigma, double x0, UnaryFunctionDelegate function) {
    this(QuantLibJNI.new_ExtendedOrnsteinUhlenbeckProcess__SWIG_1(speed, sigma, x0, UnaryFunctionDelegate.getCPtr(function), function), true);
  }

}

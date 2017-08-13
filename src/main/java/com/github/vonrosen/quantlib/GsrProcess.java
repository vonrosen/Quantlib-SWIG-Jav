/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class GsrProcess extends StochasticProcess1D {
  private transient long swigCPtr;

  protected GsrProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GsrProcess_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GsrProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GsrProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GsrProcess(Array times, Array vols, Array reversions, double T) {
    this(QuantLibJNI.new_GsrProcess__SWIG_0(Array.getCPtr(times), times, Array.getCPtr(vols), vols, Array.getCPtr(reversions), reversions, T), true);
  }

  public GsrProcess(Array times, Array vols, Array reversions) {
    this(QuantLibJNI.new_GsrProcess__SWIG_1(Array.getCPtr(times), times, Array.getCPtr(vols), vols, Array.getCPtr(reversions), reversions), true);
  }

  public double sigma(double t) {
    return QuantLibJNI.GsrProcess_sigma(swigCPtr, this, t);
  }

  public double reversion(double t) {
    return QuantLibJNI.GsrProcess_reversion(swigCPtr, this, t);
  }

  public double y(double t) {
    return QuantLibJNI.GsrProcess_y(swigCPtr, this, t);
  }

  public double G(double t, double T, double x) {
    return QuantLibJNI.GsrProcess_G(swigCPtr, this, t, T, x);
  }

  public void setForwardMeasureTime(double t) {
    QuantLibJNI.GsrProcess_setForwardMeasureTime(swigCPtr, this, t);
  }

}
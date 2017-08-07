/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class GammaDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GammaDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GammaDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GammaDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GammaDistribution(double a) {
    this(QuantLibJNI.new_GammaDistribution(a), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.GammaDistribution_getValue(swigCPtr, this, x);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Gaussian1dSwaptionEngine extends PricingEngine {
  private transient long swigCPtr;

  protected Gaussian1dSwaptionEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Gaussian1dSwaptionEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Gaussian1dSwaptionEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Gaussian1dSwaptionEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Gaussian1dSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_Gaussian1dSwaptionEngine__SWIG_0(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

  public Gaussian1dSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation) {
    this(QuantLibJNI.new_Gaussian1dSwaptionEngine__SWIG_1(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation), true);
  }

  public Gaussian1dSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff) {
    this(QuantLibJNI.new_Gaussian1dSwaptionEngine__SWIG_2(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff), true);
  }

  public Gaussian1dSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs) {
    this(QuantLibJNI.new_Gaussian1dSwaptionEngine__SWIG_3(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs), true);
  }

  public Gaussian1dSwaptionEngine(Gaussian1dModel model, int integrationPoints) {
    this(QuantLibJNI.new_Gaussian1dSwaptionEngine__SWIG_4(Gaussian1dModel.getCPtr(model), model, integrationPoints), true);
  }

  public Gaussian1dSwaptionEngine(Gaussian1dModel model) {
    this(QuantLibJNI.new_Gaussian1dSwaptionEngine__SWIG_5(Gaussian1dModel.getCPtr(model), model), true);
  }

}

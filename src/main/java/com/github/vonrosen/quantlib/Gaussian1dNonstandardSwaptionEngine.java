/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Gaussian1dNonstandardSwaptionEngine extends PricingEngine {
  private transient long swigCPtr;

  protected Gaussian1dNonstandardSwaptionEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Gaussian1dNonstandardSwaptionEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Gaussian1dNonstandardSwaptionEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Gaussian1dNonstandardSwaptionEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, QuoteHandle oas, YieldTermStructureHandle discountCurve, _Gaussian1dNonstandardSwaptionEngine.Probabilities probabilities) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_0(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, QuoteHandle.getCPtr(oas), oas, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, probabilities.swigValue()), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, QuoteHandle oas, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_1(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, QuoteHandle.getCPtr(oas), oas, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation, QuoteHandle oas) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_2(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation, QuoteHandle.getCPtr(oas), oas), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff, boolean flatPayoffExtrapolation) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_3(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff, flatPayoffExtrapolation), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs, boolean extrapolatePayoff) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_4(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs, extrapolatePayoff), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints, double stddevs) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_5(Gaussian1dModel.getCPtr(model), model, integrationPoints, stddevs), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model, int integrationPoints) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_6(Gaussian1dModel.getCPtr(model), model, integrationPoints), true);
  }

  public Gaussian1dNonstandardSwaptionEngine(Gaussian1dModel model) {
    this(QuantLibJNI.new_Gaussian1dNonstandardSwaptionEngine__SWIG_7(Gaussian1dModel.getCPtr(model), model), true);
  }

  public final static _Gaussian1dNonstandardSwaptionEngine.Probabilities None = _Gaussian1dNonstandardSwaptionEngine.Probabilities.swigToEnum(QuantLibJNI.Gaussian1dNonstandardSwaptionEngine_None_get());
  public final static _Gaussian1dNonstandardSwaptionEngine.Probabilities Naive = _Gaussian1dNonstandardSwaptionEngine.Probabilities.swigToEnum(QuantLibJNI.Gaussian1dNonstandardSwaptionEngine_Naive_get());
  public final static _Gaussian1dNonstandardSwaptionEngine.Probabilities Digital = _Gaussian1dNonstandardSwaptionEngine.Probabilities.swigToEnum(QuantLibJNI.Gaussian1dNonstandardSwaptionEngine_Digital_get());
}

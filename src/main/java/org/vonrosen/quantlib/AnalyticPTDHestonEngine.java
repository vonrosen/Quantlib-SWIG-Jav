/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class AnalyticPTDHestonEngine extends PricingEngine {
  private transient long swigCPtr;

  protected AnalyticPTDHestonEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticPTDHestonEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticPTDHestonEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_AnalyticPTDHestonEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticPTDHestonEngine(PiecewiseTimeDependentHestonModel model, double relTolerance, long maxEvaluations) {
    this(QuantLibJNI.new_AnalyticPTDHestonEngine__SWIG_0(PiecewiseTimeDependentHestonModel.getCPtr(model), model, relTolerance, maxEvaluations), true);
  }

  public AnalyticPTDHestonEngine(PiecewiseTimeDependentHestonModel model, long integrationOrder) {
    this(QuantLibJNI.new_AnalyticPTDHestonEngine__SWIG_1(PiecewiseTimeDependentHestonModel.getCPtr(model), model, integrationOrder), true);
  }

  public AnalyticPTDHestonEngine(PiecewiseTimeDependentHestonModel model) {
    this(QuantLibJNI.new_AnalyticPTDHestonEngine__SWIG_2(PiecewiseTimeDependentHestonModel.getCPtr(model), model), true);
  }

}

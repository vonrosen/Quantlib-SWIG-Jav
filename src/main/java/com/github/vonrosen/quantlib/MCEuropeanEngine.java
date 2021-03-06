/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class MCEuropeanEngine extends PricingEngine {
  private transient long swigCPtr;

  protected MCEuropeanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCEuropeanEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCEuropeanEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MCEuropeanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps, timeStepsPerYear), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits, int timeSteps) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_7(GeneralizedBlackScholesProcess.getCPtr(process), process, traits, timeSteps), true);
  }

  public MCEuropeanEngine(GeneralizedBlackScholesProcess process, String traits) {
    this(QuantLibJNI.new_MCEuropeanEngine__SWIG_8(GeneralizedBlackScholesProcess.getCPtr(process), process, traits), true);
  }

}

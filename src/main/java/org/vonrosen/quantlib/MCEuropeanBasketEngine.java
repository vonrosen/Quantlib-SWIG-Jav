/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class MCEuropeanBasketEngine extends PricingEngine {
  private transient long swigCPtr;

  protected MCEuropeanBasketEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCEuropeanBasketEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCEuropeanBasketEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MCEuropeanBasketEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_0(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_1(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_2(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_3(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_4(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_5(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps, long timeStepsPerYear) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_6(StochasticProcessArray.getCPtr(process), process, traits, timeSteps, timeStepsPerYear), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits, long timeSteps) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_7(StochasticProcessArray.getCPtr(process), process, traits, timeSteps), true);
  }

  public MCEuropeanBasketEngine(StochasticProcessArray process, String traits) {
    this(QuantLibJNI.new_MCEuropeanBasketEngine__SWIG_8(StochasticProcessArray.getCPtr(process), process, traits), true);
  }

}

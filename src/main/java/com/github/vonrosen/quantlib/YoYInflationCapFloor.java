/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class YoYInflationCapFloor extends Instrument {
  private transient long swigCPtr;

  protected YoYInflationCapFloor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationCapFloor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationCapFloor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_YoYInflationCapFloor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy, long maxEvaluations, double minVol, double maxVol) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_0(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy, maxEvaluations, minVol, maxVol);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy, long maxEvaluations, double minVol) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_1(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy, maxEvaluations, minVol);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy, long maxEvaluations) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_2(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy, maxEvaluations);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_3(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_4(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess);
  }

  public YoYInflationCapFloor() {
    this(QuantLibJNI.new_YoYInflationCapFloor(), true);
  }

}

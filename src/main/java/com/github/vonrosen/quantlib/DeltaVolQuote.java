/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class DeltaVolQuote {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DeltaVolQuote(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DeltaVolQuote obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DeltaVolQuote(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public _DeltaVolQuote __deref__() {
    long cPtr = QuantLibJNI.DeltaVolQuote___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new _DeltaVolQuote(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.DeltaVolQuote_isNull(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.DeltaVolQuote_asObservable(swigCPtr, this), true);
  }

  public DeltaVolQuote(double delta, QuoteHandle vol, double maturity, _DeltaVolQuote.DeltaType deltaType) {
    this(QuantLibJNI.new_DeltaVolQuote__SWIG_0(delta, QuoteHandle.getCPtr(vol), vol, maturity, deltaType.swigValue()), true);
  }

  public DeltaVolQuote(QuoteHandle vol, _DeltaVolQuote.DeltaType deltaType, double maturity, _DeltaVolQuote.AtmType atmType) {
    this(QuantLibJNI.new_DeltaVolQuote__SWIG_1(QuoteHandle.getCPtr(vol), vol, deltaType.swigValue(), maturity, atmType.swigValue()), true);
  }

  public double value() {
    return QuantLibJNI.DeltaVolQuote_value(swigCPtr, this);
  }

  public final static _DeltaVolQuote.DeltaType Spot = _DeltaVolQuote.DeltaType.swigToEnum(QuantLibJNI.DeltaVolQuote_Spot_get());
  public final static _DeltaVolQuote.DeltaType Fwd = _DeltaVolQuote.DeltaType.swigToEnum(QuantLibJNI.DeltaVolQuote_Fwd_get());
  public final static _DeltaVolQuote.DeltaType PaSpot = _DeltaVolQuote.DeltaType.swigToEnum(QuantLibJNI.DeltaVolQuote_PaSpot_get());
  public final static _DeltaVolQuote.DeltaType PaFwd = _DeltaVolQuote.DeltaType.swigToEnum(QuantLibJNI.DeltaVolQuote_PaFwd_get());
  public final static _DeltaVolQuote.AtmType AtmNull = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmNull_get());
  public final static _DeltaVolQuote.AtmType AtmSpot = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmSpot_get());
  public final static _DeltaVolQuote.AtmType AtmFwd = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmFwd_get());
  public final static _DeltaVolQuote.AtmType AtmDeltaNeutral = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmDeltaNeutral_get());
  public final static _DeltaVolQuote.AtmType AtmVegaMax = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmVegaMax_get());
  public final static _DeltaVolQuote.AtmType AtmGammaMax = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmGammaMax_get());
  public final static _DeltaVolQuote.AtmType AtmPutCall50 = _DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_AtmPutCall50_get());
}

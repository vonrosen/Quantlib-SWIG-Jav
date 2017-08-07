/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class AssetSwap extends Swap {
  private transient long swigCPtr;

  protected AssetSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AssetSwap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AssetSwap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_AssetSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AssetSwap(boolean payFixedRate, Bond bond, double bondCleanPrice, InterestRateIndex index, double spread, Schedule floatSchedule, DayCounter floatingDayCount, boolean parAssetSwap) {
    this(QuantLibJNI.new_AssetSwap__SWIG_0(payFixedRate, Bond.getCPtr(bond), bond, bondCleanPrice, InterestRateIndex.getCPtr(index), index, spread, Schedule.getCPtr(floatSchedule), floatSchedule, DayCounter.getCPtr(floatingDayCount), floatingDayCount, parAssetSwap), true);
  }

  public AssetSwap(boolean payFixedRate, Bond bond, double bondCleanPrice, InterestRateIndex index, double spread, Schedule floatSchedule, DayCounter floatingDayCount) {
    this(QuantLibJNI.new_AssetSwap__SWIG_1(payFixedRate, Bond.getCPtr(bond), bond, bondCleanPrice, InterestRateIndex.getCPtr(index), index, spread, Schedule.getCPtr(floatSchedule), floatSchedule, DayCounter.getCPtr(floatingDayCount), floatingDayCount), true);
  }

  public AssetSwap(boolean payFixedRate, Bond bond, double bondCleanPrice, InterestRateIndex index, double spread, Schedule floatSchedule) {
    this(QuantLibJNI.new_AssetSwap__SWIG_2(payFixedRate, Bond.getCPtr(bond), bond, bondCleanPrice, InterestRateIndex.getCPtr(index), index, spread, Schedule.getCPtr(floatSchedule), floatSchedule), true);
  }

  public AssetSwap(boolean payFixedRate, Bond bond, double bondCleanPrice, InterestRateIndex index, double spread) {
    this(QuantLibJNI.new_AssetSwap__SWIG_3(payFixedRate, Bond.getCPtr(bond), bond, bondCleanPrice, InterestRateIndex.getCPtr(index), index, spread), true);
  }

  public double fairCleanPrice() {
    return QuantLibJNI.AssetSwap_fairCleanPrice(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.AssetSwap_fairSpread(swigCPtr, this);
  }

}

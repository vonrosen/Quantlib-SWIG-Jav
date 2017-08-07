/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class CmsCoupon extends FloatingRateCoupon {
  private transient long swigCPtr;

  protected CmsCoupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CmsCoupon_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CmsCoupon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CmsCoupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index, double gearing, double spread, Date refPeriodStart, Date refPeriodEnd, DayCounter dayCounter, boolean isInArrears) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_0(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd, DayCounter.getCPtr(dayCounter), dayCounter, isInArrears), true);
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index, double gearing, double spread, Date refPeriodStart, Date refPeriodEnd, DayCounter dayCounter) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_1(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index, double gearing, double spread, Date refPeriodStart, Date refPeriodEnd) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_2(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd), true);
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index, double gearing, double spread, Date refPeriodStart) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_3(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index, gearing, spread, Date.getCPtr(refPeriodStart), refPeriodStart), true);
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index, double gearing, double spread) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_4(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index, gearing, spread), true);
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index, double gearing) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_5(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index, gearing), true);
  }

  public CmsCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, int fixingDays, SwapIndex index) {
    this(QuantLibJNI.new_CmsCoupon__SWIG_6(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapIndex.getCPtr(index), index), true);
  }

}

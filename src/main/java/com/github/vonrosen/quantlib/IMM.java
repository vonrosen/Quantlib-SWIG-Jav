/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class IMM {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IMM(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IMM obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_IMM(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean isIMMdate(Date d, boolean mainCycle) {
    return QuantLibJNI.IMM_isIMMdate__SWIG_0(Date.getCPtr(d), d, mainCycle);
  }

  public static boolean isIMMdate(Date d) {
    return QuantLibJNI.IMM_isIMMdate__SWIG_1(Date.getCPtr(d), d);
  }

  public static boolean isIMMcode(String code, boolean mainCycle) {
    return QuantLibJNI.IMM_isIMMcode__SWIG_0(code, mainCycle);
  }

  public static boolean isIMMcode(String code) {
    return QuantLibJNI.IMM_isIMMcode__SWIG_1(code);
  }

  public static String code(Date immDate) {
    return QuantLibJNI.IMM_code(Date.getCPtr(immDate), immDate);
  }

  public static Date date(String immCode, Date referenceDate) {
    return new Date(QuantLibJNI.IMM_date__SWIG_0(immCode, Date.getCPtr(referenceDate), referenceDate), true);
  }

  public static Date date(String immCode) {
    return new Date(QuantLibJNI.IMM_date__SWIG_1(immCode), true);
  }

  public static Date nextDate(Date d, boolean mainCycle) {
    return new Date(QuantLibJNI.IMM_nextDate__SWIG_0(Date.getCPtr(d), d, mainCycle), true);
  }

  public static Date nextDate(Date d) {
    return new Date(QuantLibJNI.IMM_nextDate__SWIG_1(Date.getCPtr(d), d), true);
  }

  public static Date nextDate() {
    return new Date(QuantLibJNI.IMM_nextDate__SWIG_2(), true);
  }

  public static Date nextDate(String immCode, boolean mainCycle, Date referenceDate) {
    return new Date(QuantLibJNI.IMM_nextDate__SWIG_3(immCode, mainCycle, Date.getCPtr(referenceDate), referenceDate), true);
  }

  public static Date nextDate(String immCode, boolean mainCycle) {
    return new Date(QuantLibJNI.IMM_nextDate__SWIG_4(immCode, mainCycle), true);
  }

  public static Date nextDate(String immCode) {
    return new Date(QuantLibJNI.IMM_nextDate__SWIG_5(immCode), true);
  }

  public static String nextCode(Date d, boolean mainCycle) {
    return QuantLibJNI.IMM_nextCode__SWIG_0(Date.getCPtr(d), d, mainCycle);
  }

  public static String nextCode(Date d) {
    return QuantLibJNI.IMM_nextCode__SWIG_1(Date.getCPtr(d), d);
  }

  public static String nextCode() {
    return QuantLibJNI.IMM_nextCode__SWIG_2();
  }

  public static String nextCode(String immCode, boolean mainCycle, Date referenceDate) {
    return QuantLibJNI.IMM_nextCode__SWIG_3(immCode, mainCycle, Date.getCPtr(referenceDate), referenceDate);
  }

  public static String nextCode(String immCode, boolean mainCycle) {
    return QuantLibJNI.IMM_nextCode__SWIG_4(immCode, mainCycle);
  }

  public static String nextCode(String immCode) {
    return QuantLibJNI.IMM_nextCode__SWIG_5(immCode);
  }

  public IMM() {
    this(QuantLibJNI.new_IMM(), true);
  }

  public final static class Month {
    public final static IMM.Month F = new IMM.Month("F", QuantLibJNI.IMM_F_get());
    public final static IMM.Month G = new IMM.Month("G", QuantLibJNI.IMM_G_get());
    public final static IMM.Month H = new IMM.Month("H", QuantLibJNI.IMM_H_get());
    public final static IMM.Month J = new IMM.Month("J", QuantLibJNI.IMM_J_get());
    public final static IMM.Month K = new IMM.Month("K", QuantLibJNI.IMM_K_get());
    public final static IMM.Month M = new IMM.Month("M", QuantLibJNI.IMM_M_get());
    public final static IMM.Month N = new IMM.Month("N", QuantLibJNI.IMM_N_get());
    public final static IMM.Month Q = new IMM.Month("Q", QuantLibJNI.IMM_Q_get());
    public final static IMM.Month U = new IMM.Month("U", QuantLibJNI.IMM_U_get());
    public final static IMM.Month V = new IMM.Month("V", QuantLibJNI.IMM_V_get());
    public final static IMM.Month X = new IMM.Month("X", QuantLibJNI.IMM_X_get());
    public final static IMM.Month Z = new IMM.Month("Z", QuantLibJNI.IMM_Z_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Month swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Month.class + " with value " + swigValue);
    }

    private Month(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Month(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Month(String swigName, Month swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Month[] swigValues = { F, G, H, J, K, M, N, Q, U, V, X, Z };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
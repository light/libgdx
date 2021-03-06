/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btPersistentManifold extends btTypedObject {
  private long swigCPtr;

  protected btPersistentManifold(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btPersistentManifold_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btPersistentManifold obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btPersistentManifold(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_companionIdA(int value) {
    gdxBulletJNI.btPersistentManifold_m_companionIdA_set(swigCPtr, this, value);
  }

  public int getM_companionIdA() {
    return gdxBulletJNI.btPersistentManifold_m_companionIdA_get(swigCPtr, this);
  }

  public void setM_companionIdB(int value) {
    gdxBulletJNI.btPersistentManifold_m_companionIdB_set(swigCPtr, this, value);
  }

  public int getM_companionIdB() {
    return gdxBulletJNI.btPersistentManifold_m_companionIdB_get(swigCPtr, this);
  }

  public void setM_index1a(int value) {
    gdxBulletJNI.btPersistentManifold_m_index1a_set(swigCPtr, this, value);
  }

  public int getM_index1a() {
    return gdxBulletJNI.btPersistentManifold_m_index1a_get(swigCPtr, this);
  }

  public btPersistentManifold() {
    this(gdxBulletJNI.new_btPersistentManifold__SWIG_0(), true);
  }

  public btPersistentManifold(btCollisionObject body0, btCollisionObject body1, int arg2, float contactBreakingThreshold, float contactProcessingThreshold) {
    this(gdxBulletJNI.new_btPersistentManifold__SWIG_1(btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1, arg2, contactBreakingThreshold, contactProcessingThreshold), true);
  }

  public btCollisionObject getBody0() {
	long cPtr = gdxBulletJNI.btPersistentManifold_getBody0(swigCPtr, this);
	return (cPtr == 0) ? null : btCollisionObject.getInstance(cPtr, false);
}

  public btCollisionObject getBody1() {
	long cPtr = gdxBulletJNI.btPersistentManifold_getBody1(swigCPtr, this);
	return (cPtr == 0) ? null : btCollisionObject.getInstance(cPtr, false);
}

  public void setBodies(btCollisionObject body0, btCollisionObject body1) {
    gdxBulletJNI.btPersistentManifold_setBodies(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

  public void clearUserCache(btManifoldPoint pt) {
    gdxBulletJNI.btPersistentManifold_clearUserCache(swigCPtr, this, btManifoldPoint.getCPtr(pt), pt);
  }

  public int getNumContacts() {
    return gdxBulletJNI.btPersistentManifold_getNumContacts(swigCPtr, this);
  }

  public btManifoldPoint getContactPoint(int index) {
    return new btManifoldPoint(gdxBulletJNI.btPersistentManifold_getContactPoint__SWIG_0(swigCPtr, this, index), false);
  }

  public float getContactBreakingThreshold() {
    return gdxBulletJNI.btPersistentManifold_getContactBreakingThreshold(swigCPtr, this);
  }

  public float getContactProcessingThreshold() {
    return gdxBulletJNI.btPersistentManifold_getContactProcessingThreshold(swigCPtr, this);
  }

  public int getCacheEntry(btManifoldPoint newPoint) {
    return gdxBulletJNI.btPersistentManifold_getCacheEntry(swigCPtr, this, btManifoldPoint.getCPtr(newPoint), newPoint);
  }

  public int addManifoldPoint(btManifoldPoint newPoint) {
    return gdxBulletJNI.btPersistentManifold_addManifoldPoint(swigCPtr, this, btManifoldPoint.getCPtr(newPoint), newPoint);
  }

  public void removeContactPoint(int index) {
    gdxBulletJNI.btPersistentManifold_removeContactPoint(swigCPtr, this, index);
  }

  public void replaceContactPoint(btManifoldPoint newPoint, int insertIndex) {
    gdxBulletJNI.btPersistentManifold_replaceContactPoint(swigCPtr, this, btManifoldPoint.getCPtr(newPoint), newPoint, insertIndex);
  }

  public boolean validContactDistance(btManifoldPoint pt) {
    return gdxBulletJNI.btPersistentManifold_validContactDistance(swigCPtr, this, btManifoldPoint.getCPtr(pt), pt);
  }

  public void refreshContactPoints(Matrix4 trA, Matrix4 trB) {
    gdxBulletJNI.btPersistentManifold_refreshContactPoints(swigCPtr, this, trA, trB);
  }

  public void clearManifold() {
    gdxBulletJNI.btPersistentManifold_clearManifold(swigCPtr, this);
  }

}

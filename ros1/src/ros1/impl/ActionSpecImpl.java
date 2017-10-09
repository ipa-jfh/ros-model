/**
 */
package ros1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ros1.ActionSpec;
import ros1.MessageDefinition;
import ros1.Ros1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros1.impl.ActionSpecImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link ros1.impl.ActionSpecImpl#getResult <em>Result</em>}</li>
 *   <li>{@link ros1.impl.ActionSpecImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionSpecImpl extends SpecBaseImpl implements ActionSpec {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition goal;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition result;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition feedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ros1Package.Literals.ACTION_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(MessageDefinition newGoal, NotificationChain msgs) {
		MessageDefinition oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ros1Package.ACTION_SPEC__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(MessageDefinition newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ros1Package.ACTION_SPEC__GOAL, null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ros1Package.ACTION_SPEC__GOAL, null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ros1Package.ACTION_SPEC__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(MessageDefinition newResult, NotificationChain msgs) {
		MessageDefinition oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ros1Package.ACTION_SPEC__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(MessageDefinition newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ros1Package.ACTION_SPEC__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ros1Package.ACTION_SPEC__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ros1Package.ACTION_SPEC__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedback(MessageDefinition newFeedback, NotificationChain msgs) {
		MessageDefinition oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ros1Package.ACTION_SPEC__FEEDBACK, oldFeedback, newFeedback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(MessageDefinition newFeedback) {
		if (newFeedback != feedback) {
			NotificationChain msgs = null;
			if (feedback != null)
				msgs = ((InternalEObject)feedback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ros1Package.ACTION_SPEC__FEEDBACK, null, msgs);
			if (newFeedback != null)
				msgs = ((InternalEObject)newFeedback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ros1Package.ACTION_SPEC__FEEDBACK, null, msgs);
			msgs = basicSetFeedback(newFeedback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ros1Package.ACTION_SPEC__FEEDBACK, newFeedback, newFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ros1Package.ACTION_SPEC__GOAL:
				return basicSetGoal(null, msgs);
			case Ros1Package.ACTION_SPEC__RESULT:
				return basicSetResult(null, msgs);
			case Ros1Package.ACTION_SPEC__FEEDBACK:
				return basicSetFeedback(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ros1Package.ACTION_SPEC__GOAL:
				return getGoal();
			case Ros1Package.ACTION_SPEC__RESULT:
				return getResult();
			case Ros1Package.ACTION_SPEC__FEEDBACK:
				return getFeedback();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ros1Package.ACTION_SPEC__GOAL:
				setGoal((MessageDefinition)newValue);
				return;
			case Ros1Package.ACTION_SPEC__RESULT:
				setResult((MessageDefinition)newValue);
				return;
			case Ros1Package.ACTION_SPEC__FEEDBACK:
				setFeedback((MessageDefinition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ros1Package.ACTION_SPEC__GOAL:
				setGoal((MessageDefinition)null);
				return;
			case Ros1Package.ACTION_SPEC__RESULT:
				setResult((MessageDefinition)null);
				return;
			case Ros1Package.ACTION_SPEC__FEEDBACK:
				setFeedback((MessageDefinition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ros1Package.ACTION_SPEC__GOAL:
				return goal != null;
			case Ros1Package.ACTION_SPEC__RESULT:
				return result != null;
			case Ros1Package.ACTION_SPEC__FEEDBACK:
				return feedback != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionSpecImpl
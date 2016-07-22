/**
 */
package com.github.maybeec.oomph.task.fsmove.impl;

import com.github.maybeec.oomph.task.fsmove.FSMoveTask;
import com.github.maybeec.oomph.task.fsmove.fsmovePackage;
import com.github.maybeec.oomph.task.fsmove.core.FSMoveUtil;
import com.github.maybeec.oomph.task.fsmove.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.fsmove.core.impl.FSMoveUtilImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FS Move Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMoveTaskImpl extends SetupTaskImpl implements FSMoveTask {
	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 500;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMoveTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fsmovePackage.Literals.FS_MOVE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fsmovePackage.FS_MOVE_TASK__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fsmovePackage.FS_MOVE_TASK__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fsmovePackage.FS_MOVE_TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case fsmovePackage.FS_MOVE_TASK__RESOURCE:
				return getResource();
			case fsmovePackage.FS_MOVE_TASK__DESTINATION:
				return getDestination();
			case fsmovePackage.FS_MOVE_TASK__PRIORITY:
				return getPriority();
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
			case fsmovePackage.FS_MOVE_TASK__RESOURCE:
				setResource((String)newValue);
				return;
			case fsmovePackage.FS_MOVE_TASK__DESTINATION:
				setDestination((String)newValue);
				return;
			case fsmovePackage.FS_MOVE_TASK__PRIORITY:
				setPriority((Integer)newValue);
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
			case fsmovePackage.FS_MOVE_TASK__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case fsmovePackage.FS_MOVE_TASK__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case fsmovePackage.FS_MOVE_TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case fsmovePackage.FS_MOVE_TASK__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case fsmovePackage.FS_MOVE_TASK__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case fsmovePackage.FS_MOVE_TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resource: ");
		result.append(resource);
		result.append(", destination: ");
		result.append(destination);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

	public boolean isNeeded(SetupTaskContext context) throws Exception {
		return true;
	}

	public void perform(SetupTaskContext context) throws Exception {
		SetupTaskLogger.getLogger().setContext(context);
		
		FSMoveUtil fsMoveUtil = new FSMoveUtilImpl();
		fsMoveUtil.move(resource, destination);
		
	}

} //FSMoveTaskImpl

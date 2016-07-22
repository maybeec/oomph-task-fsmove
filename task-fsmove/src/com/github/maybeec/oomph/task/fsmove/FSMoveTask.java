/**
 */
package com.github.maybeec.oomph.task.fsmove;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FS Move Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see com.github.maybeec.oomph.task.fsmove.fsmovePackage#getFSMoveTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.fs.move' repository='https://themetalone.github.io/oomph-task-fsmove/update/' installableUnits='task-fsmove.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP MANUAL'"
 * @generated
 */
public interface FSMoveTask extends SetupTask {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see com.github.maybeec.oomph.task.fsmove.fsmovePackage#getFSMoveTask_Resource()
	 * @model required="true"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see com.github.maybeec.oomph.task.fsmove.fsmovePackage#getFSMoveTask_Destination()
	 * @model required="true"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see com.github.maybeec.oomph.task.fsmove.fsmovePackage#getFSMoveTask_Priority()
	 * @model default="500"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // FSMoveTask

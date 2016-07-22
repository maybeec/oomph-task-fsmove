/**
 */
package com.github.maybeec.oomph.task.fsmove;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.oomph.setup.SetupPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.maybeec.oomph.task.fsmove.fsmoveFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='http://www.example.org/task-fsmove/schemas/Oomph-task-fsmove.ecore'"
 * @generated
 */
public interface fsmovePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsmove";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://maybeec.github.io/task-fsmove/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsmove";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fsmovePackage eINSTANCE = com.github.maybeec.oomph.task.fsmove.impl.fsmovePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl <em>FS Move Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl
	 * @see com.github.maybeec.oomph.task.fsmove.impl.fsmovePackageImpl#getFSMoveTask()
	 * @generated
	 */
	int FS_MOVE_TASK = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__ID = SetupPackage.SETUP_TASK__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

	/**
	 * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__RESOURCE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__DESTINATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK__PRIORITY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FS Move Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_MOVE_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask <em>FS Move Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FS Move Task</em>'.
	 * @see com.github.maybeec.oomph.task.fsmove.FSMoveTask
	 * @generated
	 */
	EClass getFSMoveTask();

	/**
	 * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see com.github.maybeec.oomph.task.fsmove.FSMoveTask#getResource()
	 * @see #getFSMoveTask()
	 * @generated
	 */
	EAttribute getFSMoveTask_Resource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see com.github.maybeec.oomph.task.fsmove.FSMoveTask#getDestination()
	 * @see #getFSMoveTask()
	 * @generated
	 */
	EAttribute getFSMoveTask_Destination();

	/**
	 * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.fsmove.FSMoveTask#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see com.github.maybeec.oomph.task.fsmove.FSMoveTask#getPriority()
	 * @see #getFSMoveTask()
	 * @generated
	 */
	EAttribute getFSMoveTask_Priority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	fsmoveFactory getfsmoveFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl <em>FS Move Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.maybeec.oomph.task.fsmove.impl.FSMoveTaskImpl
		 * @see com.github.maybeec.oomph.task.fsmove.impl.fsmovePackageImpl#getFSMoveTask()
		 * @generated
		 */
		EClass FS_MOVE_TASK = eINSTANCE.getFSMoveTask();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FS_MOVE_TASK__RESOURCE = eINSTANCE.getFSMoveTask_Resource();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FS_MOVE_TASK__DESTINATION = eINSTANCE.getFSMoveTask_Destination();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FS_MOVE_TASK__PRIORITY = eINSTANCE.getFSMoveTask_Priority();

	}

} //fsmovePackage

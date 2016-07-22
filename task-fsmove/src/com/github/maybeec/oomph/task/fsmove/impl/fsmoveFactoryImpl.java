/**
 */
package com.github.maybeec.oomph.task.fsmove.impl;

import com.github.maybeec.oomph.task.fsmove.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fsmoveFactoryImpl extends EFactoryImpl implements fsmoveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static fsmoveFactory init() {
		try {
			fsmoveFactory thefsmoveFactory = (fsmoveFactory)EPackage.Registry.INSTANCE.getEFactory(fsmovePackage.eNS_URI);
			if (thefsmoveFactory != null) {
				return thefsmoveFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new fsmoveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fsmoveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case fsmovePackage.FS_MOVE_TASK: return createFSMoveTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMoveTask createFSMoveTask() {
		FSMoveTaskImpl fsMoveTask = new FSMoveTaskImpl();
		return fsMoveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fsmovePackage getfsmovePackage() {
		return (fsmovePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static fsmovePackage getPackage() {
		return fsmovePackage.eINSTANCE;
	}

} //fsmoveFactoryImpl

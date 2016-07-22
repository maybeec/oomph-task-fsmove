/**
 */
package com.github.maybeec.oomph.task.fsmove;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.maybeec.oomph.task.fsmove.fsmovePackage
 * @generated
 */
public interface fsmoveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fsmoveFactory eINSTANCE = com.github.maybeec.oomph.task.fsmove.impl.fsmoveFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FS Move Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FS Move Task</em>'.
	 * @generated
	 */
	FSMoveTask createFSMoveTask();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	fsmovePackage getfsmovePackage();

} //fsmoveFactory

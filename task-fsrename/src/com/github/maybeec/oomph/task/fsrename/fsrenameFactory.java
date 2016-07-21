/**
 */
package com.github.maybeec.oomph.task.fsrename;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.maybeec.oomph.task.fsrename.fsrenamePackage
 * @generated
 */
public interface fsrenameFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  fsrenameFactory eINSTANCE = com.github.maybeec.oomph.task.fsrename.impl.fsrenameFactoryImpl.init();

  /**
   * Returns a new object of class '<em>FS Rename Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FS Rename Task</em>'.
   * @generated
   */
  FSRenameTask createFSRenameTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  fsrenamePackage getfsrenamePackage();

} // fsrenameFactory

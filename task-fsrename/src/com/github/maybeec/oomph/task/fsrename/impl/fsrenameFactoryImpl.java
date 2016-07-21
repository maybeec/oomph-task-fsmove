/**
 */
package com.github.maybeec.oomph.task.fsrename.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.github.maybeec.oomph.task.fsrename.FSRenameTask;
import com.github.maybeec.oomph.task.fsrename.fsrenameFactory;
import com.github.maybeec.oomph.task.fsrename.fsrenamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fsrenameFactoryImpl extends EFactoryImpl implements fsrenameFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static fsrenameFactory init()
  {
    try
    {
      fsrenameFactory thefsrenameFactory = (fsrenameFactory)EPackage.Registry.INSTANCE.getEFactory(fsrenamePackage.eNS_URI);
      if (thefsrenameFactory != null)
      {
        return thefsrenameFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new fsrenameFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fsrenameFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case fsrenamePackage.FS_RENAME_TASK:
      return createFSRenameTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FSRenameTask createFSRenameTask()
  {
    FSRenameTaskImpl fsRenameTask = new FSRenameTaskImpl();
    return fsRenameTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fsrenamePackage getfsrenamePackage()
  {
    return (fsrenamePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static fsrenamePackage getPackage()
  {
    return fsrenamePackage.eINSTANCE;
  }

} // fsrenameFactoryImpl

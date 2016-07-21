/**
 */
package com.github.maybeec.oomph.task.fsrename.impl;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.github.maybeec.oomph.task.fsrename.FSRenameTask;
import com.github.maybeec.oomph.task.fsrename.fsrenameFactory;
import com.github.maybeec.oomph.task.fsrename.fsrenamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fsrenamePackageImpl extends EPackageImpl implements fsrenamePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fsRenameTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.github.maybeec.oomph.task.fsrename.fsrenamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private fsrenamePackageImpl()
  {
    super(eNS_URI, fsrenameFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link fsrenamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static fsrenamePackage init()
  {
    if (isInited)
    {
      return (fsrenamePackage)EPackage.Registry.INSTANCE.getEPackage(fsrenamePackage.eNS_URI);
    }

    // Obtain or create and register package
    fsrenamePackageImpl thefsrenamePackage = (fsrenamePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof fsrenamePackageImpl
        ? EPackage.Registry.INSTANCE.get(eNS_URI) : new fsrenamePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thefsrenamePackage.createPackageContents();

    // Initialize created meta-data
    thefsrenamePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thefsrenamePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(fsrenamePackage.eNS_URI, thefsrenamePackage);
    return thefsrenamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFSRenameTask()
  {
    return fsRenameTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSRenameTask_Resource()
  {
    return (EAttribute)fsRenameTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSRenameTask_Destination()
  {
    return (EAttribute)fsRenameTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFSRenameTask_Priority()
  {
    return (EAttribute)fsRenameTaskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fsrenameFactory getfsrenameFactory()
  {
    return (fsrenameFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    fsRenameTaskEClass = createEClass(FS_RENAME_TASK);
    createEAttribute(fsRenameTaskEClass, FS_RENAME_TASK__RESOURCE);
    createEAttribute(fsRenameTaskEClass, FS_RENAME_TASK__DESTINATION);
    createEAttribute(fsRenameTaskEClass, FS_RENAME_TASK__PRIORITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fsRenameTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(fsRenameTaskEClass, FSRenameTask.class, "FSRenameTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFSRenameTask_Resource(), ecorePackage.getEString(), "resource", null, 1, 1, FSRenameTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFSRenameTask_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, FSRenameTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFSRenameTask_Priority(), ecorePackage.getEInt(), "priority", "500", 0, 1, FSRenameTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("http://www.example.org/task-fsrename/schemas/Oomph-task-fsrename.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation", "http://www.example.org/task-fsrename/schemas/Oomph-task-fsrename.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(fsRenameTaskEClass, source, new String[] { "variableName", "p2.fs.rename", "repository", "http://download.example.org/task-fsrename/updates",
        "installableUnits", "task-fsrename.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(fsRenameTaskEClass, source, new String[] { "triggers", "BOOTSTRAP MANUAL" });
  }

} // fsrenamePackageImpl

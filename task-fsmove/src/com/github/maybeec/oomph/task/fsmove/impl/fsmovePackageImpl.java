/**
 */
package com.github.maybeec.oomph.task.fsmove.impl;

import com.github.maybeec.oomph.task.fsmove.FSMoveTask;
import com.github.maybeec.oomph.task.fsmove.fsmoveFactory;
import com.github.maybeec.oomph.task.fsmove.fsmovePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.oomph.setup.SetupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fsmovePackageImpl extends EPackageImpl implements fsmovePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsMoveTaskEClass = null;

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
	 * @see com.github.maybeec.oomph.task.fsmove.fsmovePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private fsmovePackageImpl() {
		super(eNS_URI, fsmoveFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link fsmovePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static fsmovePackage init() {
		if (isInited) return (fsmovePackage)EPackage.Registry.INSTANCE.getEPackage(fsmovePackage.eNS_URI);

		// Obtain or create and register package
		fsmovePackageImpl thefsmovePackage = (fsmovePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof fsmovePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new fsmovePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SetupPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thefsmovePackage.createPackageContents();

		// Initialize created meta-data
		thefsmovePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thefsmovePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(fsmovePackage.eNS_URI, thefsmovePackage);
		return thefsmovePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMoveTask() {
		return fsMoveTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMoveTask_Resource() {
		return (EAttribute)fsMoveTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMoveTask_Destination() {
		return (EAttribute)fsMoveTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMoveTask_Priority() {
		return (EAttribute)fsMoveTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fsmoveFactory getfsmoveFactory() {
		return (fsmoveFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fsMoveTaskEClass = createEClass(FS_MOVE_TASK);
		createEAttribute(fsMoveTaskEClass, FS_MOVE_TASK__RESOURCE);
		createEAttribute(fsMoveTaskEClass, FS_MOVE_TASK__DESTINATION);
		createEAttribute(fsMoveTaskEClass, FS_MOVE_TASK__PRIORITY);
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
	public void initializePackageContents() {
		if (isInitialized) return;
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
		fsMoveTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

		// Initialize classes and features; add operations and parameters
		initEClass(fsMoveTaskEClass, FSMoveTask.class, "FSMoveTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFSMoveTask_Resource(), ecorePackage.getEString(), "resource", null, 1, 1, FSMoveTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFSMoveTask_Destination(), ecorePackage.getEString(), "destination", null, 1, 1, FSMoveTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFSMoveTask_Priority(), ecorePackage.getEInt(), "priority", "500", 0, 1, FSMoveTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource("https://raw.githubusercontent.com/themetalone/oomph-task-fsmove/master/task-fsmove-updatesite/model/Oomph-task-fsmove.ecore");

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
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "schemaLocation", "https://raw.githubusercontent.com/themetalone/oomph-task-fsmove/master/task-fsmove-updatesite/model/Oomph-task-fsmove.ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEnablementAnnotations() {
		String source = "http://www.eclipse.org/oomph/setup/Enablement";	
		addAnnotation
		  (fsMoveTaskEClass, 
		   source, 
		   new String[] {
			 "variableName", "p2.fs.move",
			 "repository", "https://themetalone.github.io/oomph-task-fsmove/update/",
			 "installableUnits", "task-fsmove.feature.group"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createValidTriggersAnnotations() {
		String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";	
		addAnnotation
		  (fsMoveTaskEClass, 
		   source, 
		   new String[] {
			 "triggers", "BOOTSTRAP MANUAL"
		   });
	}

} //fsmovePackageImpl

/**
 */
package ros1.tests;

import junit.textui.TestRunner;

import ros1.ParameterAnyType;
import ros1.Ros1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Any Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterAnyTypeTest extends ParameterTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterAnyTypeTest.class);
	}

	/**
	 * Constructs a new Parameter Any Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAnyTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Any Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParameterAnyType getFixture() {
		return (ParameterAnyType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ros1Factory.eINSTANCE.createParameterAnyType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParameterAnyTypeTest
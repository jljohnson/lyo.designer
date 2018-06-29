/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ShaclProperty;
import adaptorinterface.ShaclShape;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shacl Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ShaclShapeImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclShapeImpl#isClosed <em>Closed</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclShapeImpl#getShaclProperties <em>Shacl Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShaclShapeImpl extends ShapeImpl implements ShaclShape {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isClosed() <em>Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isClosed()
     * @generated
     * @ordered
     */
    protected static final boolean CLOSED_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isClosed() <em>Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isClosed()
     * @generated
     * @ordered
     */
    protected boolean closed = CLOSED_EDEFAULT;
    /**
     * The cached value of the '{@link #getShaclProperties() <em>Shacl Properties</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaclProperties()
     * @generated
     * @ordered
     */
    protected EList<ShaclProperty> shaclProperties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShaclShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.SHACL_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ShaclProperty> getShaclProperties() {
        if (shaclProperties == null) {
            shaclProperties = new EObjectResolvingEList<ShaclProperty>(ShaclProperty.class, this, AdaptorinterfacePackage.SHACL_SHAPE__SHACL_PROPERTIES);
        }
        return shaclProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_SHAPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClosed(boolean newClosed) {
        boolean oldClosed = closed;
        closed = newClosed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_SHAPE__CLOSED, oldClosed, closed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.SHACL_SHAPE__NAME:
                return getName();
            case AdaptorinterfacePackage.SHACL_SHAPE__CLOSED:
                return isClosed();
            case AdaptorinterfacePackage.SHACL_SHAPE__SHACL_PROPERTIES:
                return getShaclProperties();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AdaptorinterfacePackage.SHACL_SHAPE__NAME:
                setName((String)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_SHAPE__CLOSED:
                setClosed((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_SHAPE__SHACL_PROPERTIES:
                getShaclProperties().clear();
                getShaclProperties().addAll((Collection<? extends ShaclProperty>)newValue);
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
            case AdaptorinterfacePackage.SHACL_SHAPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SHACL_SHAPE__CLOSED:
                setClosed(CLOSED_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SHACL_SHAPE__SHACL_PROPERTIES:
                getShaclProperties().clear();
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
            case AdaptorinterfacePackage.SHACL_SHAPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AdaptorinterfacePackage.SHACL_SHAPE__CLOSED:
                return closed != CLOSED_EDEFAULT;
            case AdaptorinterfacePackage.SHACL_SHAPE__SHACL_PROPERTIES:
                return shaclProperties != null && !shaclProperties.isEmpty();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", closed: ");
        result.append(closed);
        result.append(')');
        return result.toString();
    }

} //ShaclShapeImpl

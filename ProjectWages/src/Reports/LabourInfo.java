/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Zaman
 */
@Entity
@Table(name = "labour_info", catalog = "wages", schema = "")
@NamedQueries({
    @NamedQuery(name = "LabourInfo.findAll", query = "SELECT l FROM LabourInfo l")
    , @NamedQuery(name = "LabourInfo.findById", query = "SELECT l FROM LabourInfo l WHERE l.id = :id")
    , @NamedQuery(name = "LabourInfo.findByName", query = "SELECT l FROM LabourInfo l WHERE l.name = :name")
    , @NamedQuery(name = "LabourInfo.findByNid", query = "SELECT l FROM LabourInfo l WHERE l.nid = :nid")
    , @NamedQuery(name = "LabourInfo.findByDepartment", query = "SELECT l FROM LabourInfo l WHERE l.department = :department")
    , @NamedQuery(name = "LabourInfo.findByBasic", query = "SELECT l FROM LabourInfo l WHERE l.basic = :basic")
    , @NamedQuery(name = "LabourInfo.findByUnionF", query = "SELECT l FROM LabourInfo l WHERE l.unionF = :unionF")
    , @NamedQuery(name = "LabourInfo.findByRevenueS", query = "SELECT l FROM LabourInfo l WHERE l.revenueS = :revenueS")
    , @NamedQuery(name = "LabourInfo.findByMedicalA", query = "SELECT l FROM LabourInfo l WHERE l.medicalA = :medicalA")
    , @NamedQuery(name = "LabourInfo.findByTiffinA", query = "SELECT l FROM LabourInfo l WHERE l.tiffinA = :tiffinA")
    , @NamedQuery(name = "LabourInfo.findByTransportA", query = "SELECT l FROM LabourInfo l WHERE l.transportA = :transportA")})
public class LabourInfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "NID")
    private String nid;
    @Basic(optional = false)
    @Column(name = "Department")
    private String department;
    @Basic(optional = false)
    @Column(name = "Basic")
    private double basic;
    @Basic(optional = false)
    @Column(name = "UnionF")
    private double unionF;
    @Basic(optional = false)
    @Column(name = "RevenueS")
    private double revenueS;
    @Basic(optional = false)
    @Column(name = "MedicalA")
    private double medicalA;
    @Basic(optional = false)
    @Column(name = "TiffinA")
    private double tiffinA;
    @Basic(optional = false)
    @Column(name = "TransportA")
    private double transportA;

    public LabourInfo() {
    }

    public LabourInfo(Integer id) {
        this.id = id;
    }

    public LabourInfo(Integer id, String name, String nid, String department, double basic, double unionF, double revenueS, double medicalA, double tiffinA, double transportA) {
        this.id = id;
        this.name = name;
        this.nid = nid;
        this.department = department;
        this.basic = basic;
        this.unionF = unionF;
        this.revenueS = revenueS;
        this.medicalA = medicalA;
        this.tiffinA = tiffinA;
        this.transportA = transportA;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        String oldNid = this.nid;
        this.nid = nid;
        changeSupport.firePropertyChange("nid", oldNid, nid);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        double oldBasic = this.basic;
        this.basic = basic;
        changeSupport.firePropertyChange("basic", oldBasic, basic);
    }

    public double getUnionF() {
        return unionF;
    }

    public void setUnionF(double unionF) {
        double oldUnionF = this.unionF;
        this.unionF = unionF;
        changeSupport.firePropertyChange("unionF", oldUnionF, unionF);
    }

    public double getRevenueS() {
        return revenueS;
    }

    public void setRevenueS(double revenueS) {
        double oldRevenueS = this.revenueS;
        this.revenueS = revenueS;
        changeSupport.firePropertyChange("revenueS", oldRevenueS, revenueS);
    }

    public double getMedicalA() {
        return medicalA;
    }

    public void setMedicalA(double medicalA) {
        double oldMedicalA = this.medicalA;
        this.medicalA = medicalA;
        changeSupport.firePropertyChange("medicalA", oldMedicalA, medicalA);
    }

    public double getTiffinA() {
        return tiffinA;
    }

    public void setTiffinA(double tiffinA) {
        double oldTiffinA = this.tiffinA;
        this.tiffinA = tiffinA;
        changeSupport.firePropertyChange("tiffinA", oldTiffinA, tiffinA);
    }

    public double getTransportA() {
        return transportA;
    }

    public void setTransportA(double transportA) {
        double oldTransportA = this.transportA;
        this.transportA = transportA;
        changeSupport.firePropertyChange("transportA", oldTransportA, transportA);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LabourInfo)) {
            return false;
        }
        LabourInfo other = (LabourInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reports.LabourInfo[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

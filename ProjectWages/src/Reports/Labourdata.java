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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "labourdata", catalog = "wages", schema = "")
@NamedQueries({
    @NamedQuery(name = "Labourdata.findAll", query = "SELECT l FROM Labourdata l")
    , @NamedQuery(name = "Labourdata.findByMonthS", query = "SELECT l FROM Labourdata l WHERE l.monthS = :monthS")
    , @NamedQuery(name = "Labourdata.findByYear", query = "SELECT l FROM Labourdata l WHERE l.year = :year")
    , @NamedQuery(name = "Labourdata.findById", query = "SELECT l FROM Labourdata l WHERE l.id = :id")
    , @NamedQuery(name = "Labourdata.findByName", query = "SELECT l FROM Labourdata l WHERE l.name = :name")
    , @NamedQuery(name = "Labourdata.findByNid", query = "SELECT l FROM Labourdata l WHERE l.nid = :nid")
    , @NamedQuery(name = "Labourdata.findByDepartment", query = "SELECT l FROM Labourdata l WHERE l.department = :department")
    , @NamedQuery(name = "Labourdata.findByBasic", query = "SELECT l FROM Labourdata l WHERE l.basic = :basic")
    , @NamedQuery(name = "Labourdata.findByMedicalA", query = "SELECT l FROM Labourdata l WHERE l.medicalA = :medicalA")
    , @NamedQuery(name = "Labourdata.findByTiffinA", query = "SELECT l FROM Labourdata l WHERE l.tiffinA = :tiffinA")
    , @NamedQuery(name = "Labourdata.findByTransportA", query = "SELECT l FROM Labourdata l WHERE l.transportA = :transportA")
    , @NamedQuery(name = "Labourdata.findByWorkingH", query = "SELECT l FROM Labourdata l WHERE l.workingH = :workingH")
    , @NamedQuery(name = "Labourdata.findByOvertime", query = "SELECT l FROM Labourdata l WHERE l.overtime = :overtime")
    , @NamedQuery(name = "Labourdata.findByLeaveH", query = "SELECT l FROM Labourdata l WHERE l.leaveH = :leaveH")
    , @NamedQuery(name = "Labourdata.findByPfl", query = "SELECT l FROM Labourdata l WHERE l.pfl = :pfl")
    , @NamedQuery(name = "Labourdata.findByRevenueS", query = "SELECT l FROM Labourdata l WHERE l.revenueS = :revenueS")
    , @NamedQuery(name = "Labourdata.findByUnionF", query = "SELECT l FROM Labourdata l WHERE l.unionF = :unionF")
    , @NamedQuery(name = "Labourdata.findByDdBasic", query = "SELECT l FROM Labourdata l WHERE l.ddBasic = :ddBasic")
    , @NamedQuery(name = "Labourdata.findByDdHouseR", query = "SELECT l FROM Labourdata l WHERE l.ddHouseR = :ddHouseR")
    , @NamedQuery(name = "Labourdata.findByDdMedicalA", query = "SELECT l FROM Labourdata l WHERE l.ddMedicalA = :ddMedicalA")
    , @NamedQuery(name = "Labourdata.findByDdTiffinA", query = "SELECT l FROM Labourdata l WHERE l.ddTiffinA = :ddTiffinA")
    , @NamedQuery(name = "Labourdata.findByDdTransportA", query = "SELECT l FROM Labourdata l WHERE l.ddTransportA = :ddTransportA")
    , @NamedQuery(name = "Labourdata.findByDdOvertime", query = "SELECT l FROM Labourdata l WHERE l.ddOvertime = :ddOvertime")
    , @NamedQuery(name = "Labourdata.findByDdLeaveH", query = "SELECT l FROM Labourdata l WHERE l.ddLeaveH = :ddLeaveH")
    , @NamedQuery(name = "Labourdata.findByDdPFL", query = "SELECT l FROM Labourdata l WHERE l.ddPFL = :ddPFL")
    , @NamedQuery(name = "Labourdata.findByDdRevenueS", query = "SELECT l FROM Labourdata l WHERE l.ddRevenueS = :ddRevenueS")
    , @NamedQuery(name = "Labourdata.findByDdUnionF", query = "SELECT l FROM Labourdata l WHERE l.ddUnionF = :ddUnionF")
    , @NamedQuery(name = "Labourdata.findByDdGrossS", query = "SELECT l FROM Labourdata l WHERE l.ddGrossS = :ddGrossS")
    , @NamedQuery(name = "Labourdata.findByDdTotalD", query = "SELECT l FROM Labourdata l WHERE l.ddTotalD = :ddTotalD")
    , @NamedQuery(name = "Labourdata.findByDdNetS", query = "SELECT l FROM Labourdata l WHERE l.ddNetS = :ddNetS")})
public class Labourdata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Month_S")
    private String monthS;
    @Basic(optional = false)
    @Column(name = "Year")
    private int year;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "NID")
    private double nid;
    @Basic(optional = false)
    @Column(name = "Department")
    private String department;
    @Basic(optional = false)
    @Column(name = "Basic")
    private double basic;
    @Basic(optional = false)
    @Column(name = "MedicalA")
    private double medicalA;
    @Basic(optional = false)
    @Column(name = "TiffinA")
    private double tiffinA;
    @Basic(optional = false)
    @Column(name = "TransportA")
    private double transportA;
    @Basic(optional = false)
    @Column(name = "WorkingH")
    private double workingH;
    @Basic(optional = false)
    @Column(name = "Overtime")
    private double overtime;
    @Basic(optional = false)
    @Column(name = "LeaveH")
    private double leaveH;
    @Basic(optional = false)
    @Column(name = "PFL")
    private double pfl;
    @Basic(optional = false)
    @Column(name = "RevenueS")
    private double revenueS;
    @Basic(optional = false)
    @Column(name = "UnionF")
    private double unionF;
    @Basic(optional = false)
    @Column(name = "ddBasic")
    private double ddBasic;
    @Basic(optional = false)
    @Column(name = "ddHouseR")
    private double ddHouseR;
    @Basic(optional = false)
    @Column(name = "ddMedicalA")
    private double ddMedicalA;
    @Basic(optional = false)
    @Column(name = "ddTiffinA")
    private double ddTiffinA;
    @Basic(optional = false)
    @Column(name = "ddTransportA")
    private double ddTransportA;
    @Basic(optional = false)
    @Column(name = "ddOvertime")
    private double ddOvertime;
    @Basic(optional = false)
    @Column(name = "ddLeaveH")
    private double ddLeaveH;
    @Basic(optional = false)
    @Column(name = "ddPFL")
    private double ddPFL;
    @Basic(optional = false)
    @Column(name = "ddRevenueS")
    private double ddRevenueS;
    @Basic(optional = false)
    @Column(name = "ddUnionF")
    private double ddUnionF;
    @Basic(optional = false)
    @Column(name = "ddGrossS")
    private double ddGrossS;
    @Basic(optional = false)
    @Column(name = "ddTotalD")
    private double ddTotalD;
    @Basic(optional = false)
    @Column(name = "ddNetS")
    private double ddNetS;

    public Labourdata() {
    }

    public Labourdata(Integer id) {
        this.id = id;
    }

    public Labourdata(Integer id, String monthS, int year, String name, double nid, String department, double basic, double medicalA, double tiffinA, double transportA, double workingH, double overtime, double leaveH, double pfl, double revenueS, double unionF, double ddBasic, double ddHouseR, double ddMedicalA, double ddTiffinA, double ddTransportA, double ddOvertime, double ddLeaveH, double ddPFL, double ddRevenueS, double ddUnionF, double ddGrossS, double ddTotalD, double ddNetS) {
        this.id = id;
        this.monthS = monthS;
        this.year = year;
        this.name = name;
        this.nid = nid;
        this.department = department;
        this.basic = basic;
        this.medicalA = medicalA;
        this.tiffinA = tiffinA;
        this.transportA = transportA;
        this.workingH = workingH;
        this.overtime = overtime;
        this.leaveH = leaveH;
        this.pfl = pfl;
        this.revenueS = revenueS;
        this.unionF = unionF;
        this.ddBasic = ddBasic;
        this.ddHouseR = ddHouseR;
        this.ddMedicalA = ddMedicalA;
        this.ddTiffinA = ddTiffinA;
        this.ddTransportA = ddTransportA;
        this.ddOvertime = ddOvertime;
        this.ddLeaveH = ddLeaveH;
        this.ddPFL = ddPFL;
        this.ddRevenueS = ddRevenueS;
        this.ddUnionF = ddUnionF;
        this.ddGrossS = ddGrossS;
        this.ddTotalD = ddTotalD;
        this.ddNetS = ddNetS;
    }

    public String getMonthS() {
        return monthS;
    }

    public void setMonthS(String monthS) {
        String oldMonthS = this.monthS;
        this.monthS = monthS;
        changeSupport.firePropertyChange("monthS", oldMonthS, monthS);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
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

    public double getNid() {
        return nid;
    }

    public void setNid(double nid) {
        double oldNid = this.nid;
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

    public double getWorkingH() {
        return workingH;
    }

    public void setWorkingH(double workingH) {
        double oldWorkingH = this.workingH;
        this.workingH = workingH;
        changeSupport.firePropertyChange("workingH", oldWorkingH, workingH);
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        double oldOvertime = this.overtime;
        this.overtime = overtime;
        changeSupport.firePropertyChange("overtime", oldOvertime, overtime);
    }

    public double getLeaveH() {
        return leaveH;
    }

    public void setLeaveH(double leaveH) {
        double oldLeaveH = this.leaveH;
        this.leaveH = leaveH;
        changeSupport.firePropertyChange("leaveH", oldLeaveH, leaveH);
    }

    public double getPfl() {
        return pfl;
    }

    public void setPfl(double pfl) {
        double oldPfl = this.pfl;
        this.pfl = pfl;
        changeSupport.firePropertyChange("pfl", oldPfl, pfl);
    }

    public double getRevenueS() {
        return revenueS;
    }

    public void setRevenueS(double revenueS) {
        double oldRevenueS = this.revenueS;
        this.revenueS = revenueS;
        changeSupport.firePropertyChange("revenueS", oldRevenueS, revenueS);
    }

    public double getUnionF() {
        return unionF;
    }

    public void setUnionF(double unionF) {
        double oldUnionF = this.unionF;
        this.unionF = unionF;
        changeSupport.firePropertyChange("unionF", oldUnionF, unionF);
    }

    public double getDdBasic() {
        return ddBasic;
    }

    public void setDdBasic(double ddBasic) {
        double oldDdBasic = this.ddBasic;
        this.ddBasic = ddBasic;
        changeSupport.firePropertyChange("ddBasic", oldDdBasic, ddBasic);
    }

    public double getDdHouseR() {
        return ddHouseR;
    }

    public void setDdHouseR(double ddHouseR) {
        double oldDdHouseR = this.ddHouseR;
        this.ddHouseR = ddHouseR;
        changeSupport.firePropertyChange("ddHouseR", oldDdHouseR, ddHouseR);
    }

    public double getDdMedicalA() {
        return ddMedicalA;
    }

    public void setDdMedicalA(double ddMedicalA) {
        double oldDdMedicalA = this.ddMedicalA;
        this.ddMedicalA = ddMedicalA;
        changeSupport.firePropertyChange("ddMedicalA", oldDdMedicalA, ddMedicalA);
    }

    public double getDdTiffinA() {
        return ddTiffinA;
    }

    public void setDdTiffinA(double ddTiffinA) {
        double oldDdTiffinA = this.ddTiffinA;
        this.ddTiffinA = ddTiffinA;
        changeSupport.firePropertyChange("ddTiffinA", oldDdTiffinA, ddTiffinA);
    }

    public double getDdTransportA() {
        return ddTransportA;
    }

    public void setDdTransportA(double ddTransportA) {
        double oldDdTransportA = this.ddTransportA;
        this.ddTransportA = ddTransportA;
        changeSupport.firePropertyChange("ddTransportA", oldDdTransportA, ddTransportA);
    }

    public double getDdOvertime() {
        return ddOvertime;
    }

    public void setDdOvertime(double ddOvertime) {
        double oldDdOvertime = this.ddOvertime;
        this.ddOvertime = ddOvertime;
        changeSupport.firePropertyChange("ddOvertime", oldDdOvertime, ddOvertime);
    }

    public double getDdLeaveH() {
        return ddLeaveH;
    }

    public void setDdLeaveH(double ddLeaveH) {
        double oldDdLeaveH = this.ddLeaveH;
        this.ddLeaveH = ddLeaveH;
        changeSupport.firePropertyChange("ddLeaveH", oldDdLeaveH, ddLeaveH);
    }

    public double getDdPFL() {
        return ddPFL;
    }

    public void setDdPFL(double ddPFL) {
        double oldDdPFL = this.ddPFL;
        this.ddPFL = ddPFL;
        changeSupport.firePropertyChange("ddPFL", oldDdPFL, ddPFL);
    }

    public double getDdRevenueS() {
        return ddRevenueS;
    }

    public void setDdRevenueS(double ddRevenueS) {
        double oldDdRevenueS = this.ddRevenueS;
        this.ddRevenueS = ddRevenueS;
        changeSupport.firePropertyChange("ddRevenueS", oldDdRevenueS, ddRevenueS);
    }

    public double getDdUnionF() {
        return ddUnionF;
    }

    public void setDdUnionF(double ddUnionF) {
        double oldDdUnionF = this.ddUnionF;
        this.ddUnionF = ddUnionF;
        changeSupport.firePropertyChange("ddUnionF", oldDdUnionF, ddUnionF);
    }

    public double getDdGrossS() {
        return ddGrossS;
    }

    public void setDdGrossS(double ddGrossS) {
        double oldDdGrossS = this.ddGrossS;
        this.ddGrossS = ddGrossS;
        changeSupport.firePropertyChange("ddGrossS", oldDdGrossS, ddGrossS);
    }

    public double getDdTotalD() {
        return ddTotalD;
    }

    public void setDdTotalD(double ddTotalD) {
        double oldDdTotalD = this.ddTotalD;
        this.ddTotalD = ddTotalD;
        changeSupport.firePropertyChange("ddTotalD", oldDdTotalD, ddTotalD);
    }

    public double getDdNetS() {
        return ddNetS;
    }

    public void setDdNetS(double ddNetS) {
        double oldDdNetS = this.ddNetS;
        this.ddNetS = ddNetS;
        changeSupport.firePropertyChange("ddNetS", oldDdNetS, ddNetS);
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
        if (!(object instanceof Labourdata)) {
            return false;
        }
        Labourdata other = (Labourdata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reports.Labourdata[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

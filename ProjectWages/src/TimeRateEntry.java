
import Reports.LabourMasterData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class TimeRateEntry extends javax.swing.JFrame {

    
    String Month_S,Month_S_pay, Year,Year_pay, ID,Name,NID,Department,sBasic,sMedicalA,sTiffinA,sTransportA,sWorkingH,sOvertime,sLeaveH,sPFL,sRevenueS,sUnionF;
    Double dBasic,dMedicalA,dTiffinA,dTransportA,dWorkingH,dOvertime,dLeaveH,dPFL,dRevenueS,dUnionF;
    Double ddBasic,ddHouseR,ddMedicalA,ddTiffinA,ddTransportA,ddWorkingH,ddOvertime,ddLeaveH,ddPF,ddPFL,ddRevenueS,ddUnionF, ddGrossS,ddTotalD, ddNetS;
    Integer iID;
//    String Month_S, Year, ID,Name,NID,Department,sBasic,sMedicalA,sTiffinA,sTransportA,sWorkingH,sOvertime,sLeaveH,sPFL,sRevenueS,sUnionF;
//    Double dBasic,dMedicalA,dTiffinA,dTransportA,dWorkingH,dOvertime,dLeaveH,dPFL,dRevenueS,dUnionF;
//    Double ddBasic,ddHouseR,ddMedicalA,ddTiffinA,ddTransportA,ddWorkingH,ddOvertime,ddLeaveH,ddPFL,ddRevenueS,ddUnionF, ddGrossS,ddTotalD, ddNetS; 

    public TimeRateEntry() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtPFL = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtWorkingH = new javax.swing.JTextField();
        txtOvertime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLeaveH = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblBasic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNID = new javax.swing.JLabel();
        lblMedicalA = new javax.swing.JLabel();
        lblTiffinA = new javax.swing.JLabel();
        lblTransportA = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblRevenueS = new javax.swing.JLabel();
        lblUnionF = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnClearAll = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAddSummary = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TimeRateEntry");
        setLocation(new java.awt.Point(0, 60));

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 102)));

        jPanel2.setBackground(new java.awt.Color(52, 73, 54));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(108, 122, 137));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 204)), "Working Hour", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 102, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("ID");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtIDMouseReleased(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(108, 122, 137));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("PF Loan");

        txtPFL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPFL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPFLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPFL, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPFL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(108, 122, 137));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 153, 51)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Working Hour");

        txtWorkingH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtWorkingH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtWorkingH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkingHActionPerformed(evt);
            }
        });

        txtOvertime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtOvertime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOvertime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOvertimeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Overtime");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Leave Hour");

        txtLeaveH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLeaveH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLeaveH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeaveHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLeaveH, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(txtOvertime)
                    .addComponent(txtWorkingH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkingH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLeaveH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Name");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Department");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Basic");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 255, 255));
        lblName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDepartment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(0, 255, 255));
        lblDepartment.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBasic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBasic.setForeground(new java.awt.Color(0, 255, 255));
        lblBasic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("NID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Mede.A.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Tiff.A.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Tran.A");

        lblNID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNID.setForeground(new java.awt.Color(0, 255, 255));
        lblNID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMedicalA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMedicalA.setForeground(new java.awt.Color(0, 255, 255));
        lblMedicalA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTiffinA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTiffinA.setForeground(new java.awt.Color(0, 255, 255));
        lblTiffinA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTransportA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTransportA.setForeground(new java.awt.Color(0, 255, 255));
        lblTransportA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Revenue");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Union Fee");

        lblRevenueS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRevenueS.setForeground(new java.awt.Color(0, 255, 255));
        lblRevenueS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUnionF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUnionF.setForeground(new java.awt.Color(0, 255, 255));
        lblUnionF.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDepartment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lblBasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRevenueS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMedicalA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(lblTiffinA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTransportA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUnionF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMedicalA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTiffinA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTransportA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRevenueS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUnionF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(108, 122, 137));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Button"));

        btnClearAll.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnClearAll.setText("ClearAll");
        btnClearAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.MatteBorder(null));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1.setText("Total Labour");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAddSummary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddSummary.setForeground(new java.awt.Color(0, 0, 255));
        btnAddSummary.setText("Add Summary");
        btnAddSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSummaryActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.MatteBorder(null));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(btnClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAddSummary))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddSummary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(238, 238, 238));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 204)), "Month", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Month_Wages");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbMonth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Month----", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novemver", "December" }));
        cmbMonth.setFocusCycleRoot(true);
        cmbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthActionPerformed(evt);
            }
        });

        cmbYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Year-", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText("STAR JUTE MILLS LTD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSummaryActionPerformed
        getAllPreviousSummaryDelete();
        getAllSummary();
    }//GEN-LAST:event_btnAddSummaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LabourMasterData labour = new LabourMasterData();
        labour.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        getAllRecordUpdate();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        getAllRecordDelete();
        txtID.requestFocus();
        clear();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        clear();
        txtID.requestFocus();
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        txtID.requestFocus();
        if (txtWorkingH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Working Hour");
            txtWorkingH.requestFocus();
        }
        if (txtOvertime.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Overtime");
            txtOvertime.requestFocus();
        }
        if (txtLeaveH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Leave Hour");
            txtLeaveH.requestFocus();
        }
        if (txtPFL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter PF Loan");
            txtPFL.requestFocus();
        }
        getAllRecordSave();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtLeaveHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeaveHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLeaveHActionPerformed

    private void txtOvertimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOvertimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOvertimeActionPerformed

    private void txtWorkingHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkingHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkingHActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
                getAllRecordShow();
        //        txtID.requestFocus();
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        getAllRecordShow();
    }//GEN-LAST:event_txtIDFocusLost

    private void cmbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMonthActionPerformed

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYearActionPerformed

    private void txtPFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPFLActionPerformed
       
    }//GEN-LAST:event_txtPFLActionPerformed

    private void txtIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseReleased
         clear();
    }//GEN-LAST:event_txtIDMouseReleased
    //String ID name, nid, basic, medA, tifA, trsA;
  
  
    private void getAllRecordSave() {
        Month_S = cmbMonth.getSelectedItem().toString();
        Year = cmbYear.getSelectedItem().toString();
        ID = txtID.getText();
        Name = lblName.getText();
        NID = lblNID.getText();
        Department = lblDepartment.getText();
        sBasic = lblBasic.getText();
        sMedicalA = lblMedicalA.getText();
        sTiffinA = lblTiffinA.getText();
        sTransportA = lblTransportA.getText();

        //Working Hour
        sWorkingH = txtWorkingH.getText();
        sOvertime = txtOvertime.getText();
        sLeaveH = txtLeaveH.getText();
        //Deduction
        sPFL = txtPFL.getText();
        sRevenueS = lblRevenueS.getText();
        sUnionF = lblUnionF.getText();
        //Convert
        dBasic = Double.valueOf(lblBasic.getText());
        dWorkingH = Double.valueOf(txtWorkingH.getText());
        dMedicalA = Double.valueOf(lblMedicalA.getText());
        dTiffinA = Double.valueOf(lblTiffinA.getText());
        dTransportA = Double.valueOf(lblTransportA.getText());
        dOvertime = Double.valueOf(txtOvertime.getText());
        dLeaveH = Double.valueOf(txtLeaveH.getText());
        dPFL = Double.valueOf(txtPFL.getText());
        dRevenueS = Double.valueOf(lblRevenueS.getText());
        dUnionF = Double.valueOf(lblUnionF.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        ddBasic = Double.valueOf(df.format(dBasic / 208 * dWorkingH));
        ddHouseR = Double.valueOf(df.format(ddBasic * 0.5));
        ddMedicalA = Double.valueOf(df.format((dMedicalA / 208 * dWorkingH) + (dMedicalA / 208 * dLeaveH)));
        ddTiffinA = Double.valueOf(df.format((dTiffinA / 208 * dWorkingH)));
        ddTransportA = Double.valueOf(df.format((dTransportA / 208 * dWorkingH)));
        ddOvertime = Double.valueOf(df.format((dBasic / 208 * dOvertime) * 2));
        ddLeaveH = Double.valueOf(df.format((dBasic / 208 * dLeaveH)));
        /*Deduction*/
        ddPF = Double.valueOf(df.format((ddBasic + ddLeaveH) * 0.10));
        ddPFL = Double.valueOf(df.format(dPFL));
        ddRevenueS = Double.valueOf(df.format(dRevenueS));
        ddUnionF = Double.valueOf(df.format(dUnionF));
        /*Summary*/
        ddGrossS = Double.valueOf(df.format(ddBasic + ddHouseR + ddMedicalA + ddTiffinA + ddTransportA + ddOvertime + ddLeaveH));
        ddTotalD = Double.valueOf(df.format(ddPF + ddPFL + ddRevenueS + ddUnionF));
        ddNetS = Double.valueOf(df.format(ddGrossS - ddTotalD));

        Connection con = null;
        Statement stmt = null;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            int count = 0;

            count = stmt.executeUpdate("insert into labourdata(Month_S,Year,ID,Name,NID,Department,Basic,MedicalA,TiffinA,TransportA,WorkingH,Overtime,LeaveH,PFL,RevenueS,UnionF,ddBasic,ddHouseR,ddMedicalA,ddTiffinA,ddTransportA,ddOvertime,ddLeaveH,ddPF,ddPFL,ddRevenueS,ddUnionF, ddGrossS,ddTotalD, ddNetS)"
                    + " values('" + Month_S + "','" + Year + "','" + ID + "','" + Name + "','" + NID + "','" + Department + "','" + dBasic + "',"
                    + "'" + dMedicalA + "','" + dTiffinA + "','" + dTransportA + "','" + dWorkingH + "',"
                    + "'" + dOvertime + "','" + dLeaveH + "','" + dPFL + "','" + dRevenueS + "','" + dUnionF + "',"
                    + "'" + ddBasic + "','" + ddHouseR + "','" + ddMedicalA + "','" + ddTiffinA + "','" + ddTransportA + "',"
                    + "'" + ddOvertime + "','" + ddLeaveH + "','" + ddPF + "','" + ddPFL + "','" + ddRevenueS + "','" + ddUnionF + "'"
                    + ",'" + ddGrossS + "','" + ddTotalD + "','" + ddNetS + "')");

            count = stmt.executeUpdate("insert into payment_history(ID, Month_S, Year, Name, WorkingH, Overtime, LeaveH, PFL, ddGrossS, ddTotalD, ddNetS)"
                    + " values('" + ID + "','" + Month_S + "','" + Year + "','" + Name + "','" + dWorkingH + "','" + dOvertime + "','" + dLeaveH + "',"
                    + "'" + dPFL + "','" + ddGrossS + "','" + ddTotalD + "','" + ddNetS + "')");

            if (count > 0) {
                JOptionPane.showMessageDialog(this, "inserted successfully");
                clear();
            } else {
                JOptionPane.showMessageDialog(this, "insertion failed", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    private void getAllRecordShow() {
        ID = txtID.getText();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select ID,Name,NID,Department,Basic,RevenueS,UnionF,MedicalA,TiffinA,TransportA from labour_info where id= '" + ID + "' ");
            int count = 0;
            while (rs.next()) {
                txtID.setText(rs.getString("ID"));
                lblName.setText(rs.getString("Name"));
                lblNID.setText(rs.getString("NID"));
                lblDepartment.setText(rs.getString("Department"));
                lblBasic.setText(rs.getString("Basic"));
                lblRevenueS.setText(rs.getString("RevenueS"));
                lblUnionF.setText(rs.getString("UnionF"));
                lblMedicalA.setText(rs.getString("MedicalA"));
                lblTiffinA.setText(rs.getString("TiffinA"));
                lblTransportA.setText(rs.getString("TransportA"));
                count++;
            }
            rs = stmt.executeQuery("select Month_S,Year,WorkingH,Overtime,LeaveH,PFL,RevenueS,UnionF from labourdata where id= '" + ID + "' ");
            int count1 = 0;
            while (rs.next()) {
                cmbMonth.setSelectedItem(rs.getString("Month_S"));
                cmbYear.setSelectedItem(rs.getString("Year"));
                txtWorkingH.setText(rs.getString("WorkingH"));
                txtOvertime.setText(rs.getString("Overtime"));
                txtLeaveH.setText(rs.getString("LeaveH"));
                txtPFL.setText(rs.getString("PFL"));
                lblRevenueS.setText(rs.getString("RevenueS"));
                lblUnionF.setText(rs.getString("UnionF"));
                count1++;
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(rootPane, "There is no such record");
                clear();
                txtID.requestFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }


    private void getAllRecordUpdate() {
        ID = txtID.getText();

        Month_S = cmbMonth.getSelectedItem().toString();
        Year = cmbYear.getSelectedItem().toString();
        Name = lblName.getText();
        NID = lblNID.getText();
        Department = lblDepartment.getText();
        sBasic = lblBasic.getText();
        sMedicalA = lblMedicalA.getText();
        sTiffinA = lblTiffinA.getText();
        sTransportA = lblTransportA.getText();
        sWorkingH = txtWorkingH.getText();
        sOvertime = txtOvertime.getText();
        sLeaveH = txtLeaveH.getText();
        sPFL = txtPFL.getText();
        sRevenueS = lblRevenueS.getText();
        sUnionF = lblUnionF.getText();
        //Convert String to Double
        dBasic = Double.valueOf(lblBasic.getText());
        dMedicalA = Double.valueOf(lblMedicalA.getText());
        dTiffinA = Double.valueOf(lblTiffinA.getText());
        dTransportA = Double.valueOf(lblTransportA.getText());
        dWorkingH = Double.valueOf(txtWorkingH.getText());
        dOvertime = Double.valueOf(txtOvertime.getText());
        dLeaveH = Double.valueOf(txtLeaveH.getText());
        dPFL = Double.valueOf(txtPFL.getText());
        dRevenueS = Double.valueOf(lblRevenueS.getText());
        dUnionF = Double.valueOf(lblUnionF.getText());
        //Calculation
        DecimalFormat df = new DecimalFormat("#.##");
        ddBasic = Double.valueOf(df.format(dBasic / 208 * dWorkingH));
        ddHouseR = Double.valueOf(df.format(ddBasic * 0.5));
        ddMedicalA = Double.valueOf(df.format((dMedicalA / 208 * dWorkingH) + (dMedicalA / 208 * dLeaveH)));
        ddTiffinA = Double.valueOf(df.format((dTiffinA / 208 * dWorkingH)));
        ddTransportA = Double.valueOf(df.format((dTransportA / 208 * dWorkingH)));
        ddOvertime = Double.valueOf(df.format((dBasic / 208 * dOvertime) * 2));
        ddLeaveH = Double.valueOf(df.format((dBasic / 208 * dLeaveH)));
        /*Deduction*/
        ddPF = Double.valueOf(df.format((ddBasic + ddLeaveH) * 0.10));
        ddPFL = Double.valueOf(df.format(dPFL));
        ddRevenueS = Double.valueOf(df.format(dRevenueS));
        ddUnionF = Double.valueOf(df.format(dUnionF));
        /*Summary*/
        ddGrossS = Double.valueOf(df.format(ddBasic + ddHouseR + ddMedicalA + ddTiffinA + ddTransportA + ddOvertime + ddLeaveH));
        ddTotalD = Double.valueOf(df.format(ddPF + ddPFL + ddRevenueS + ddUnionF));
        ddNetS = Double.valueOf(df.format(ddGrossS - ddTotalD));

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select ID,Month_S,Year from payment_history where id= '" + ID + "' ");

            while (rs.next()) {
                Month_S_pay = rs.getString("Month_S");
                Year_pay = rs.getString("Year");
            }
            int count = 0;
            count = stmt.executeUpdate("update labourdata set Month_S='" + Month_S + "',Year='" + Year + "',"
                    + "Name='" + Name + "',NID='" + NID + "',Department='" + Department + "',Basic='" + sBasic + "',"
                    + "MedicalA='" + sMedicalA + "', TiffinA='" + sTiffinA + "',TransportA='" + sTransportA + "',"
                    + " WorkingH='" + sWorkingH + "',Overtime='" + sOvertime + "',LeaveH='" + sLeaveH + "',"
                    + "PFL='" + sPFL + "',RevenueS='" + sRevenueS + "',UnionF='" + sUnionF + "',"
                    + "ddBasic='" + ddBasic + "',ddHouseR='" + ddHouseR + "',ddMedicalA='" + ddMedicalA + "',"
                    + "ddTiffinA='" + ddTiffinA + "',ddTransportA='" + ddTransportA + "',ddOvertime='" + ddOvertime + "',"
                    + "ddLeaveH='" + ddLeaveH + "',ddPF='" + ddPF + "',ddPFL='" + ddPFL + "',"
                    + "ddRevenueS='" + ddRevenueS + "',ddUnionF='" + ddUnionF + "',ddGrossS='" + ddGrossS + "',"
                    + "ddTotalD='" + ddTotalD + "',ddNetS='" + ddNetS + "' where id='" + ID + "' ");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Updated successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Updated failed", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            Month_S = cmbMonth.getSelectedItem().toString();
            Year = cmbYear.getSelectedItem().toString();
            rs = stmt.executeQuery("select ID,Month_S,Year from payment_history where id= '" + ID + "' ");
            while (rs.next()) {
                Month_S_pay = rs.getString("Month_S");
                Year_pay = rs.getString("Year");
            }
            int count1 = 0;
            int count2 = 0;
            Month_S = Month_S.trim();
            Month_S_pay = Month_S_pay.trim();
            Year = Year.trim();
            Year_pay = Year_pay.trim();
            if (Month_S_pay.equals(Month_S) && Year_pay.equals(Year)) {
                count1 = stmt.executeUpdate("update payment_history set Month_S='" + Month_S + "',Year='" + Year + "',"
                        + "Name='" + Name + "',WorkingH='" + sWorkingH + "',Overtime='" + sOvertime + "',LeaveH='" + sLeaveH + "',"
                        + "PFL='" + sPFL + "',ddGrossS='" + ddGrossS + "',ddTotalD='" + ddTotalD + "',ddNetS='" + ddNetS + "' where ID='" + ID + "' ");
            } else {
                count2 = stmt.executeUpdate("insert into payment_history(ID, Month_S, Year, Name, WorkingH, Overtime, LeaveH, PFL, ddGrossS, ddTotalD, ddNetS)"
                        + " values('" + ID + "','" + Month_S + "','" + Year + "','" + Name + "','" + dWorkingH + "','" + dOvertime + "','" + dLeaveH + "',"
                        + "'" + dPFL + "','" + ddGrossS + "','" + ddTotalD + "','" + ddNetS + "')");
            }
            if (count1 > 0) {
                JOptionPane.showMessageDialog(this, "Updated Old Salary");
            } else if (count2 > 0) {
                JOptionPane.showMessageDialog(this, "Updated New Salary");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getAllRecordDelete() {
        ID = txtID.getText();
        Connection con = null;
        Statement stmt = null;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            int count = 0;
            count = stmt.executeUpdate("delete from labourdata where id='" + ID + "' ");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Record Deleted");
            } else {
                JOptionPane.showMessageDialog(this, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }



    public void clear() {
        txtID.setText("");
        txtWorkingH.setText("");
        txtOvertime.setText("");
        txtLeaveH.setText("");
        txtPFL.setText("");
        lblRevenueS.setText("");
        lblUnionF.setText("");
        lblBasic.setText("");
        lblDepartment.setText("");
        lblMedicalA.setText("");
        lblNID.setText("");
        lblName.setText("");
        lblTiffinA.setText("");
        lblTransportA.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimeRateEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeRateEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeRateEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeRateEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeRateEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSummary;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblBasic;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblMedicalA;
    private javax.swing.JLabel lblNID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRevenueS;
    private javax.swing.JLabel lblTiffinA;
    private javax.swing.JLabel lblTransportA;
    private javax.swing.JLabel lblUnionF;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLeaveH;
    private javax.swing.JTextField txtOvertime;
    private javax.swing.JTextField txtPFL;
    private javax.swing.JTextField txtWorkingH;
    // End of variables declaration//GEN-END:variables
private void getAllSummary() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String name = "TOTAL HANDS";
        String department = "TOTAL";
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select count(NID) as NID,sum(WorkingH) as WorkingH, sum(Overtime) as Overtime, sum(LeaveH) as LeaveH,"
                    + " sum(PFL) as PFL, sum(RevenueS) as RevenueS, sum(UnionF) as UnionF, sum(ddBasic) as ddBasic,"
                    + " sum(ddHouseR) as ddHouseR, sum(ddMedicalA) as ddMedicalA, sum(ddTiffinA) as ddTiffinA,"
                    + " sum(ddTransportA) as ddTransportA, sum(ddOvertime) as ddOvertime, sum(ddLeaveH) as ddLeaveH,sum(ddPF) as ddPF,"
                    + " sum(ddPFL) as ddPFL, sum(ddRevenueS) as ddRevenueS, sum(ddUnionF) as ddUnionF,"
                    + " sum(ddGrossS) as ddGrossS, sum(ddTotalD) as ddTotalD, sum(ddNetS) as ddNetS from labourdata"); //, sum() as 11
            int count = 0;
            while (rs.next()) {
                NID = rs.getString("NID");
                dWorkingH = rs.getDouble("WorkingH");
                dOvertime = rs.getDouble("Overtime");
                dLeaveH = rs.getDouble("LeaveH");
                dPFL = rs.getDouble("PFL");
                dRevenueS = rs.getDouble("RevenueS");
                dUnionF = rs.getDouble("UnionF");
                ddBasic = rs.getDouble("ddBasic");
                ddHouseR = rs.getDouble("ddHouseR");
                ddMedicalA = rs.getDouble("ddMedicalA");
                ddTiffinA = rs.getDouble("ddTiffinA");
                ddTransportA = rs.getDouble("ddTransportA");
                ddOvertime = rs.getDouble("ddOvertime");
                ddLeaveH = rs.getDouble("ddLeaveH");
                ddPF = rs.getDouble("ddPF");
                ddPFL = rs.getDouble("ddPFL");
                ddRevenueS = rs.getDouble("ddRevenueS");
                ddUnionF = rs.getDouble("ddUnionF");
                ddGrossS = rs.getDouble("ddGrossS");
                ddTotalD = rs.getDouble("ddTotalD");
                ddNetS = rs.getDouble("ddNetS");
            }
            count = stmt.executeUpdate("insert into labourdata(Name,NID,Department,WorkingH,Overtime,LeaveH,PFL,RevenueS,UnionF,ddBasic,ddHouseR,ddMedicalA,ddTiffinA,ddTransportA,ddOvertime,ddLeaveH,ddPF,ddPFL,ddRevenueS,ddUnionF,ddGrossS,ddTotalD,ddNetS)"
                    + " values('" + name + "','" + NID + "','" + department + "','" + dWorkingH + "','" + dOvertime + "',"
                    + "'" + dLeaveH + "','" + dPFL + "','" + dRevenueS + "','" + dUnionF + "','" + ddBasic + "',"
                    + "'" + ddHouseR + "','" + ddMedicalA + "','" + ddTiffinA + "','" + ddTransportA + "',"
                    + "'" + ddOvertime + "','" + ddLeaveH + "','" + ddPF + "','" + ddPFL + "','" + ddRevenueS + "',"
                    + "'" + ddUnionF + "','" + ddGrossS + "','" + ddTotalD + "','" + ddNetS + "')");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Summary Added");
            } else {
                JOptionPane.showMessageDialog(this, "Summary NOT Added", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    private void getAllPreviousSummaryDelete() {
        Connection con = null;
        Statement stmt = null;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            int count = 0;
            count = stmt.executeUpdate("delete from labourdata where Name='" + "TOTAL HANDS" + "' ");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    private void getAllRecordUpdateHistory() {
        ID = txtID.getText();
        sWorkingH = txtWorkingH.getText();
        sOvertime = txtOvertime.getText();
        sLeaveH = txtLeaveH.getText();
        sPFL = txtPFL.getText();
        sRevenueS = lblRevenueS.getText();
        sUnionF = lblUnionF.getText();

        dWorkingH = Double.valueOf(txtWorkingH.getText());
        dOvertime = Double.valueOf(txtOvertime.getText());
        dLeaveH = Double.valueOf(txtLeaveH.getText());
        dPFL = Double.valueOf(txtPFL.getText());
        dRevenueS = Double.valueOf(lblRevenueS.getText());
        dUnionF = Double.valueOf(lblUnionF.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        ddBasic = Double.valueOf(df.format(dBasic / 208 * dWorkingH));
        ddHouseR = Double.valueOf(df.format(ddBasic * 0.5));
        ddMedicalA = Double.valueOf(df.format((dMedicalA / 208 * dWorkingH) + (dMedicalA / 208 * dLeaveH)));
        ddTiffinA = Double.valueOf(df.format((dTiffinA / 208 * dWorkingH)));
        ddTransportA = Double.valueOf(df.format((dTransportA / 208 * dWorkingH)));
        ddOvertime = Double.valueOf(df.format((dBasic / 208 * dOvertime) * 2));
        ddLeaveH = Double.valueOf(df.format((dBasic / 208 * dLeaveH)));
        /*Deduction*/
        ddPF = Double.valueOf(df.format((ddBasic + ddLeaveH) * 0.10));
        ddPFL = Double.valueOf(df.format(dPFL));
        ddRevenueS = Double.valueOf(df.format(dRevenueS));
        ddUnionF = Double.valueOf(df.format(dUnionF));
        /*Summary*/
        ddGrossS = Double.valueOf(df.format(ddBasic + ddHouseR + ddMedicalA + ddTiffinA + ddTransportA + ddOvertime + ddLeaveH));
        ddTotalD = Double.valueOf(df.format(ddPF + ddPFL + ddRevenueS + ddUnionF));
        ddNetS = Double.valueOf(df.format(ddGrossS - ddTotalD));

        Connection con = null;
        Statement stmt = null;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            int count = 0;
            count = stmt.executeUpdate("insert into payment_history(ID,Month_S,Year,Name,ddNetS)"
                    + " values('" + ID + "','" + Month_S + "','" + Year + "','" + Name + "','" + ddNetS + "')");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "inserted successfully");
                clear();
            } else {
                JOptionPane.showMessageDialog(this, "insertion failed", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}

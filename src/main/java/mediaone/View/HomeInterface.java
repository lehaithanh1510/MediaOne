package mediaone.View;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

public class HomeInterface extends javax.swing.JPanel {

    public HomeInterface() {
        initComponents();
        File directory = new File("");
        Image imageInterface = (new ImageIcon(directory.getAbsolutePath() + "\\src\\main\\java\\image\\homeInterface.png")).getImage().getScaledInstance(760, 600, java.awt.Image.SCALE_SMOOTH);
        mainInterfaceImage.setIcon(new ImageIcon(imageInterface));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainHomeInterface = new javax.swing.JPanel();
        mainInterfaceImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(677, 543));

        mainInterfaceImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainInterfaceImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\library-g92c93c34a_640.png")); // NOI18N

        javax.swing.GroupLayout mainHomeInterfaceLayout = new javax.swing.GroupLayout(mainHomeInterface);
        mainHomeInterface.setLayout(mainHomeInterfaceLayout);
        mainHomeInterfaceLayout.setHorizontalGroup(
            mainHomeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainInterfaceImage, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        mainHomeInterfaceLayout.setVerticalGroup(
            mainHomeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainInterfaceImage, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainHomeInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainHomeInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainHomeInterface;
    private javax.swing.JLabel mainInterfaceImage;
    // End of variables declaration//GEN-END:variables
}

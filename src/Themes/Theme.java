/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Themes;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.UIManager;

/**
 *
 * @author LopezLaps
 */
public class Theme {

    public static void renderAluminium(String className) {
        try {
            Properties props = new Properties();
            /**
             * Set logo string in the pop up menu item
             *
             * @source http://www.jtattoo.net/HowTo_ChangeLogo.html
             */
            props.put("logoString", " ");
            AluminiumLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(className).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static void render(String themeName) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (themeName.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(themeName + " Theme Class Not Found Exception").log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(themeName + " Theme Intantiation Exception").log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(themeName + " Theme Illegal Access Exception").log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(themeName + " Theme Unsupported Look and feel Exception").log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static void setIcon(JFrame jframe) {
        jframe.setIconImage(Toolkit.getDefaultToolkit().getImage(jframe.getClass().getResource("/Images/pc2.png")));
    }

    public static JMenuBar setUpMenu(final JFrame jframe) {
        JMenuBar systemMenuBar = new JMenuBar();

        String className = jframe.getClass().getName();

        JMenu jMenu2 = new JMenu();
        jMenu2.setBorder(null);
        jMenu2.setIcon(new ImageIcon(jframe.getClass().getResource("/Images/home2.png"))); // NOI18N
        jMenu2.setText("HOME");
        jMenu2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                new Views.Home().setVisible(true);
                jframe.dispose();
            }
        });
        systemMenuBar.add(jMenu2);

        /**
         * If the current frame is not ViewsAdmin.Reports then show Admin Menu and Terms and agreement
         * Default is it will show if this method is being called
         */
        if (!"ViewsAdmin.Reports".equalsIgnoreCase(className)) {
            
            JMenu adminMenuItem = new JMenu();
            adminMenuItem.setBackground(new Color(153, 153, 153));
            adminMenuItem.setBorder(null);
            adminMenuItem.setIcon(new ImageIcon(jframe.getClass().getResource("/Images/admin_icon2.png"))); // NOI18N
            adminMenuItem.setText("Admin");
            adminMenuItem.setFont(new Font("Tahoma", 1, 14)); // NOI18N
            adminMenuItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    new ViewsAdmin.Login(jframe, true).setVisible(true);
                }
            });
            systemMenuBar.add(adminMenuItem);

            JMenu termsAndConditionMenuItem = new JMenu();
            termsAndConditionMenuItem.setBorder(null);
            termsAndConditionMenuItem.setIcon(new ImageIcon(jframe.getClass().getResource("/Images/terms_and_agreement.png"))); // NOI18N
            termsAndConditionMenuItem.setText("Terms and condition");
            termsAndConditionMenuItem.setFont(new Font("Tahoma", 1, 14)); // NOI18N
            termsAndConditionMenuItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    Views.Tac tac = new Views.Tac(jframe, true);
                    tac.setVisible(true);
                }
            });
            systemMenuBar.add(termsAndConditionMenuItem);
            
        }

        return systemMenuBar;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Themes;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.Toolkit;
import java.util.Properties;
import javax.swing.JFrame;
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
    
    public static void setIcon(JFrame jframe){
        jframe.setIconImage(Toolkit.getDefaultToolkit().getImage(jframe.getClass().getResource("/Images/pc2.png")));
    }
}

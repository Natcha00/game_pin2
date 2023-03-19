import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.util.ArrayList;

public class Window extends JPanel {
    private JFrame f;
    private JLabel logoIcon;
    private ImageIcon icon;

    Window(String action) {
        f = new JFrame("COOKING GENT");
        f.setSize(500, 525);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image(action); // method display
        f.setVisible(true);
    }

    Window() {
        f = new JFrame("COOKING GENT");
        f.setSize(500, 525);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image("Failed"); // method display
        f.setVisible(true);
    }

    // method ใช้ display รูปภาพโดย รับ input เป็นชื่อของกิน EX: "Cake","Steak","Sandwich","Omelet","FriedRice"
    public void Image(String action) {
        ArrayList<PopupImage> popupImageList = new ArrayList<>();
        popupImageList.add(new PopupImage("img/Cake.png", "Cake"));
        popupImageList.add(new PopupImage("img/Steak.png", "Steak"));
        popupImageList.add(new PopupImage("img/Sandwich.png", "Sandwich"));
        popupImageList.add(new PopupImage("img/Omelet.png", "Omelet"));
        popupImageList.add(new PopupImage("img/FiredRice.png", "FriedRice"));

        String tempImage = "img/Failed.png"; // default เป็น failed
        
        for (PopupImage popupImage : popupImageList) {
            if (popupImage.getAction().equals(action)) {
                tempImage = popupImage.getImageName();
            }
        }

        icon = new ImageIcon(tempImage);
        logoIcon = new JLabel(icon);
        logoIcon.setPreferredSize(new Dimension(500, 500));
        f.add(logoIcon);
    }

}
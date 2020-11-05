package BehavioralPattern.Visitor;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//窗体类
public class MaterialWin extends JFrame implements ItemListener {
    private static final long serialVersionUID = 1L;
    JPanel CenterJP;
    SetMaterial os;    //材料集对象
    Company visitor1, visitor2;    //访问者对象
    String[] select;

    MaterialWin() {
        super("访问者模式设计");
        JRadioButton Art;
        JRadioButton mint;
        os = new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());
        visitor1 = new ArtCompany();//艺术公司
        visitor2 = new Mint(); //造币公司
        this.setBounds(10, 10, 750, 350);
        this.setResizable(false);
        CenterJP = new JPanel();
        this.add("Center", CenterJP);
        JPanel SouthJP = new JPanel();
        JLabel yl = new JLabel("原材料有：铜和纸，请选择生产公司：");
        Art = new JRadioButton("艺术公司", true);
        mint = new JRadioButton("造币公司");
        Art.addItemListener(this);
        mint.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(Art);
        group.add(mint);
        SouthJP.add(yl);
        SouthJP.add(Art);
        SouthJP.add(mint);
        this.add("South", SouthJP);
        select = (os.accept(visitor1)).split(" ");    //获取产品名
        showPicture(select[0], select[1]);    //显示产品
    }

    //显示图片
    void showPicture(String Cuprum, String paper) {
        CenterJP.removeAll();    //清除面板内容
        CenterJP.repaint();    //刷新屏幕
        String FileName1 = "src/common/" + Cuprum + ".jpg";
        String FileName2 = "src/common/" + paper + ".jpg";
        JLabel lb = new JLabel(new ImageIcon(FileName1), JLabel.CENTER);
        JLabel rb = new JLabel(new ImageIcon(FileName2), JLabel.CENTER);
        CenterJP.add(lb);
        CenterJP.add(rb);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent arg0) {
        JRadioButton jc = (JRadioButton) arg0.getSource();
        if (jc.isSelected()) {
            if (jc.getText() == "造币公司") {
                select = (os.accept(visitor2)).split(" ");
            } else {
                select = (os.accept(visitor1)).split(" ");
            }
            showPicture(select[0], select[1]);    //显示选择的产品
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    public static final int NONE=0;
    public static final int CIRCLE=1;
    public static final int CUBE=2;
    public static final int SQUARE=3;
    public static final int SPHERE=4;
    JFrame frame;
    JPanel panel;
    JPanel innerPanel;
    JPanel nonePanel;
    JPanel circlePanel;
    JPanel cubePanel;
    JPanel squarePanel;
    JPanel spherePanel;
    Dimension dimension;
    public MainFrame(){
        super("Shape Area Calculator");
        frame=this;
        dimension=new Dimension(400,40);
        String shapes[]={"none","Circle","Cube","Square","Sphere"};
        JComboBox comboBox=new JComboBox(shapes);
        comboBox.setMaximumSize(dimension);
        panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Shape :"));
        panel.add(comboBox);
        add(panel);
        innerPanel=new JPanel();
        CardLayout cardLayout=new CardLayout();
        innerPanel.setLayout(cardLayout);
        nonePanel=createNonePanel();
        circlePanel=createCirclePanel();
        cubePanel=createCubePanel();
        squarePanel=createSquarePanel();
        spherePanel=createSpherePanel();
        innerPanel.add("none",nonePanel);
        innerPanel.add("circle",circlePanel);
        innerPanel.add("cube",cubePanel);
        innerPanel.add("square",squarePanel);
        innerPanel.add("sphere",spherePanel);
        panel.add(innerPanel);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cardLayout.show(innerPanel,"none");
        comboBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedIndex());
                switch (comboBox.getSelectedIndex()){
                    case NONE:
                        cardLayout.show(innerPanel,"none");
                        break;
                    case CIRCLE:
                        cardLayout.show(innerPanel,"circle");
                        break;
                    case CUBE:
                        cardLayout.show(innerPanel,"cube");
                        break;
                    case SQUARE:
                        cardLayout.show(innerPanel,"square");
                        break;
                    case SPHERE:
                        cardLayout.show(innerPanel,"sphere");
                        break;


                }
            }
        });
    }
    JPanel createNonePanel(){
        JPanel nonePanel=new JPanel();
        nonePanel.setLayout(new BoxLayout(nonePanel,BoxLayout.PAGE_AXIS));
        nonePanel.add(new JLabel("Select any shape for calculation"));
        return nonePanel;
    }
    JPanel createCirclePanel(){
        JPanel circlePanel=new JPanel();
        circlePanel.setLayout(new BoxLayout(circlePanel,BoxLayout.PAGE_AXIS));
        circlePanel.add(new JLabel("Enter Radius of circle : "));
        JTextField radiusTextField=new JTextField();
        radiusTextField.setMaximumSize(dimension);
        JButton calcRadius=new JButton("Calculate");
        JLabel circleAnsLabel=new JLabel();
        calcRadius.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int radius=Integer.parseInt(radiusTextField.getText());
                circleAnsLabel.setText("ans : "+new Circle(radius).area());
            }
        });
        circlePanel.add(radiusTextField);
        circlePanel.add(calcRadius);
        circlePanel.add(circleAnsLabel);
        return circlePanel;
    }
    JPanel createCubePanel(){
        JPanel cubePanel=new JPanel();
        cubePanel.setLayout(new BoxLayout(cubePanel,BoxLayout.PAGE_AXIS));
        cubePanel.add(new JLabel("Enter side length : "));
        JTextField sideTextField=new JTextField();
        sideTextField.setMaximumSize(dimension);
        JButton calculateButton=new JButton("Calculate");
        JLabel areaLabel=new JLabel();
        JLabel volumeLabel=new JLabel();
        calculateButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size;
                Cube cube;
                size=Integer.parseInt(sideTextField.getText());
                cube=new Cube(size);
                areaLabel.setText("Area : "+cube.area());
                volumeLabel.setText("Volume : "+cube.volume());

            }
        });
        cubePanel.add(sideTextField);
        cubePanel.add(calculateButton);
        cubePanel.add(areaLabel);
        cubePanel.add(volumeLabel);
        return cubePanel;
    }
    JPanel createSquarePanel(){
        JPanel squarePanel=new JPanel();
        squarePanel.setLayout(new BoxLayout(squarePanel,BoxLayout.PAGE_AXIS));
        squarePanel.add(new JLabel("Enter height : "));
        JTextField heightTextField=new JTextField();
        squarePanel.add(heightTextField);
        squarePanel.add(new JLabel("Enter width : "));
        JTextField widthTextField=new JTextField();
        squarePanel.add(widthTextField);
        JButton calculateButton=new JButton("Calculate");
        squarePanel.add(calculateButton);
        JLabel areaLabel=new JLabel();
        squarePanel.add(areaLabel);
        calculateButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height=Integer.parseInt(heightTextField.getText());
                int width=Integer.parseInt(widthTextField.getText());
                Square square=new Square(width,height);
                areaLabel.setText("Area : "+square.area());
            }
        });
        heightTextField.setMaximumSize(dimension);
        widthTextField.setMaximumSize(dimension);
        calculateButton.setMaximumSize(dimension);
        return squarePanel;
    }
    JPanel createSpherePanel(){
        JPanel spherePanel=new JPanel();
        spherePanel.setLayout(new BoxLayout(spherePanel,BoxLayout.PAGE_AXIS));
        spherePanel.add(new JLabel("Enter Radius of sphere : "));
        JTextField radiusTextField=new JTextField();
        radiusTextField.setMaximumSize(dimension);
        JButton calculateButton=new JButton("Calculate");
        JLabel sphereAnsLabel=new JLabel();
        calculateButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int radius=Integer.parseInt(radiusTextField.getText());
                sphereAnsLabel.setText("ans : "+new Sphere(radius).area());
            }
        });
        spherePanel.add(radiusTextField);
        spherePanel.add(calculateButton);
        spherePanel.add(sphereAnsLabel);
        return spherePanel;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    public static final int NONE=0;
    public static final int CIRCLE=1;
    public static final int CUBE=2;
    public static final int SQUARE=3;
    public static final int SPHERE=4;
    public static final int CONE=5;
    public static final int CYLINDER=6;
    public static final int ELLIPSE=7;
    public static final int EQUILATERAL_TRIANGLE=8;
    public static final int TRIANGLE=9;

    JFrame frame;
    JPanel panel;
    JPanel innerPanel;
    JPanel nonePanel;
    JPanel circlePanel;
    JPanel cubePanel;
    JPanel squarePanel;
    JPanel spherePanel;
    JPanel conePanel;
    JPanel cylinderPanel;
    JPanel ellipsePanel;
    JPanel equilateralTrianglePanel;
    JPanel trianglePanel;
    Dimension dimension;
    public MainFrame(){
        super("Shape Area Calculator");
        frame=this;
        dimension=new Dimension(400,40);
        String shapes[]={"none","Circle","Cube","Square","Sphere","Cone","Cylinder","Ellipse","Equilateral Triangle","Triangle"};
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
        conePanel=createConePanel();
        cylinderPanel=createCylinderPanel();
        ellipsePanel=createEllipsePanel();
        equilateralTrianglePanel=createEquilateralTrianglePanel();
        trianglePanel=createTrianglePanel();
        innerPanel.add("none",nonePanel);
        innerPanel.add("circle",circlePanel);
        innerPanel.add("cube",cubePanel);
        innerPanel.add("square",squarePanel);
        innerPanel.add("sphere",spherePanel);
        innerPanel.add("cone",conePanel);
        innerPanel.add("cylinder",cylinderPanel);
        innerPanel.add("ellipse",ellipsePanel);
        innerPanel.add("equilateral_triangle",equilateralTrianglePanel);
        innerPanel.add("triangle",trianglePanel);
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
                    case CONE:
                        cardLayout.show(innerPanel,"cone");
                        break;
                    case CYLINDER:
                        cardLayout.show(innerPanel,"cylinder");
                        break;
                    case ELLIPSE:
                        cardLayout.show(innerPanel,"ellipse");
                        break;
                    case EQUILATERAL_TRIANGLE:
                        cardLayout.show(innerPanel,"equilateral_triangle");
                        break;
                    case TRIANGLE:
                        cardLayout.show(innerPanel,"triangle");
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

    JPanel createConePanel(){
        JPanel conePanel=new JPanel();
        conePanel.setLayout(new BoxLayout(conePanel,BoxLayout.PAGE_AXIS));
        conePanel.add(new JLabel("Enter height : "));
        JTextField heightTextField=new JTextField();
        conePanel.add(heightTextField);
        conePanel.add(new JLabel("Enter radius : "));
        JTextField radiusTextField=new JTextField();
        conePanel.add(radiusTextField);
        JButton calculateButton=new JButton("Calculate");
        conePanel.add(calculateButton);
        JLabel areaLabel=new JLabel();
        conePanel.add(areaLabel);
        JLabel volumeLabel=new JLabel();
        conePanel.add(volumeLabel);
        calculateButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height=Integer.parseInt(heightTextField.getText());
                int radius=Integer.parseInt(radiusTextField.getText());
                Cone cone=new Cone(height,radius);
                areaLabel.setText("Area : "+cone.area());
                volumeLabel.setText("Volume : "+cone.volume());
            }
        });
        heightTextField.setMaximumSize(dimension);
        radiusTextField.setMaximumSize(dimension);
        calculateButton.setMaximumSize(dimension);
        return conePanel;
    }

    JPanel createCylinderPanel(){
        JPanel cylinderPanel=new JPanel();
        cylinderPanel.setLayout(new BoxLayout(cylinderPanel,BoxLayout.PAGE_AXIS));
        cylinderPanel.add(new JLabel("Enter height : "));
        JTextField heightTextField=new JTextField();
        cylinderPanel.add(heightTextField);
        cylinderPanel.add(new JLabel("Enter Radius : "));
        JTextField radiusTextField=new JTextField();
        cylinderPanel.add(radiusTextField);
        JButton calculateButton=new JButton("Calculate");
        cylinderPanel.add(calculateButton);
        JLabel areaLabel=new JLabel();
        cylinderPanel.add(areaLabel);
        JLabel volumeLabel=new JLabel();
        cylinderPanel.add(volumeLabel);
        calculateButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height=Integer.parseInt(heightTextField.getText());
                int radius=Integer.parseInt(radiusTextField.getText());
                Cylinder cylinder=new Cylinder(height,radius);
                areaLabel.setText("Area : "+cylinder.area());
                volumeLabel.setText("Volume : "+cylinder.volume());
            }
        });
        heightTextField.setMaximumSize(dimension);
        radiusTextField.setMaximumSize(dimension);
        calculateButton.setMaximumSize(dimension);
        return cylinderPanel;
    }
    JPanel createEllipsePanel(){
        JPanel squarePanel=new JPanel();
        squarePanel.setLayout(new BoxLayout(squarePanel,BoxLayout.PAGE_AXIS));
        squarePanel.add(new JLabel("Enter major axis length : "));
        JTextField majorTextField=new JTextField();
        squarePanel.add(majorTextField);
        squarePanel.add(new JLabel("Enter minor axis length : "));
        JTextField minorTextField=new JTextField();
        squarePanel.add(minorTextField);
        JButton calculateButton=new JButton("Calculate");
        squarePanel.add(calculateButton);
        JLabel areaLabel=new JLabel();
        squarePanel.add(areaLabel);
        calculateButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int major=Integer.parseInt(majorTextField.getText());
                int minor=Integer.parseInt(minorTextField.getText());
                Ellipse ellipse=new Ellipse(minor,major);
                areaLabel.setText("Area : "+ellipse.area());
            }
        });
        majorTextField.setMaximumSize(dimension);
        minorTextField.setMaximumSize(dimension);
        calculateButton.setMaximumSize(dimension);
        return squarePanel;
    }

    JPanel createEquilateralTrianglePanel(){
        JPanel circlePanel=new JPanel();
        circlePanel.setLayout(new BoxLayout(circlePanel,BoxLayout.PAGE_AXIS));
        circlePanel.add(new JLabel("Enter side of triangle : "));
        JTextField sizeTextField=new JTextField();
        sizeTextField.setMaximumSize(dimension);
        JButton calcButton=new JButton("Calculate");
        JLabel circleAnsLabel=new JLabel();
        calcButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size=Integer.parseInt(sizeTextField.getText());
                circleAnsLabel.setText("ans : "+new EquilateralTriangle(size).area());
            }
        });
        circlePanel.add(sizeTextField);
        circlePanel.add(calcButton);
        circlePanel.add(circleAnsLabel);
        return circlePanel;
    }

    JPanel createTrianglePanel(){
        JPanel trianglePanel=new JPanel();
        trianglePanel.setLayout(new BoxLayout(trianglePanel,BoxLayout.PAGE_AXIS));
        trianglePanel.add(new JLabel("Enter height of triangle : "));
        JTextField heightTextField=new JTextField();
        heightTextField.setMaximumSize(dimension);
        trianglePanel.add(heightTextField);
        trianglePanel.add(new JLabel("Enter base of triangle : "));
        JTextField baseTextField=new JTextField();
        baseTextField.setMaximumSize(dimension);
        trianglePanel.add(baseTextField);
        JButton calcRadius=new JButton("Calculate");
        JLabel triangleAnsLabel=new JLabel();
        calcRadius.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height=Integer.parseInt(heightTextField.getText());
                int base=Integer.parseInt(baseTextField.getText());
                triangleAnsLabel.setText("ans : "+new Triangle(height,base).area());
            }
        });
        trianglePanel.add(calcRadius);
        trianglePanel.add(triangleAnsLabel);
        return trianglePanel;
    }
}

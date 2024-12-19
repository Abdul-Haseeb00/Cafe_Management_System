package cafe;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;

public final class Menu_Dashboard extends javax.swing.JFrame {

    public static int generateOrderid() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
    public static int orderid = generateOrderid();

    public Menu_Dashboard() {
        initComponents();
        init();

    }

    public final void init() {
        setImage();
    }

    public void setImage() {

        ImageIcon imgicon = new ImageIcon(getClass().getResource("/images/Pepsi.jpeg"));
        ImageIcon imgicon1 = new ImageIcon(getClass().getResource("/images/7up.jpeg"));
        ImageIcon imgicon2 = new ImageIcon(getClass().getResource("/images/Big-apple.jpeg"));
        ImageIcon imgicon3 = new ImageIcon(getClass().getResource("/images/coca-cola.jpg"));
        ImageIcon imgicon4 = new ImageIcon(getClass().getResource("/images/sprite.jpg"));
        ImageIcon imgicon5 = new ImageIcon(getClass().getResource("/images/Kola.jpeg"));
        ImageIcon imgicon6 = new ImageIcon(getClass().getResource("/images/Fizzup.jpg"));
        ImageIcon imgicon7 = new ImageIcon(getClass().getResource("/images/fanta.jpg"));

        Image img = imgicon.getImage();
        Image img1 = imgicon1.getImage();
        Image img2 = imgicon2.getImage();
        Image img3 = imgicon3.getImage();
        Image img4 = imgicon4.getImage();
        Image img5 = imgicon5.getImage();
        Image img6 = imgicon6.getImage();
        Image img7 = imgicon7.getImage();

        Image scaledImage = img.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage1 = img1.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage2 = img2.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage3 = img3.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage4 = img4.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage5 = img5.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage6 = img6.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledImage7 = img7.getScaledInstance(up_img.getWidth(), up_img.getHeight(), Image.SCALE_SMOOTH);

        Pepsi_img.setIcon(new ImageIcon(scaledImage1));
        up_img.setIcon(new ImageIcon(scaledImage));
        cola_img.setIcon(new ImageIcon(scaledImage2));
        sprite_img.setIcon(new ImageIcon(scaledImage3));
        Fizzup_img.setIcon(new ImageIcon(scaledImage4));
        kola_img.setIcon(new ImageIcon(scaledImage5));
        Big_apple_img.setIcon(new ImageIcon(scaledImage6));
        fanta_img.setIcon(new ImageIcon(scaledImage7));

        ImageIcon Desert_img = new ImageIcon(getClass().getResource("/images/iceCream.jpeg"));
        ImageIcon Desert_img1 = new ImageIcon(getClass().getResource("/images/cakeSlice.jpg"));
        ImageIcon Desert_img2 = new ImageIcon(getClass().getResource("/images/Brownies.jpg"));
        ImageIcon Desert_img3 = new ImageIcon(getClass().getResource("/images/Cheesecake.jpg"));
        ImageIcon Desert_img4 = new ImageIcon(getClass().getResource("/images/cupCake.jpeg"));
        ImageIcon Desert_img5 = new ImageIcon(getClass().getResource("/images/Waffles.jpeg"));
        ImageIcon Desert_img6 = new ImageIcon(getClass().getResource("/images/Donuts.jpg"));
        ImageIcon Desert_img7 = new ImageIcon(getClass().getResource("/images/Pudding.jpg"));
        Image iceCream = Desert_img.getImage();
        Image cakeSlice = Desert_img1.getImage();
        Image Brownies = Desert_img2.getImage();
        Image Cheesecake = Desert_img3.getImage();
        Image cupCake = Desert_img4.getImage();
        Image Waffles = Desert_img5.getImage();
        Image Donuts = Desert_img6.getImage();
        Image Pudding = Desert_img7.getImage();

        Image scalediceCream = iceCream.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledcakeSlice = cakeSlice.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledBrownies = Brownies.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledCheesecake = Cheesecake.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledcupCake = cupCake.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledWaffles = Waffles.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledDonuts = Donuts.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledPudding = Pudding.getScaledInstance(Waffles_img.getWidth(), Waffles_img.getHeight(), Image.SCALE_SMOOTH);
        iceCream_img.setIcon(new ImageIcon(scalediceCream));
        cakeSlice_img.setIcon(new ImageIcon(scaledcakeSlice));
        Brownies_img.setIcon(new ImageIcon(scaledBrownies));
        Cheesecake_img.setIcon(new ImageIcon(scaledCheesecake));
        cupCake_img.setIcon(new ImageIcon(scaledcupCake));
        Waffles_img.setIcon(new ImageIcon(scaledWaffles));
        Donuts_img.setIcon(new ImageIcon(scaledDonuts));
        Pudding_img.setIcon(new ImageIcon(scaledPudding));

        ImageIcon MainCourse_img = new ImageIcon(getClass().getResource("/images/Pasta.jpeg"));
        ImageIcon MainCourse_img1 = new ImageIcon(getClass().getResource("/images/Steaks.jpeg"));
        ImageIcon MainCourse_img2 = new ImageIcon(getClass().getResource("/images/Grilled Chicken.jpeg"));
        ImageIcon MainCourse_img3 = new ImageIcon(getClass().getResource("/images/Rice_Bowls.jpg"));
        ImageIcon MainCourse_img4 = new ImageIcon(getClass().getResource("/images/Seafood_Platter.jpeg"));
        ImageIcon MainCourse_img5 = new ImageIcon(getClass().getResource("/images/Soup_&_Bread.jpeg"));
        ImageIcon MainCourse_img6 = new ImageIcon(getClass().getResource("/images/Stir_Fried_Noodles.jpeg"));
        ImageIcon MainCourse_img7 = new ImageIcon(getClass().getResource("/images/Roast_Beef.jpeg"));
        Image Pasta = MainCourse_img.getImage();
        Image Steaks = MainCourse_img1.getImage();
        Image Grilled_Chicken = MainCourse_img2.getImage();
        Image Rice_Bowls = MainCourse_img3.getImage();
        Image Seafood_Platter = MainCourse_img4.getImage();
        Image Soup_Bread = MainCourse_img5.getImage();
        Image Stir_Fried_Noodles = MainCourse_img6.getImage();
        Image Roast_Beef = MainCourse_img7.getImage();
        Image scaledPasta = Pasta.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledSteaks = Steaks.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledGrilled_Chicken = Grilled_Chicken.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledRice_Bowls = Rice_Bowls.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledSeafood_Platter = Seafood_Platter.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledSoup_Bread = Soup_Bread.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledStir_Fried_Noodles = Stir_Fried_Noodles.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledRoast_Beef = Roast_Beef.getScaledInstance(Pasta_img.getWidth(), Pasta_img.getHeight(), Image.SCALE_SMOOTH);
        Pasta_img.setIcon(new ImageIcon(scaledPasta));
        Steaks_img.setIcon(new ImageIcon(scaledSteaks));
        Grilled_Chicken_img.setIcon(new ImageIcon(scaledGrilled_Chicken));
        Rice_Bowls_img.setIcon(new ImageIcon(scaledRice_Bowls));
        Seafood_Platter_img.setIcon(new ImageIcon(scaledSeafood_Platter));
        Soup_Bread_img.setIcon(new ImageIcon(scaledSoup_Bread));
        Stir_Fried_Noodles_img.setIcon(new ImageIcon(scaledStir_Fried_Noodles));
        Roast_Beef_img.setIcon(new ImageIcon(scaledRoast_Beef));

        ImageIcon Snack_img = new ImageIcon(getClass().getResource("/images/Spring_Rolls.jpg"));
        ImageIcon Snack_img1 = new ImageIcon(getClass().getResource("/images/Samosas.jpeg"));
        ImageIcon Snack_img2 = new ImageIcon(getClass().getResource("/images/Garlic_Bread.jpg"));
        ImageIcon Snack_img3 = new ImageIcon(getClass().getResource("/images/Onion_Rings.jpg"));
        ImageIcon Snack_img4 = new ImageIcon(getClass().getResource("/images/Onion_Rings.jpg"));
        ImageIcon Snack_img5 = new ImageIcon(getClass().getResource("/images/Mozzarella_Sticks.jpeg"));
        ImageIcon Snack_img6 = new ImageIcon(getClass().getResource("/images/Chips_Salsa.jpeg"));
        ImageIcon Snack_img7 = new ImageIcon(getClass().getResource("/images/Pretzels.jpeg"));
        Image Spring_Rolls = Snack_img.getImage();
        Image Samosas = Snack_img1.getImage();
        Image Garlic_Bread = Snack_img2.getImage();
        Image Onion_Rings = Snack_img3.getImage();
        Image Popcorn = Snack_img4.getImage();
        Image Mozzarella_Sticks = Snack_img5.getImage();
        Image Chips_Salsa = Snack_img6.getImage();
        Image Pretzels = Snack_img7.getImage();
        Image scaledSpring_Rolls = Spring_Rolls.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledSamosas = Samosas.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledGarlic_Bread = Garlic_Bread.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledOnion_Rings = Onion_Rings.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledPopcorn = Popcorn.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledMozzarella_Sticks = Mozzarella_Sticks.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledChips_Salsa = Chips_Salsa.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledPretzels = Pretzels.getScaledInstance(Pretzels_img.getWidth(), Pretzels_img.getHeight(), Image.SCALE_SMOOTH);
        Spring_Rolls_img.setIcon(new ImageIcon(scaledSpring_Rolls));
        Samosas_img.setIcon(new ImageIcon(scaledSamosas));
        Garlic_Bread_img.setIcon(new ImageIcon(scaledGarlic_Bread));
        Onion_Rings_img.setIcon(new ImageIcon(scaledOnion_Rings));
        Popcorn_img.setIcon(new ImageIcon(scaledPopcorn));
        Mozzarella_Sticks_img.setIcon(new ImageIcon(scaledMozzarella_Sticks));
        Chips_Salsa_img.setIcon(new ImageIcon(scaledChips_Salsa));
        Pretzels_img.setIcon(new ImageIcon(scaledPretzels));

        ImageIcon FastFood_img = new ImageIcon(getClass().getResource("/images/Pizza.jpeg"));
        ImageIcon FastFood_img1 = new ImageIcon(getClass().getResource("/images/Burgers.jpg"));
        ImageIcon FastFood_img2 = new ImageIcon(getClass().getResource("/images/French_Fries.jpg"));
        ImageIcon FastFood_img3 = new ImageIcon(getClass().getResource("/images/Sandwiches.jpeg"));
        ImageIcon FastFood_img4 = new ImageIcon(getClass().getResource("/images/Hot_Dogs.jpeg"));
        ImageIcon FastFood_img5 = new ImageIcon(getClass().getResource("/images/Tacos.jpeg"));
        ImageIcon FastFood_img6 = new ImageIcon(getClass().getResource("/images/Nachos.jpeg"));
        ImageIcon FastFood_img7 = new ImageIcon(getClass().getResource("/images/Chicken_Nuggets.jpeg"));
        Image Pizza = FastFood_img.getImage();
        Image Burgers = FastFood_img1.getImage();
        Image French_Fries = FastFood_img2.getImage();
        Image Sandwiches = FastFood_img3.getImage();
        Image Hot_Dogs = FastFood_img4.getImage();
        Image Tacos = FastFood_img5.getImage();
        Image Nachos = FastFood_img6.getImage();
        Image Chicken_Nuggets = FastFood_img7.getImage();

        Image scaledPizza = Pizza.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledBurgers = Burgers.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledFrench_Fries = French_Fries.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledSandwiches = Sandwiches.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledHot_Dogs = Hot_Dogs.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledTacos = Tacos.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledNachos = Nachos.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Image scaledChicken_Nuggets = Chicken_Nuggets.getScaledInstance(Pizza_img.getWidth(), Pizza_img.getHeight(), Image.SCALE_SMOOTH);
        Pizza_img.setIcon(new ImageIcon(scaledPizza));
        Burgers_img.setIcon(new ImageIcon(scaledBurgers));
        French_Fries_img.setIcon(new ImageIcon(scaledFrench_Fries));
        Sandwiches_img.setIcon(new ImageIcon(scaledSandwiches));
        Hot_Dogs_img.setIcon(new ImageIcon(scaledHot_Dogs));
        Tacos_img.setIcon(new ImageIcon(scaledTacos));
        Nachos_img.setIcon(new ImageIcon(scaledNachos));
        Chicken_Nuggets_img.setIcon(new ImageIcon(scaledChicken_Nuggets));

    }

    public void CafeVista() {
        orderid = generateOrderid();
        String receiptTemplate
                = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "                                     Cafe Vista\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "Order ID:\t" + orderid + "\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "   Description\t\tAmount (PKR)\n";
        Receipt_extArea.setText(receiptTemplate);

    }

    public void resetOrder() {
        JSpinner[] spinners = {Pepsi_Label_jSpinner, up_jSpinner, Big_apple_jSpinner, cola_jSpinner, Sprite_jSpinner, kola_jSpinner, Fizzup_jSpinner, Fanta_jSpinner, Waffles_jSpinner, Cake_Slice_jSpinner, Brownies_jSpinner, Cheese_cake_jSpinner, Ice_Cream_jSpinner, Cup_cake_jSpinner, Donuts_jSpinner, Pudding_jSpinner, Pasta_jSpinner, Steaks_jSpinner, Rice_Bowls_jSpinner, Grilled_Chicken_jSpinner, Seafood_Platter_jSpinner, Soup_Bread_jSpinner, Stir_Fried_Noodles_jSpinner, Roast_Beef_jSpinner, Spring_Rolls_jSpinner, Samosas_jSpinner, Garlic_Bread_jSpinner, Popcorn_jSpinner, Onion_Rings_jSpinner, Mozzarella_Sticks_jSpinner, Chips_Salsa_jSpinner, Pretzels_jSpinner, Sandwiches_jSpinner, French_Fries_jSpinner, Tacos_jSpinner, Hot_Dogs_jSpinner, Chicken_Nuggets_jSpinner, Nachos_jSpinner};
        OrderRessetter.resetOrder(spinners, Receipt_extArea, tax_jTextField, total_jTextField, Service_charges_jTextField);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name_Container = new javax.swing.JPanel();
        Cafe_Name = new javax.swing.JLabel();
        Categories_Button_Pannel = new javax.swing.JPanel();
        Snacks_button = new javax.swing.JButton();
        Main_Course_Button = new javax.swing.JButton();
        Desserts_Button = new javax.swing.JButton();
        Bevarages_Button = new javax.swing.JButton();
        Fast_Foods_button = new javax.swing.JButton();
        Menu_Panel = new javax.swing.JLayeredPane();
        Fast_Food_Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Burgers_Panel = new javax.swing.JPanel();
        Burgers_Label = new javax.swing.JLabel();
        Pepsi_Price26 = new javax.swing.JLabel();
        Burgers_img = new javax.swing.JLabel();
        add_btn32 = new javax.swing.JButton();
        jSpinner41 = new javax.swing.JSpinner();
        Pizza_Panel = new javax.swing.JPanel();
        Pizza_Label27 = new javax.swing.JLabel();
        Pepsi_Price27 = new javax.swing.JLabel();
        Pizza_img = new javax.swing.JLabel();
        add_btn33 = new javax.swing.JButton();
        jSpinner = new javax.swing.JSpinner();
        Sandwiches_Panel = new javax.swing.JPanel();
        Sandwiches_Label = new javax.swing.JLabel();
        Pepsi_Price28 = new javax.swing.JLabel();
        Sandwiches_img = new javax.swing.JLabel();
        Sandwiches_jSpinner = new javax.swing.JSpinner();
        add_btn34 = new javax.swing.JButton();
        French_Fries_Panel = new javax.swing.JPanel();
        French_Fries_Label = new javax.swing.JLabel();
        Pepsi_Price29 = new javax.swing.JLabel();
        French_Fries_img = new javax.swing.JLabel();
        French_Fries_jSpinner = new javax.swing.JSpinner();
        add_btn35 = new javax.swing.JButton();
        Tacos_Panel = new javax.swing.JPanel();
        Tacos_Label = new javax.swing.JLabel();
        Pepsi_Price30 = new javax.swing.JLabel();
        Tacos_img = new javax.swing.JLabel();
        Tacos_jSpinner = new javax.swing.JSpinner();
        add_btn36 = new javax.swing.JButton();
        Hot_Dogs_Panel = new javax.swing.JPanel();
        Hot_Dogs_Label = new javax.swing.JLabel();
        Pepsi_Price31 = new javax.swing.JLabel();
        Hot_Dogs_img = new javax.swing.JLabel();
        Hot_Dogs_jSpinner = new javax.swing.JSpinner();
        add_btn37 = new javax.swing.JButton();
        Chicken_Nuggets_Panel = new javax.swing.JPanel();
        Chicken_Nuggets_Label = new javax.swing.JLabel();
        Pepsi_Price32 = new javax.swing.JLabel();
        Chicken_Nuggets_img = new javax.swing.JLabel();
        Chicken_Nuggets_jSpinner = new javax.swing.JSpinner();
        add_btn38 = new javax.swing.JButton();
        Nachos_Panel = new javax.swing.JPanel();
        Nachos_Label = new javax.swing.JLabel();
        Pepsi_Price33 = new javax.swing.JLabel();
        Nachos_img = new javax.swing.JLabel();
        Nachos_jSpinner = new javax.swing.JSpinner();
        add_btn39 = new javax.swing.JButton();
        Snacks_Pannel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Spring_Rolls_Panel = new javax.swing.JPanel();
        Spring_Rolls_Label = new javax.swing.JLabel();
        Pepsi_Price18 = new javax.swing.JLabel();
        Spring_Rolls_img = new javax.swing.JLabel();
        Spring_Rolls_jSpinner = new javax.swing.JSpinner();
        add_btn24 = new javax.swing.JButton();
        Samosas_Panel = new javax.swing.JPanel();
        Samosas_Label = new javax.swing.JLabel();
        Pepsi_Price19 = new javax.swing.JLabel();
        Samosas_img = new javax.swing.JLabel();
        Samosas_jSpinner = new javax.swing.JSpinner();
        add_btn25 = new javax.swing.JButton();
        Garlic_Bread_Panel = new javax.swing.JPanel();
        Garlic_Bread_Label = new javax.swing.JLabel();
        Pepsi_Price20 = new javax.swing.JLabel();
        Garlic_Bread_img = new javax.swing.JLabel();
        Garlic_Bread_jSpinner = new javax.swing.JSpinner();
        add_btn26 = new javax.swing.JButton();
        Popcorn_Panel = new javax.swing.JPanel();
        Popcorn_Label = new javax.swing.JLabel();
        Pepsi_Price21 = new javax.swing.JLabel();
        Popcorn_img = new javax.swing.JLabel();
        Popcorn_jSpinner = new javax.swing.JSpinner();
        add_btn27 = new javax.swing.JButton();
        Onion_Rings_Panel = new javax.swing.JPanel();
        Onion_Rings_Label = new javax.swing.JLabel();
        Pepsi_Price22 = new javax.swing.JLabel();
        Onion_Rings_img = new javax.swing.JLabel();
        Onion_Rings_jSpinner = new javax.swing.JSpinner();
        add_btn28 = new javax.swing.JButton();
        Mozzarella_Sticks_Panel = new javax.swing.JPanel();
        Mozzarella_Sticks_Label = new javax.swing.JLabel();
        Pepsi_Price23 = new javax.swing.JLabel();
        Mozzarella_Sticks_img = new javax.swing.JLabel();
        Mozzarella_Sticks_jSpinner = new javax.swing.JSpinner();
        add_btn29 = new javax.swing.JButton();
        Chips_Salsa_Panel = new javax.swing.JPanel();
        Chips_Salsa_Label = new javax.swing.JLabel();
        Pepsi_Price24 = new javax.swing.JLabel();
        Chips_Salsa_img = new javax.swing.JLabel();
        Chips_Salsa_jSpinner = new javax.swing.JSpinner();
        add_btn30 = new javax.swing.JButton();
        Pretzelsn_Panel = new javax.swing.JPanel();
        Pretzels_Label = new javax.swing.JLabel();
        Pepsi_Price25 = new javax.swing.JLabel();
        Pretzels_img = new javax.swing.JLabel();
        Pretzels_jSpinner = new javax.swing.JSpinner();
        add_btn31 = new javax.swing.JButton();
        Main_Course_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pasta_Panel = new javax.swing.JPanel();
        Pasta_Label = new javax.swing.JLabel();
        Pepsi_Price10 = new javax.swing.JLabel();
        Pasta_img = new javax.swing.JLabel();
        Pasta_jSpinner = new javax.swing.JSpinner();
        add_btn16 = new javax.swing.JButton();
        Steaks_Panel = new javax.swing.JPanel();
        Steaks_Label = new javax.swing.JLabel();
        Pepsi_Price11 = new javax.swing.JLabel();
        Steaks_img = new javax.swing.JLabel();
        Steaks_jSpinner = new javax.swing.JSpinner();
        add_btn17 = new javax.swing.JButton();
        Rice_Bowls_Panel = new javax.swing.JPanel();
        Rice_Bowls_Label = new javax.swing.JLabel();
        Pepsi_Price12 = new javax.swing.JLabel();
        Rice_Bowls_img = new javax.swing.JLabel();
        Rice_Bowls_jSpinner = new javax.swing.JSpinner();
        add_btn18 = new javax.swing.JButton();
        Grilled_Chicken_Panel = new javax.swing.JPanel();
        Grilled_Chicken_Label = new javax.swing.JLabel();
        Pepsi_Price13 = new javax.swing.JLabel();
        Grilled_Chicken_img = new javax.swing.JLabel();
        Grilled_Chicken_jSpinner = new javax.swing.JSpinner();
        add_btn19 = new javax.swing.JButton();
        Seafood_Platter_Panel = new javax.swing.JPanel();
        Seafood_Platter_Label = new javax.swing.JLabel();
        Pepsi_Price14 = new javax.swing.JLabel();
        Seafood_Platter_img = new javax.swing.JLabel();
        Seafood_Platter_jSpinner = new javax.swing.JSpinner();
        add_btn20 = new javax.swing.JButton();
        Soup_Bread_Panel = new javax.swing.JPanel();
        Soup_Bread_Label = new javax.swing.JLabel();
        Pepsi_Price15 = new javax.swing.JLabel();
        Soup_Bread_img = new javax.swing.JLabel();
        Soup_Bread_jSpinner = new javax.swing.JSpinner();
        add_btn21 = new javax.swing.JButton();
        Stir_Fried_Noodles_Panel = new javax.swing.JPanel();
        Stir_Fried_Noodles_Label = new javax.swing.JLabel();
        Pepsi_Price16 = new javax.swing.JLabel();
        Stir_Fried_Noodles_img = new javax.swing.JLabel();
        Stir_Fried_Noodles_jSpinner = new javax.swing.JSpinner();
        add_btn22 = new javax.swing.JButton();
        Roast_Beef_Panel = new javax.swing.JPanel();
        Roast_Beef_Label = new javax.swing.JLabel();
        Pepsi_Price17 = new javax.swing.JLabel();
        Roast_Beef_img = new javax.swing.JLabel();
        Roast_Beef_jSpinner = new javax.swing.JSpinner();
        add_btn23 = new javax.swing.JButton();
        Dessert_Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cupCake_Panel = new javax.swing.JPanel();
        Waffles_Label = new javax.swing.JLabel();
        Pepsi_Price2 = new javax.swing.JLabel();
        Waffles_img = new javax.swing.JLabel();
        Waffles_jSpinner = new javax.swing.JSpinner();
        add_btn8 = new javax.swing.JButton();
        cakeSlice_panel = new javax.swing.JPanel();
        Cake_Slice_Label = new javax.swing.JLabel();
        Pepsi_Price3 = new javax.swing.JLabel();
        cakeSlice_img = new javax.swing.JLabel();
        Cake_Slice_jSpinner = new javax.swing.JSpinner();
        add_btn9 = new javax.swing.JButton();
        Browmies_panel = new javax.swing.JPanel();
        Brownies_Label = new javax.swing.JLabel();
        Pepsi_Price4 = new javax.swing.JLabel();
        Brownies_img = new javax.swing.JLabel();
        Brownies_jSpinner = new javax.swing.JSpinner();
        add_btn10 = new javax.swing.JButton();
        Cheesecake_panel = new javax.swing.JPanel();
        Cheese_cake_Label = new javax.swing.JLabel();
        Pepsi_Price5 = new javax.swing.JLabel();
        Cheesecake_img = new javax.swing.JLabel();
        Cheese_cake_jSpinner = new javax.swing.JSpinner();
        add_btn11 = new javax.swing.JButton();
        IceCream_Panel1 = new javax.swing.JPanel();
        Ice_Cream_Label = new javax.swing.JLabel();
        Pepsi_Price6 = new javax.swing.JLabel();
        iceCream_img = new javax.swing.JLabel();
        Ice_Cream_jSpinner = new javax.swing.JSpinner();
        add_btn12 = new javax.swing.JButton();
        cupCake_Panel1 = new javax.swing.JPanel();
        Cup_cake_Label = new javax.swing.JLabel();
        Pepsi_Price7 = new javax.swing.JLabel();
        cupCake_img = new javax.swing.JLabel();
        Cup_cake_jSpinner = new javax.swing.JSpinner();
        add_btn13 = new javax.swing.JButton();
        Donuts_Panel = new javax.swing.JPanel();
        Donuts_Label = new javax.swing.JLabel();
        Pepsi_Price8 = new javax.swing.JLabel();
        Donuts_img = new javax.swing.JLabel();
        Donuts_jSpinner = new javax.swing.JSpinner();
        add_btn14 = new javax.swing.JButton();
        cupCake_Panel3 = new javax.swing.JPanel();
        Pudding_Label = new javax.swing.JLabel();
        Pepsi_Price9 = new javax.swing.JLabel();
        Pudding_img = new javax.swing.JLabel();
        Pudding_jSpinner = new javax.swing.JSpinner();
        add_btn15 = new javax.swing.JButton();
        Bevarages_Panel = new javax.swing.JPanel();
        Bevarages_Title = new javax.swing.JLabel();
        up_Panel = new javax.swing.JPanel();
        Pepsi_Label = new javax.swing.JLabel();
        up_price = new javax.swing.JLabel();
        up_img = new javax.swing.JLabel();
        Pepsi_Label_jSpinner = new javax.swing.JSpinner();
        Pepsi_add_btn = new javax.swing.JButton();
        Pepsi_Panel1 = new javax.swing.JPanel();
        up_Label = new javax.swing.JLabel();
        Pepsi_Price1 = new javax.swing.JLabel();
        Pepsi_img = new javax.swing.JLabel();
        up_jSpinner = new javax.swing.JSpinner();
        add_btn1 = new javax.swing.JButton();
        cola_Panel2 = new javax.swing.JPanel();
        Big_apple_Label = new javax.swing.JLabel();
        cola_Price = new javax.swing.JLabel();
        cola_img = new javax.swing.JLabel();
        Big_apple_jSpinner = new javax.swing.JSpinner();
        add_btn2 = new javax.swing.JButton();
        sprite_Panel = new javax.swing.JPanel();
        cola_Label = new javax.swing.JLabel();
        sprite_price = new javax.swing.JLabel();
        sprite_img = new javax.swing.JLabel();
        cola_jSpinner = new javax.swing.JSpinner();
        add_btn3 = new javax.swing.JButton();
        Fizzup_Panel = new javax.swing.JPanel();
        Sprite_Label = new javax.swing.JLabel();
        Fizzup_price = new javax.swing.JLabel();
        Fizzup_img = new javax.swing.JLabel();
        Sprite_jSpinner = new javax.swing.JSpinner();
        add_btn4 = new javax.swing.JButton();
        kola_Panel = new javax.swing.JPanel();
        kola_Label = new javax.swing.JLabel();
        kola_price = new javax.swing.JLabel();
        kola_img = new javax.swing.JLabel();
        kola_jSpinner = new javax.swing.JSpinner();
        add_btn5 = new javax.swing.JButton();
        Big_Apple_Panel = new javax.swing.JPanel();
        Fizzup_Label = new javax.swing.JLabel();
        Big_apple_price = new javax.swing.JLabel();
        Big_apple_img = new javax.swing.JLabel();
        Fizzup_jSpinner = new javax.swing.JSpinner();
        add_btn6 = new javax.swing.JButton();
        Fanta_Panel = new javax.swing.JPanel();
        Fanta_Label = new javax.swing.JLabel();
        Fanta_price = new javax.swing.JLabel();
        fanta_img = new javax.swing.JLabel();
        Fanta_jSpinner = new javax.swing.JSpinner();
        add_btn7 = new javax.swing.JButton();
        Functional_btn = new javax.swing.JPanel();
        receipt_Button = new javax.swing.JButton();
        reset_Button = new javax.swing.JButton();
        exit_Button = new javax.swing.JButton();
        total_Button = new javax.swing.JButton();
        Receipt_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Receipt_extArea = new javax.swing.JTextArea();
        Tax_jLabel1 = new javax.swing.JLabel();
        Service_Charges_jLabel = new javax.swing.JLabel();
        total_jLabel = new javax.swing.JLabel();
        tax_jTextField = new javax.swing.JTextField();
        total_jTextField = new javax.swing.JTextField();
        Service_charges_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setUndecorated(true);

        Name_Container.setBackground(new java.awt.Color(250, 250, 250));
        Name_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Cafe_Name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Cafe_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cafe_Name.setText("Cafe Vista");

        javax.swing.GroupLayout Name_ContainerLayout = new javax.swing.GroupLayout(Name_Container);
        Name_Container.setLayout(Name_ContainerLayout);
        Name_ContainerLayout.setHorizontalGroup(
            Name_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Name_ContainerLayout.createSequentialGroup()
                .addGap(626, 626, 626)
                .addComponent(Cafe_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Name_ContainerLayout.setVerticalGroup(
            Name_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Name_ContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Cafe_Name)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Categories_Button_Pannel.setBackground(new java.awt.Color(250, 250, 250));
        Categories_Button_Pannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Snacks_button.setBackground(new java.awt.Color(0, 0, 153));
        Snacks_button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Snacks_button.setForeground(new java.awt.Color(255, 255, 255));
        Snacks_button.setText("Snacks");
        Snacks_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Snacks_buttonActionPerformed(evt);
            }
        });

        Main_Course_Button.setBackground(new java.awt.Color(0, 0, 153));
        Main_Course_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Main_Course_Button.setForeground(new java.awt.Color(255, 255, 255));
        Main_Course_Button.setText("Main Course");
        Main_Course_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Course_ButtonActionPerformed(evt);
            }
        });

        Desserts_Button.setBackground(new java.awt.Color(0, 0, 153));
        Desserts_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Desserts_Button.setForeground(new java.awt.Color(255, 255, 255));
        Desserts_Button.setText("Desserts");
        Desserts_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Desserts_ButtonActionPerformed(evt);
            }
        });

        Bevarages_Button.setBackground(new java.awt.Color(0, 51, 153));
        Bevarages_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Bevarages_Button.setForeground(new java.awt.Color(255, 255, 255));
        Bevarages_Button.setText("Bevarages");
        Bevarages_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bevarages_ButtonActionPerformed(evt);
            }
        });

        Fast_Foods_button.setBackground(new java.awt.Color(0, 0, 153));
        Fast_Foods_button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fast_Foods_button.setForeground(new java.awt.Color(255, 255, 255));
        Fast_Foods_button.setText("Fast Foods");
        Fast_Foods_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fast_Foods_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Categories_Button_PannelLayout = new javax.swing.GroupLayout(Categories_Button_Pannel);
        Categories_Button_Pannel.setLayout(Categories_Button_PannelLayout);
        Categories_Button_PannelLayout.setHorizontalGroup(
            Categories_Button_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Categories_Button_PannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Fast_Foods_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Snacks_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Main_Course_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Desserts_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bevarages_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Categories_Button_PannelLayout.setVerticalGroup(
            Categories_Button_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Categories_Button_PannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Categories_Button_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bevarages_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Snacks_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fast_Foods_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Main_Course_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Desserts_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        Menu_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Menu_Panel.setLayout(new java.awt.CardLayout());

        Fast_Food_Panel.setBackground(new java.awt.Color(250, 250, 250));

        jLabel6.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        jLabel6.setText("Fast Foods");

        Burgers_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Burgers_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Burgers_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Burgers_Label.setText("Burgers");

        Pepsi_Price26.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price26.setText("PKR 560");

        add_btn32.setBackground(new java.awt.Color(0, 0, 128));
        add_btn32.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn32.setForeground(new java.awt.Color(255, 255, 255));
        add_btn32.setText("ADD");
        add_btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn32ActionPerformed(evt);
            }
        });

        jSpinner41.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        jSpinner41.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner41.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Burgers_PanelLayout = new javax.swing.GroupLayout(Burgers_Panel);
        Burgers_Panel.setLayout(Burgers_PanelLayout);
        Burgers_PanelLayout.setHorizontalGroup(
            Burgers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Burgers_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Burgers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Burgers_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Burgers_PanelLayout.createSequentialGroup()
                        .addComponent(Burgers_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price26))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Burgers_PanelLayout.createSequentialGroup()
                        .addComponent(jSpinner41, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Burgers_PanelLayout.setVerticalGroup(
            Burgers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Burgers_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Burgers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Burgers_Label)
                    .addComponent(Pepsi_Price26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Burgers_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Burgers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner41, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pizza_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Pizza_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Pizza_Label27.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pizza_Label27.setText("Pizza");

        Pepsi_Price27.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price27.setText("PKR 1200");

        add_btn33.setBackground(new java.awt.Color(0, 0, 128));
        add_btn33.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn33.setForeground(new java.awt.Color(255, 255, 255));
        add_btn33.setText("ADD");
        add_btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn33ActionPerformed(evt);
            }
        });

        jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Pizza_PanelLayout = new javax.swing.GroupLayout(Pizza_Panel);
        Pizza_Panel.setLayout(Pizza_PanelLayout);
        Pizza_PanelLayout.setHorizontalGroup(
            Pizza_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pizza_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pizza_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pizza_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Pizza_PanelLayout.createSequentialGroup()
                        .addComponent(Pizza_Label27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price27))
                    .addGroup(Pizza_PanelLayout.createSequentialGroup()
                        .addComponent(jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Pizza_PanelLayout.setVerticalGroup(
            Pizza_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pizza_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Pizza_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pizza_Label27)
                    .addComponent(Pepsi_Price27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pizza_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pizza_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Sandwiches_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Sandwiches_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Sandwiches_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Sandwiches_Label.setText("Sandwiches");

        Pepsi_Price28.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price28.setText("PKR 180");

        Sandwiches_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Sandwiches_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Sandwiches_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn34.setBackground(new java.awt.Color(0, 0, 128));
        add_btn34.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn34.setForeground(new java.awt.Color(255, 255, 255));
        add_btn34.setText("ADD");
        add_btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Sandwiches_PanelLayout = new javax.swing.GroupLayout(Sandwiches_Panel);
        Sandwiches_Panel.setLayout(Sandwiches_PanelLayout);
        Sandwiches_PanelLayout.setHorizontalGroup(
            Sandwiches_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sandwiches_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Sandwiches_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sandwiches_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Sandwiches_PanelLayout.createSequentialGroup()
                        .addComponent(Sandwiches_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price28))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Sandwiches_PanelLayout.createSequentialGroup()
                        .addComponent(Sandwiches_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Sandwiches_PanelLayout.setVerticalGroup(
            Sandwiches_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sandwiches_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Sandwiches_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sandwiches_Label)
                    .addComponent(Pepsi_Price28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sandwiches_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sandwiches_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sandwiches_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        French_Fries_Panel.setBackground(new java.awt.Color(250, 250, 250));
        French_Fries_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        French_Fries_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        French_Fries_Label.setText("French Fries");

        Pepsi_Price29.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price29.setText("PKR 120");

        French_Fries_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        French_Fries_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        French_Fries_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn35.setBackground(new java.awt.Color(0, 0, 128));
        add_btn35.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn35.setForeground(new java.awt.Color(255, 255, 255));
        add_btn35.setText("ADD");
        add_btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout French_Fries_PanelLayout = new javax.swing.GroupLayout(French_Fries_Panel);
        French_Fries_Panel.setLayout(French_Fries_PanelLayout);
        French_Fries_PanelLayout.setHorizontalGroup(
            French_Fries_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, French_Fries_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(French_Fries_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(French_Fries_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, French_Fries_PanelLayout.createSequentialGroup()
                        .addComponent(French_Fries_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, French_Fries_PanelLayout.createSequentialGroup()
                        .addComponent(French_Fries_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        French_Fries_PanelLayout.setVerticalGroup(
            French_Fries_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(French_Fries_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(French_Fries_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(French_Fries_Label)
                    .addComponent(Pepsi_Price29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(French_Fries_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(French_Fries_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(French_Fries_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tacos_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Tacos_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Tacos_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Tacos_Label.setText("Tacos");

        Pepsi_Price30.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price30.setText("PKR 250");

        Tacos_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Tacos_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Tacos_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn36.setBackground(new java.awt.Color(0, 0, 128));
        add_btn36.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn36.setForeground(new java.awt.Color(255, 255, 255));
        add_btn36.setText("ADD");
        add_btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tacos_PanelLayout = new javax.swing.GroupLayout(Tacos_Panel);
        Tacos_Panel.setLayout(Tacos_PanelLayout);
        Tacos_PanelLayout.setHorizontalGroup(
            Tacos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tacos_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tacos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tacos_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tacos_PanelLayout.createSequentialGroup()
                        .addComponent(Tacos_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price30))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tacos_PanelLayout.createSequentialGroup()
                        .addComponent(Tacos_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Tacos_PanelLayout.setVerticalGroup(
            Tacos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tacos_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Tacos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tacos_Label)
                    .addComponent(Pepsi_Price30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tacos_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tacos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tacos_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Hot_Dogs_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Hot_Dogs_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Hot_Dogs_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Hot_Dogs_Label.setText("Hot Dogs");

        Pepsi_Price31.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price31.setText("PKR 300");

        Hot_Dogs_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Hot_Dogs_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Hot_Dogs_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn37.setBackground(new java.awt.Color(0, 0, 128));
        add_btn37.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn37.setForeground(new java.awt.Color(255, 255, 255));
        add_btn37.setText("ADD");
        add_btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Hot_Dogs_PanelLayout = new javax.swing.GroupLayout(Hot_Dogs_Panel);
        Hot_Dogs_Panel.setLayout(Hot_Dogs_PanelLayout);
        Hot_Dogs_PanelLayout.setHorizontalGroup(
            Hot_Dogs_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Hot_Dogs_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Hot_Dogs_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Hot_Dogs_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Hot_Dogs_PanelLayout.createSequentialGroup()
                        .addComponent(Hot_Dogs_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price31))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Hot_Dogs_PanelLayout.createSequentialGroup()
                        .addComponent(Hot_Dogs_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Hot_Dogs_PanelLayout.setVerticalGroup(
            Hot_Dogs_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hot_Dogs_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Hot_Dogs_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hot_Dogs_Label)
                    .addComponent(Pepsi_Price31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hot_Dogs_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Hot_Dogs_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hot_Dogs_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Chicken_Nuggets_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Chicken_Nuggets_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Chicken_Nuggets_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Chicken_Nuggets_Label.setText("Chicken Nuggets");

        Pepsi_Price32.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price32.setText("PKR 150");

        Chicken_Nuggets_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Chicken_Nuggets_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Chicken_Nuggets_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn38.setBackground(new java.awt.Color(0, 0, 128));
        add_btn38.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn38.setForeground(new java.awt.Color(255, 255, 255));
        add_btn38.setText("ADD");
        add_btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Chicken_Nuggets_PanelLayout = new javax.swing.GroupLayout(Chicken_Nuggets_Panel);
        Chicken_Nuggets_Panel.setLayout(Chicken_Nuggets_PanelLayout);
        Chicken_Nuggets_PanelLayout.setHorizontalGroup(
            Chicken_Nuggets_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Chicken_Nuggets_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Chicken_Nuggets_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Chicken_Nuggets_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Chicken_Nuggets_PanelLayout.createSequentialGroup()
                        .addComponent(Chicken_Nuggets_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Chicken_Nuggets_PanelLayout.createSequentialGroup()
                        .addComponent(Chicken_Nuggets_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Chicken_Nuggets_PanelLayout.setVerticalGroup(
            Chicken_Nuggets_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Chicken_Nuggets_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Chicken_Nuggets_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chicken_Nuggets_Label)
                    .addComponent(Pepsi_Price32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Chicken_Nuggets_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Chicken_Nuggets_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chicken_Nuggets_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Nachos_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Nachos_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Nachos_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Nachos_Label.setText("Nachos");

        Pepsi_Price33.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price33.setText("PKR 150");

        Nachos_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Nachos_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Nachos_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn39.setBackground(new java.awt.Color(0, 0, 128));
        add_btn39.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn39.setForeground(new java.awt.Color(255, 255, 255));
        add_btn39.setText("ADD");
        add_btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Nachos_PanelLayout = new javax.swing.GroupLayout(Nachos_Panel);
        Nachos_Panel.setLayout(Nachos_PanelLayout);
        Nachos_PanelLayout.setHorizontalGroup(
            Nachos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nachos_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Nachos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nachos_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Nachos_PanelLayout.createSequentialGroup()
                        .addComponent(Nachos_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price33))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Nachos_PanelLayout.createSequentialGroup()
                        .addComponent(Nachos_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Nachos_PanelLayout.setVerticalGroup(
            Nachos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nachos_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Nachos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nachos_Label)
                    .addComponent(Pepsi_Price33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nachos_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Nachos_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nachos_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Fast_Food_PanelLayout = new javax.swing.GroupLayout(Fast_Food_Panel);
        Fast_Food_Panel.setLayout(Fast_Food_PanelLayout);
        Fast_Food_PanelLayout.setHorizontalGroup(
            Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fast_Food_PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fast_Food_PanelLayout.createSequentialGroup()
                            .addComponent(Hot_Dogs_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Tacos_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(Nachos_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Chicken_Nuggets_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fast_Food_PanelLayout.createSequentialGroup()
                            .addComponent(Pizza_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Burgers_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(French_Fries_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Sandwiches_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Fast_Food_PanelLayout.setVerticalGroup(
            Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fast_Food_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fast_Food_PanelLayout.createSequentialGroup()
                        .addComponent(Pizza_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hot_Dogs_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fast_Food_PanelLayout.createSequentialGroup()
                        .addGroup(Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Burgers_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(French_Fries_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sandwiches_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(Fast_Food_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nachos_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tacos_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chicken_Nuggets_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Panel.add(Fast_Food_Panel, "card2");

        Snacks_Pannel.setBackground(new java.awt.Color(250, 250, 250));

        jLabel2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        jLabel2.setText("Snacks");

        Spring_Rolls_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Spring_Rolls_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Spring_Rolls_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Spring_Rolls_Label.setText("Spring Rolls");

        Pepsi_Price18.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price18.setText("PKR 150");

        Spring_Rolls_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Spring_Rolls_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Spring_Rolls_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn24.setBackground(new java.awt.Color(0, 0, 128));
        add_btn24.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn24.setForeground(new java.awt.Color(255, 255, 255));
        add_btn24.setText("ADD");
        add_btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Spring_Rolls_PanelLayout = new javax.swing.GroupLayout(Spring_Rolls_Panel);
        Spring_Rolls_Panel.setLayout(Spring_Rolls_PanelLayout);
        Spring_Rolls_PanelLayout.setHorizontalGroup(
            Spring_Rolls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Spring_Rolls_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Spring_Rolls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Spring_Rolls_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Spring_Rolls_PanelLayout.createSequentialGroup()
                        .addComponent(Spring_Rolls_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price18))
                    .addGroup(Spring_Rolls_PanelLayout.createSequentialGroup()
                        .addComponent(Spring_Rolls_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Spring_Rolls_PanelLayout.setVerticalGroup(
            Spring_Rolls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Spring_Rolls_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Spring_Rolls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spring_Rolls_Label)
                    .addComponent(Pepsi_Price18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Spring_Rolls_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Spring_Rolls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spring_Rolls_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Samosas_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Samosas_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Samosas_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Samosas_Label.setText("Samosas");

        Pepsi_Price19.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price19.setText("PKR 60");

        Samosas_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Samosas_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Samosas_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn25.setBackground(new java.awt.Color(0, 0, 128));
        add_btn25.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn25.setForeground(new java.awt.Color(255, 255, 255));
        add_btn25.setText("ADD");
        add_btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Samosas_PanelLayout = new javax.swing.GroupLayout(Samosas_Panel);
        Samosas_Panel.setLayout(Samosas_PanelLayout);
        Samosas_PanelLayout.setHorizontalGroup(
            Samosas_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Samosas_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Samosas_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Samosas_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Samosas_PanelLayout.createSequentialGroup()
                        .addComponent(Samosas_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Samosas_PanelLayout.createSequentialGroup()
                        .addComponent(Samosas_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Samosas_PanelLayout.setVerticalGroup(
            Samosas_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Samosas_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Samosas_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Samosas_Label)
                    .addComponent(Pepsi_Price19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Samosas_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Samosas_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Samosas_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Garlic_Bread_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Garlic_Bread_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Garlic_Bread_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Garlic_Bread_Label.setText("Garlic Bread");

        Pepsi_Price20.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price20.setText("PKR 210");

        Garlic_Bread_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Garlic_Bread_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Garlic_Bread_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn26.setBackground(new java.awt.Color(0, 0, 128));
        add_btn26.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn26.setForeground(new java.awt.Color(255, 255, 255));
        add_btn26.setText("ADD");
        add_btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Garlic_Bread_PanelLayout = new javax.swing.GroupLayout(Garlic_Bread_Panel);
        Garlic_Bread_Panel.setLayout(Garlic_Bread_PanelLayout);
        Garlic_Bread_PanelLayout.setHorizontalGroup(
            Garlic_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Garlic_Bread_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Garlic_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Garlic_Bread_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Garlic_Bread_PanelLayout.createSequentialGroup()
                        .addComponent(Garlic_Bread_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Garlic_Bread_PanelLayout.createSequentialGroup()
                        .addComponent(Garlic_Bread_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Garlic_Bread_PanelLayout.setVerticalGroup(
            Garlic_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Garlic_Bread_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Garlic_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Garlic_Bread_Label)
                    .addComponent(Pepsi_Price20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Garlic_Bread_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Garlic_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Garlic_Bread_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popcorn_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Popcorn_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Popcorn_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Popcorn_Label.setText("Popcorn");

        Pepsi_Price21.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price21.setText("PKR 445");

        Popcorn_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Popcorn_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Popcorn_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn27.setBackground(new java.awt.Color(0, 0, 128));
        add_btn27.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn27.setForeground(new java.awt.Color(255, 255, 255));
        add_btn27.setText("ADD");
        add_btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Popcorn_PanelLayout = new javax.swing.GroupLayout(Popcorn_Panel);
        Popcorn_Panel.setLayout(Popcorn_PanelLayout);
        Popcorn_PanelLayout.setHorizontalGroup(
            Popcorn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popcorn_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Popcorn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Popcorn_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Popcorn_PanelLayout.createSequentialGroup()
                        .addComponent(Popcorn_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price21))
                    .addGroup(Popcorn_PanelLayout.createSequentialGroup()
                        .addComponent(Popcorn_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Popcorn_PanelLayout.setVerticalGroup(
            Popcorn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Popcorn_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Popcorn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Popcorn_Label)
                    .addComponent(Pepsi_Price21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Popcorn_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Popcorn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Popcorn_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Onion_Rings_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Onion_Rings_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Onion_Rings_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Onion_Rings_Label.setText("Onion Rings");

        Pepsi_Price22.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price22.setText("PKR 450");

        Onion_Rings_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Onion_Rings_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Onion_Rings_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn28.setBackground(new java.awt.Color(0, 0, 128));
        add_btn28.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn28.setForeground(new java.awt.Color(255, 255, 255));
        add_btn28.setText("ADD");
        add_btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Onion_Rings_PanelLayout = new javax.swing.GroupLayout(Onion_Rings_Panel);
        Onion_Rings_Panel.setLayout(Onion_Rings_PanelLayout);
        Onion_Rings_PanelLayout.setHorizontalGroup(
            Onion_Rings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Onion_Rings_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Onion_Rings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Onion_Rings_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Onion_Rings_PanelLayout.createSequentialGroup()
                        .addComponent(Onion_Rings_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price22))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Onion_Rings_PanelLayout.createSequentialGroup()
                        .addComponent(Onion_Rings_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Onion_Rings_PanelLayout.setVerticalGroup(
            Onion_Rings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onion_Rings_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Onion_Rings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Onion_Rings_Label)
                    .addComponent(Pepsi_Price22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Onion_Rings_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Onion_Rings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Onion_Rings_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mozzarella_Sticks_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Mozzarella_Sticks_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Mozzarella_Sticks_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Mozzarella_Sticks_Label.setText("Mozzarella Sticks");

        Pepsi_Price23.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price23.setText("PKR 399");

        Mozzarella_Sticks_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Mozzarella_Sticks_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Mozzarella_Sticks_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn29.setBackground(new java.awt.Color(0, 0, 128));
        add_btn29.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn29.setForeground(new java.awt.Color(255, 255, 255));
        add_btn29.setText("ADD");
        add_btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Mozzarella_Sticks_PanelLayout = new javax.swing.GroupLayout(Mozzarella_Sticks_Panel);
        Mozzarella_Sticks_Panel.setLayout(Mozzarella_Sticks_PanelLayout);
        Mozzarella_Sticks_PanelLayout.setHorizontalGroup(
            Mozzarella_Sticks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mozzarella_Sticks_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Mozzarella_Sticks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mozzarella_Sticks_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Mozzarella_Sticks_PanelLayout.createSequentialGroup()
                        .addComponent(Mozzarella_Sticks_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Mozzarella_Sticks_PanelLayout.createSequentialGroup()
                        .addComponent(Mozzarella_Sticks_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Mozzarella_Sticks_PanelLayout.setVerticalGroup(
            Mozzarella_Sticks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mozzarella_Sticks_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Mozzarella_Sticks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mozzarella_Sticks_Label)
                    .addComponent(Pepsi_Price23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mozzarella_Sticks_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Mozzarella_Sticks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mozzarella_Sticks_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Chips_Salsa_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Chips_Salsa_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Chips_Salsa_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Chips_Salsa_Label.setText("Chips & Salsa");

        Pepsi_Price24.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price24.setText("PKR 470");

        Chips_Salsa_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Chips_Salsa_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Chips_Salsa_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn30.setBackground(new java.awt.Color(0, 0, 128));
        add_btn30.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn30.setForeground(new java.awt.Color(255, 255, 255));
        add_btn30.setText("ADD");
        add_btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Chips_Salsa_PanelLayout = new javax.swing.GroupLayout(Chips_Salsa_Panel);
        Chips_Salsa_Panel.setLayout(Chips_Salsa_PanelLayout);
        Chips_Salsa_PanelLayout.setHorizontalGroup(
            Chips_Salsa_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Chips_Salsa_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Chips_Salsa_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Chips_Salsa_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Chips_Salsa_PanelLayout.createSequentialGroup()
                        .addComponent(Chips_Salsa_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price24))
                    .addGroup(Chips_Salsa_PanelLayout.createSequentialGroup()
                        .addComponent(Chips_Salsa_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Chips_Salsa_PanelLayout.setVerticalGroup(
            Chips_Salsa_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Chips_Salsa_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Chips_Salsa_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chips_Salsa_Label)
                    .addComponent(Pepsi_Price24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Chips_Salsa_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Chips_Salsa_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chips_Salsa_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pretzelsn_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Pretzelsn_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Pretzels_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pretzels_Label.setText("Pretzels");

        Pepsi_Price25.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price25.setText("PKR 690");

        Pretzels_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pretzels_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Pretzels_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn31.setBackground(new java.awt.Color(0, 0, 128));
        add_btn31.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn31.setForeground(new java.awt.Color(255, 255, 255));
        add_btn31.setText("ADD");
        add_btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pretzelsn_PanelLayout = new javax.swing.GroupLayout(Pretzelsn_Panel);
        Pretzelsn_Panel.setLayout(Pretzelsn_PanelLayout);
        Pretzelsn_PanelLayout.setHorizontalGroup(
            Pretzelsn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pretzelsn_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pretzelsn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pretzels_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pretzelsn_PanelLayout.createSequentialGroup()
                        .addComponent(Pretzels_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pretzelsn_PanelLayout.createSequentialGroup()
                        .addComponent(Pretzels_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Pretzelsn_PanelLayout.setVerticalGroup(
            Pretzelsn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pretzelsn_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Pretzelsn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pretzels_Label)
                    .addComponent(Pepsi_Price25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pretzels_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pretzelsn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pretzels_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Snacks_PannelLayout = new javax.swing.GroupLayout(Snacks_Pannel);
        Snacks_Pannel.setLayout(Snacks_PannelLayout);
        Snacks_PannelLayout.setHorizontalGroup(
            Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Snacks_PannelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Snacks_PannelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Snacks_PannelLayout.createSequentialGroup()
                        .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Spring_Rolls_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Popcorn_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Mozzarella_Sticks_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Samosas_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Snacks_PannelLayout.createSequentialGroup()
                                .addComponent(Garlic_Bread_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(Snacks_PannelLayout.createSequentialGroup()
                                .addComponent(Chips_Salsa_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Onion_Rings_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pretzelsn_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(10, Short.MAX_VALUE))))
        );
        Snacks_PannelLayout.setVerticalGroup(
            Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Snacks_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Spring_Rolls_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Samosas_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Garlic_Bread_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Onion_Rings_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Snacks_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mozzarella_Sticks_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(Popcorn_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(Chips_Salsa_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(Pretzelsn_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        Menu_Panel.add(Snacks_Pannel, "card3");

        Main_Course_Panel.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        jLabel3.setText("Main Course");

        Pasta_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Pasta_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Pasta_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pasta_Label.setText("Pasta");

        Pepsi_Price10.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price10.setText("PKR 280");

        Pasta_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pasta_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Pasta_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn16.setBackground(new java.awt.Color(0, 0, 128));
        add_btn16.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn16.setForeground(new java.awt.Color(255, 255, 255));
        add_btn16.setText("ADD");
        add_btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pasta_PanelLayout = new javax.swing.GroupLayout(Pasta_Panel);
        Pasta_Panel.setLayout(Pasta_PanelLayout);
        Pasta_PanelLayout.setHorizontalGroup(
            Pasta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pasta_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pasta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pasta_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pasta_PanelLayout.createSequentialGroup()
                        .addComponent(Pasta_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pasta_PanelLayout.createSequentialGroup()
                        .addComponent(Pasta_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Pasta_PanelLayout.setVerticalGroup(
            Pasta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pasta_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Pasta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pasta_Label)
                    .addComponent(Pepsi_Price10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pasta_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pasta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pasta_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Steaks_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Steaks_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Steaks_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Steaks_Label.setText("Steaks");

        Pepsi_Price11.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price11.setText("PKR 1300");

        Steaks_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Steaks_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Steaks_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn17.setBackground(new java.awt.Color(0, 0, 128));
        add_btn17.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn17.setForeground(new java.awt.Color(255, 255, 255));
        add_btn17.setText("ADD");
        add_btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Steaks_PanelLayout = new javax.swing.GroupLayout(Steaks_Panel);
        Steaks_Panel.setLayout(Steaks_PanelLayout);
        Steaks_PanelLayout.setHorizontalGroup(
            Steaks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Steaks_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Steaks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Steaks_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Steaks_PanelLayout.createSequentialGroup()
                        .addComponent(Steaks_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Steaks_PanelLayout.createSequentialGroup()
                        .addComponent(Steaks_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Steaks_PanelLayout.setVerticalGroup(
            Steaks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Steaks_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Steaks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Steaks_Label)
                    .addComponent(Pepsi_Price11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Steaks_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Steaks_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Steaks_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rice_Bowls_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Rice_Bowls_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Rice_Bowls_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Rice_Bowls_Label.setText("Rice Bowls");

        Pepsi_Price12.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price12.setText("PKR 720");

        Rice_Bowls_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Rice_Bowls_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Rice_Bowls_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn18.setBackground(new java.awt.Color(0, 0, 128));
        add_btn18.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn18.setForeground(new java.awt.Color(255, 255, 255));
        add_btn18.setText("ADD");
        add_btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Rice_Bowls_PanelLayout = new javax.swing.GroupLayout(Rice_Bowls_Panel);
        Rice_Bowls_Panel.setLayout(Rice_Bowls_PanelLayout);
        Rice_Bowls_PanelLayout.setHorizontalGroup(
            Rice_Bowls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Rice_Bowls_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Rice_Bowls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rice_Bowls_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Rice_Bowls_PanelLayout.createSequentialGroup()
                        .addComponent(Rice_Bowls_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Rice_Bowls_PanelLayout.createSequentialGroup()
                        .addComponent(Rice_Bowls_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Rice_Bowls_PanelLayout.setVerticalGroup(
            Rice_Bowls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rice_Bowls_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Rice_Bowls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rice_Bowls_Label)
                    .addComponent(Pepsi_Price12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rice_Bowls_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Rice_Bowls_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rice_Bowls_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Grilled_Chicken_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Grilled_Chicken_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Grilled_Chicken_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Grilled_Chicken_Label.setText("Grilled Chicken");

        Pepsi_Price13.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price13.setText("PKR 1440");

        Grilled_Chicken_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Grilled_Chicken_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Grilled_Chicken_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn19.setBackground(new java.awt.Color(0, 0, 128));
        add_btn19.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn19.setForeground(new java.awt.Color(255, 255, 255));
        add_btn19.setText("ADD");
        add_btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Grilled_Chicken_PanelLayout = new javax.swing.GroupLayout(Grilled_Chicken_Panel);
        Grilled_Chicken_Panel.setLayout(Grilled_Chicken_PanelLayout);
        Grilled_Chicken_PanelLayout.setHorizontalGroup(
            Grilled_Chicken_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Grilled_Chicken_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Grilled_Chicken_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Grilled_Chicken_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Grilled_Chicken_PanelLayout.createSequentialGroup()
                        .addComponent(Grilled_Chicken_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Grilled_Chicken_PanelLayout.createSequentialGroup()
                        .addComponent(Grilled_Chicken_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Grilled_Chicken_PanelLayout.setVerticalGroup(
            Grilled_Chicken_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Grilled_Chicken_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Grilled_Chicken_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Grilled_Chicken_Label)
                    .addComponent(Pepsi_Price13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Grilled_Chicken_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Grilled_Chicken_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Grilled_Chicken_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Seafood_Platter_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Seafood_Platter_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Seafood_Platter_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Seafood_Platter_Label.setText("Seafood Platter");

        Pepsi_Price14.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price14.setText("PKR 2995");

        Seafood_Platter_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Seafood_Platter_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Seafood_Platter_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn20.setBackground(new java.awt.Color(0, 0, 128));
        add_btn20.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn20.setForeground(new java.awt.Color(255, 255, 255));
        add_btn20.setText("ADD");
        add_btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Seafood_Platter_PanelLayout = new javax.swing.GroupLayout(Seafood_Platter_Panel);
        Seafood_Platter_Panel.setLayout(Seafood_Platter_PanelLayout);
        Seafood_Platter_PanelLayout.setHorizontalGroup(
            Seafood_Platter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Seafood_Platter_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Seafood_Platter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Seafood_Platter_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Seafood_Platter_PanelLayout.createSequentialGroup()
                        .addComponent(Seafood_Platter_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Seafood_Platter_PanelLayout.createSequentialGroup()
                        .addComponent(Seafood_Platter_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Seafood_Platter_PanelLayout.setVerticalGroup(
            Seafood_Platter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Seafood_Platter_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Seafood_Platter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seafood_Platter_Label)
                    .addComponent(Pepsi_Price14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seafood_Platter_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Seafood_Platter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seafood_Platter_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Soup_Bread_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Soup_Bread_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Soup_Bread_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Soup_Bread_Label.setText("Soup & Bread");

        Pepsi_Price15.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price15.setText("PKR 899");

        Soup_Bread_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Soup_Bread_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Soup_Bread_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn21.setBackground(new java.awt.Color(0, 0, 128));
        add_btn21.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn21.setForeground(new java.awt.Color(255, 255, 255));
        add_btn21.setText("ADD");
        add_btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Soup_Bread_PanelLayout = new javax.swing.GroupLayout(Soup_Bread_Panel);
        Soup_Bread_Panel.setLayout(Soup_Bread_PanelLayout);
        Soup_Bread_PanelLayout.setHorizontalGroup(
            Soup_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Soup_Bread_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Soup_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Soup_Bread_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Soup_Bread_PanelLayout.createSequentialGroup()
                        .addComponent(Soup_Bread_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Soup_Bread_PanelLayout.createSequentialGroup()
                        .addComponent(Soup_Bread_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Soup_Bread_PanelLayout.setVerticalGroup(
            Soup_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Soup_Bread_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Soup_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Soup_Bread_Label)
                    .addComponent(Pepsi_Price15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Soup_Bread_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Soup_Bread_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Soup_Bread_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Stir_Fried_Noodles_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Stir_Fried_Noodles_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Stir_Fried_Noodles_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Stir_Fried_Noodles_Label.setText("Stir-Fried Noodles");

        Pepsi_Price16.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price16.setText("PKR 670");

        Stir_Fried_Noodles_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Stir_Fried_Noodles_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Stir_Fried_Noodles_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn22.setBackground(new java.awt.Color(0, 0, 128));
        add_btn22.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn22.setForeground(new java.awt.Color(255, 255, 255));
        add_btn22.setText("ADD");
        add_btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stir_Fried_Noodles_PanelLayout = new javax.swing.GroupLayout(Stir_Fried_Noodles_Panel);
        Stir_Fried_Noodles_Panel.setLayout(Stir_Fried_Noodles_PanelLayout);
        Stir_Fried_Noodles_PanelLayout.setHorizontalGroup(
            Stir_Fried_Noodles_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Stir_Fried_Noodles_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Stir_Fried_Noodles_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Stir_Fried_Noodles_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Stir_Fried_Noodles_PanelLayout.createSequentialGroup()
                        .addComponent(Stir_Fried_Noodles_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Stir_Fried_Noodles_PanelLayout.createSequentialGroup()
                        .addComponent(Stir_Fried_Noodles_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Stir_Fried_Noodles_PanelLayout.setVerticalGroup(
            Stir_Fried_Noodles_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stir_Fried_Noodles_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Stir_Fried_Noodles_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stir_Fried_Noodles_Label)
                    .addComponent(Pepsi_Price16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stir_Fried_Noodles_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Stir_Fried_Noodles_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stir_Fried_Noodles_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Roast_Beef_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Roast_Beef_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Roast_Beef_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Roast_Beef_Label.setText("Roast Beef");

        Pepsi_Price17.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price17.setText("PKR 1520");

        Roast_Beef_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Roast_Beef_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Roast_Beef_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn23.setBackground(new java.awt.Color(0, 0, 128));
        add_btn23.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn23.setForeground(new java.awt.Color(255, 255, 255));
        add_btn23.setText("ADD");
        add_btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Roast_Beef_PanelLayout = new javax.swing.GroupLayout(Roast_Beef_Panel);
        Roast_Beef_Panel.setLayout(Roast_Beef_PanelLayout);
        Roast_Beef_PanelLayout.setHorizontalGroup(
            Roast_Beef_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Roast_Beef_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Roast_Beef_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Roast_Beef_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Roast_Beef_PanelLayout.createSequentialGroup()
                        .addComponent(Roast_Beef_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Roast_Beef_PanelLayout.createSequentialGroup()
                        .addComponent(Roast_Beef_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Roast_Beef_PanelLayout.setVerticalGroup(
            Roast_Beef_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Roast_Beef_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Roast_Beef_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Roast_Beef_Label)
                    .addComponent(Pepsi_Price17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Roast_Beef_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Roast_Beef_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Roast_Beef_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Main_Course_PanelLayout = new javax.swing.GroupLayout(Main_Course_Panel);
        Main_Course_Panel.setLayout(Main_Course_PanelLayout);
        Main_Course_PanelLayout.setHorizontalGroup(
            Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                .addGroup(Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                        .addGroup(Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Pasta_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_Course_PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Seafood_Platter_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                                .addComponent(Soup_Bread_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Stir_Fried_Noodles_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                                .addComponent(Steaks_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Grilled_Chicken_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Roast_Beef_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rice_Bowls_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        Main_Course_PanelLayout.setVerticalGroup(
            Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_Course_PanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pasta_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Steaks_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Grilled_Chicken_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rice_Bowls_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Main_Course_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Soup_Bread_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stir_Fried_Noodles_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Roast_Beef_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Seafood_Platter_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        Menu_Panel.add(Main_Course_Panel, "card4");

        Dessert_Panel.setBackground(new java.awt.Color(250, 250, 250));

        jLabel4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        jLabel4.setText("Desserts");

        cupCake_Panel.setBackground(new java.awt.Color(250, 250, 250));
        cupCake_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Waffles_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Waffles_Label.setText("Waffles");

        Pepsi_Price2.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price2.setText("PKR 499");

        Waffles_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Waffles_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Waffles_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn8.setBackground(new java.awt.Color(0, 0, 128));
        add_btn8.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn8.setForeground(new java.awt.Color(255, 255, 255));
        add_btn8.setText("ADD");
        add_btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cupCake_PanelLayout = new javax.swing.GroupLayout(cupCake_Panel);
        cupCake_Panel.setLayout(cupCake_PanelLayout);
        cupCake_PanelLayout.setHorizontalGroup(
            cupCake_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cupCake_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cupCake_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Waffles_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cupCake_PanelLayout.createSequentialGroup()
                        .addComponent(Waffles_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cupCake_PanelLayout.createSequentialGroup()
                        .addComponent(Waffles_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cupCake_PanelLayout.setVerticalGroup(
            cupCake_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupCake_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cupCake_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Waffles_Label)
                    .addComponent(Pepsi_Price2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Waffles_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cupCake_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Waffles_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cakeSlice_panel.setBackground(new java.awt.Color(250, 250, 250));
        cakeSlice_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Cake_Slice_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Cake_Slice_Label.setText("Cake Slice");

        Pepsi_Price3.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price3.setText("PKR 35000");

        Cake_Slice_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Cake_Slice_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Cake_Slice_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn9.setBackground(new java.awt.Color(0, 0, 128));
        add_btn9.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn9.setForeground(new java.awt.Color(255, 255, 255));
        add_btn9.setText("ADD");
        add_btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cakeSlice_panelLayout = new javax.swing.GroupLayout(cakeSlice_panel);
        cakeSlice_panel.setLayout(cakeSlice_panelLayout);
        cakeSlice_panelLayout.setHorizontalGroup(
            cakeSlice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cakeSlice_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cakeSlice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cakeSlice_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cakeSlice_panelLayout.createSequentialGroup()
                        .addComponent(Cake_Slice_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cakeSlice_panelLayout.createSequentialGroup()
                        .addComponent(Cake_Slice_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cakeSlice_panelLayout.setVerticalGroup(
            cakeSlice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cakeSlice_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cakeSlice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cake_Slice_Label)
                    .addComponent(Pepsi_Price3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cakeSlice_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cakeSlice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cake_Slice_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Browmies_panel.setBackground(new java.awt.Color(250, 250, 250));
        Browmies_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Brownies_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Brownies_Label.setText("Brownies");

        Pepsi_Price4.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price4.setText("PKR 220");

        Brownies_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Brownies_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Brownies_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn10.setBackground(new java.awt.Color(0, 0, 128));
        add_btn10.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn10.setForeground(new java.awt.Color(255, 255, 255));
        add_btn10.setText("ADD");
        add_btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Browmies_panelLayout = new javax.swing.GroupLayout(Browmies_panel);
        Browmies_panel.setLayout(Browmies_panelLayout);
        Browmies_panelLayout.setHorizontalGroup(
            Browmies_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Browmies_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Browmies_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Brownies_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Browmies_panelLayout.createSequentialGroup()
                        .addComponent(Brownies_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Browmies_panelLayout.createSequentialGroup()
                        .addComponent(Brownies_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(add_btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Browmies_panelLayout.setVerticalGroup(
            Browmies_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Browmies_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Browmies_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brownies_Label)
                    .addComponent(Pepsi_Price4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(Brownies_img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Browmies_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brownies_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        Cheesecake_panel.setBackground(new java.awt.Color(250, 250, 250));
        Cheesecake_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Cheese_cake_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Cheese_cake_Label.setText("Cheese cake");

        Pepsi_Price5.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price5.setText("PKR 799");

        Cheese_cake_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Cheese_cake_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Cheese_cake_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn11.setBackground(new java.awt.Color(0, 0, 128));
        add_btn11.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn11.setForeground(new java.awt.Color(255, 255, 255));
        add_btn11.setText("ADD");
        add_btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cheesecake_panelLayout = new javax.swing.GroupLayout(Cheesecake_panel);
        Cheesecake_panel.setLayout(Cheesecake_panelLayout);
        Cheesecake_panelLayout.setHorizontalGroup(
            Cheesecake_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cheesecake_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cheesecake_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cheesecake_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Cheesecake_panelLayout.createSequentialGroup()
                        .addComponent(Cheese_cake_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Cheesecake_panelLayout.createSequentialGroup()
                        .addComponent(Cheese_cake_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Cheesecake_panelLayout.setVerticalGroup(
            Cheesecake_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cheesecake_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cheesecake_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cheese_cake_Label)
                    .addComponent(Pepsi_Price5))
                .addGap(3, 3, 3)
                .addComponent(Cheesecake_img, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cheesecake_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cheese_cake_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        IceCream_Panel1.setBackground(new java.awt.Color(250, 250, 250));
        IceCream_Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Ice_Cream_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Ice_Cream_Label.setText("Ice Cream");

        Pepsi_Price6.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price6.setText("PKR 250");

        Ice_Cream_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Ice_Cream_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Ice_Cream_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn12.setBackground(new java.awt.Color(0, 0, 128));
        add_btn12.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn12.setForeground(new java.awt.Color(255, 255, 255));
        add_btn12.setText("ADD");
        add_btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IceCream_Panel1Layout = new javax.swing.GroupLayout(IceCream_Panel1);
        IceCream_Panel1.setLayout(IceCream_Panel1Layout);
        IceCream_Panel1Layout.setHorizontalGroup(
            IceCream_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IceCream_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IceCream_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iceCream_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(IceCream_Panel1Layout.createSequentialGroup()
                        .addComponent(Ice_Cream_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price6))
                    .addGroup(IceCream_Panel1Layout.createSequentialGroup()
                        .addComponent(Ice_Cream_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        IceCream_Panel1Layout.setVerticalGroup(
            IceCream_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IceCream_Panel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(IceCream_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ice_Cream_Label)
                    .addComponent(Pepsi_Price6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iceCream_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IceCream_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ice_Cream_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cupCake_Panel1.setBackground(new java.awt.Color(250, 250, 250));
        cupCake_Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Cup_cake_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Cup_cake_Label.setText("Cup cake");

        Pepsi_Price7.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price7.setText("PKR 250");

        Cup_cake_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Cup_cake_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Cup_cake_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn13.setBackground(new java.awt.Color(0, 0, 128));
        add_btn13.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn13.setForeground(new java.awt.Color(255, 255, 255));
        add_btn13.setText("ADD");
        add_btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cupCake_Panel1Layout = new javax.swing.GroupLayout(cupCake_Panel1);
        cupCake_Panel1.setLayout(cupCake_Panel1Layout);
        cupCake_Panel1Layout.setHorizontalGroup(
            cupCake_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cupCake_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cupCake_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cupCake_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cupCake_Panel1Layout.createSequentialGroup()
                        .addComponent(Cup_cake_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cupCake_Panel1Layout.createSequentialGroup()
                        .addComponent(Cup_cake_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cupCake_Panel1Layout.setVerticalGroup(
            cupCake_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupCake_Panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cupCake_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cup_cake_Label)
                    .addComponent(Pepsi_Price7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cupCake_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cupCake_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cup_cake_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Donuts_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Donuts_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Donuts_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Donuts_Label.setText("Donuts");

        Pepsi_Price8.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price8.setText("PKR 220");

        Donuts_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Donuts_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Donuts_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn14.setBackground(new java.awt.Color(0, 0, 128));
        add_btn14.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn14.setForeground(new java.awt.Color(255, 255, 255));
        add_btn14.setText("ADD");
        add_btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Donuts_PanelLayout = new javax.swing.GroupLayout(Donuts_Panel);
        Donuts_Panel.setLayout(Donuts_PanelLayout);
        Donuts_PanelLayout.setHorizontalGroup(
            Donuts_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Donuts_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Donuts_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Donuts_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Donuts_PanelLayout.createSequentialGroup()
                        .addComponent(Donuts_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Donuts_PanelLayout.createSequentialGroup()
                        .addComponent(Donuts_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Donuts_PanelLayout.setVerticalGroup(
            Donuts_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Donuts_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Donuts_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Donuts_Label)
                    .addComponent(Pepsi_Price8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Donuts_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Donuts_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Donuts_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cupCake_Panel3.setBackground(new java.awt.Color(250, 250, 250));
        cupCake_Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Pudding_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pudding_Label.setText("Pudding");

        Pepsi_Price9.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price9.setText("PKR 160");

        Pudding_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pudding_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Pudding_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn15.setBackground(new java.awt.Color(0, 0, 128));
        add_btn15.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn15.setForeground(new java.awt.Color(255, 255, 255));
        add_btn15.setText("ADD");
        add_btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cupCake_Panel3Layout = new javax.swing.GroupLayout(cupCake_Panel3);
        cupCake_Panel3.setLayout(cupCake_Panel3Layout);
        cupCake_Panel3Layout.setHorizontalGroup(
            cupCake_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupCake_Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cupCake_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pudding_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cupCake_Panel3Layout.createSequentialGroup()
                        .addComponent(Pudding_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price9))
                    .addGroup(cupCake_Panel3Layout.createSequentialGroup()
                        .addComponent(Pudding_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cupCake_Panel3Layout.setVerticalGroup(
            cupCake_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cupCake_Panel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(cupCake_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pudding_Label)
                    .addComponent(Pepsi_Price9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pudding_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cupCake_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pudding_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout Dessert_PanelLayout = new javax.swing.GroupLayout(Dessert_Panel);
        Dessert_Panel.setLayout(Dessert_PanelLayout);
        Dessert_PanelLayout.setHorizontalGroup(
            Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dessert_PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(Dessert_PanelLayout.createSequentialGroup()
                        .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IceCream_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cupCake_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cakeSlice_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cupCake_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Browmies_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Donuts_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cupCake_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cheesecake_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        Dessert_PanelLayout.setVerticalGroup(
            Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dessert_PanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dessert_PanelLayout.createSequentialGroup()
                        .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cheesecake_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Browmies_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IceCream_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cupCake_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cupCake_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Dessert_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cupCake_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Donuts_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cakeSlice_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Menu_Panel.add(Dessert_Panel, "card5");

        Bevarages_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Bevarages_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Bevarages_Title.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        Bevarages_Title.setText("Bevarages");

        up_Panel.setBackground(new java.awt.Color(250, 250, 250));
        up_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Pepsi_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Label.setText("Pepsi");

        up_price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        up_price.setText("PKR 150");

        Pepsi_Label_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Label_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        Pepsi_add_btn.setBackground(new java.awt.Color(0, 0, 128));
        Pepsi_add_btn.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Pepsi_add_btn.setForeground(new java.awt.Color(255, 255, 255));
        Pepsi_add_btn.setText("ADD");
        Pepsi_add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pepsi_add_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout up_PanelLayout = new javax.swing.GroupLayout(up_Panel);
        up_Panel.setLayout(up_PanelLayout);
        up_PanelLayout.setHorizontalGroup(
            up_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, up_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(up_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(up_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, up_PanelLayout.createSequentialGroup()
                        .addComponent(Pepsi_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(up_price))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, up_PanelLayout.createSequentialGroup()
                        .addComponent(Pepsi_Label_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Pepsi_add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        up_PanelLayout.setVerticalGroup(
            up_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(up_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(up_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pepsi_Label)
                    .addComponent(up_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(up_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(up_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pepsi_Label_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pepsi_add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pepsi_Panel1.setBackground(new java.awt.Color(250, 250, 250));
        Pepsi_Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        up_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        up_Label.setText("7up");

        Pepsi_Price1.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Pepsi_Price1.setText("PKR 150");

        up_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        up_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        up_jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        add_btn1.setBackground(new java.awt.Color(0, 0, 128));
        add_btn1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn1.setForeground(new java.awt.Color(255, 255, 255));
        add_btn1.setText("ADD");
        add_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pepsi_Panel1Layout = new javax.swing.GroupLayout(Pepsi_Panel1);
        Pepsi_Panel1.setLayout(Pepsi_Panel1Layout);
        Pepsi_Panel1Layout.setHorizontalGroup(
            Pepsi_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pepsi_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pepsi_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pepsi_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pepsi_Panel1Layout.createSequentialGroup()
                        .addComponent(up_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pepsi_Price1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pepsi_Panel1Layout.createSequentialGroup()
                        .addComponent(up_jSpinner)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Pepsi_Panel1Layout.setVerticalGroup(
            Pepsi_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pepsi_Panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Pepsi_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(up_Label)
                    .addComponent(Pepsi_Price1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pepsi_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pepsi_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(up_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cola_Panel2.setBackground(new java.awt.Color(250, 250, 250));
        cola_Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Big_apple_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Big_apple_Label.setText("Big Apple");

        cola_Price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        cola_Price.setText("PKR 150");

        Big_apple_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Big_apple_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        add_btn2.setBackground(new java.awt.Color(0, 0, 128));
        add_btn2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn2.setForeground(new java.awt.Color(255, 255, 255));
        add_btn2.setText("ADD");
        add_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cola_Panel2Layout = new javax.swing.GroupLayout(cola_Panel2);
        cola_Panel2.setLayout(cola_Panel2Layout);
        cola_Panel2Layout.setHorizontalGroup(
            cola_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cola_Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cola_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cola_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cola_Panel2Layout.createSequentialGroup()
                        .addComponent(Big_apple_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cola_Price))
                    .addGroup(cola_Panel2Layout.createSequentialGroup()
                        .addComponent(Big_apple_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cola_Panel2Layout.setVerticalGroup(
            cola_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cola_Panel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cola_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Big_apple_Label)
                    .addComponent(cola_Price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cola_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cola_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Big_apple_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sprite_Panel.setBackground(new java.awt.Color(250, 250, 250));
        sprite_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        cola_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        cola_Label.setText("Coca Cola");

        sprite_price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        sprite_price.setText("PKR 150");

        cola_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        cola_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        add_btn3.setBackground(new java.awt.Color(0, 0, 128));
        add_btn3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn3.setForeground(new java.awt.Color(255, 255, 255));
        add_btn3.setText("ADD");
        add_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sprite_PanelLayout = new javax.swing.GroupLayout(sprite_Panel);
        sprite_Panel.setLayout(sprite_PanelLayout);
        sprite_PanelLayout.setHorizontalGroup(
            sprite_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sprite_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sprite_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprite_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sprite_PanelLayout.createSequentialGroup()
                        .addComponent(cola_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sprite_price))
                    .addGroup(sprite_PanelLayout.createSequentialGroup()
                        .addComponent(cola_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        sprite_PanelLayout.setVerticalGroup(
            sprite_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sprite_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(sprite_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cola_Label)
                    .addComponent(sprite_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprite_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sprite_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cola_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fizzup_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Fizzup_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Sprite_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Sprite_Label.setText("Sprite");

        Fizzup_price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fizzup_price.setText("PKR 150");

        Sprite_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Sprite_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        add_btn4.setBackground(new java.awt.Color(0, 0, 128));
        add_btn4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn4.setForeground(new java.awt.Color(255, 255, 255));
        add_btn4.setText("ADD");
        add_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fizzup_PanelLayout = new javax.swing.GroupLayout(Fizzup_Panel);
        Fizzup_Panel.setLayout(Fizzup_PanelLayout);
        Fizzup_PanelLayout.setHorizontalGroup(
            Fizzup_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fizzup_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fizzup_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fizzup_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Fizzup_PanelLayout.createSequentialGroup()
                        .addComponent(Sprite_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fizzup_price))
                    .addGroup(Fizzup_PanelLayout.createSequentialGroup()
                        .addComponent(Sprite_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Fizzup_PanelLayout.setVerticalGroup(
            Fizzup_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fizzup_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Fizzup_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sprite_Label)
                    .addComponent(Fizzup_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fizzup_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Fizzup_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sprite_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kola_Panel.setBackground(new java.awt.Color(250, 250, 250));
        kola_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        kola_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        kola_Label.setText("Kola Next");

        kola_price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        kola_price.setText("PKR 150");

        kola_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        kola_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        add_btn5.setBackground(new java.awt.Color(0, 0, 128));
        add_btn5.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn5.setForeground(new java.awt.Color(255, 255, 255));
        add_btn5.setText("ADD");
        add_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kola_PanelLayout = new javax.swing.GroupLayout(kola_Panel);
        kola_Panel.setLayout(kola_PanelLayout);
        kola_PanelLayout.setHorizontalGroup(
            kola_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kola_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kola_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kola_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kola_PanelLayout.createSequentialGroup()
                        .addComponent(kola_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kola_price))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kola_PanelLayout.createSequentialGroup()
                        .addComponent(kola_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        kola_PanelLayout.setVerticalGroup(
            kola_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kola_PanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kola_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kola_Label)
                    .addComponent(kola_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kola_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kola_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kola_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Big_Apple_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Big_Apple_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Fizzup_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fizzup_Label.setText("Fizz Up");

        Big_apple_price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Big_apple_price.setText("PKR 150");

        Fizzup_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fizzup_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        add_btn6.setBackground(new java.awt.Color(0, 0, 128));
        add_btn6.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn6.setForeground(new java.awt.Color(255, 255, 255));
        add_btn6.setText("ADD");
        add_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Big_Apple_PanelLayout = new javax.swing.GroupLayout(Big_Apple_Panel);
        Big_Apple_Panel.setLayout(Big_Apple_PanelLayout);
        Big_Apple_PanelLayout.setHorizontalGroup(
            Big_Apple_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Big_Apple_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Big_Apple_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Big_apple_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Big_Apple_PanelLayout.createSequentialGroup()
                        .addComponent(Fizzup_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Big_apple_price))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Big_Apple_PanelLayout.createSequentialGroup()
                        .addComponent(Fizzup_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Big_Apple_PanelLayout.setVerticalGroup(
            Big_Apple_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Big_Apple_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Big_Apple_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fizzup_Label)
                    .addComponent(Big_apple_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Big_apple_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Big_Apple_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fizzup_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fanta_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Fanta_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        Fanta_Label.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fanta_Label.setText("Fanta");

        Fanta_price.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fanta_price.setText("PKR 150");

        Fanta_jSpinner.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Fanta_jSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        add_btn7.setBackground(new java.awt.Color(0, 0, 128));
        add_btn7.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        add_btn7.setForeground(new java.awt.Color(255, 255, 255));
        add_btn7.setText("ADD");
        add_btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fanta_PanelLayout = new javax.swing.GroupLayout(Fanta_Panel);
        Fanta_Panel.setLayout(Fanta_PanelLayout);
        Fanta_PanelLayout.setHorizontalGroup(
            Fanta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fanta_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Fanta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fanta_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fanta_PanelLayout.createSequentialGroup()
                        .addComponent(Fanta_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fanta_price))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Fanta_PanelLayout.createSequentialGroup()
                        .addComponent(Fanta_jSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Fanta_PanelLayout.setVerticalGroup(
            Fanta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fanta_PanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Fanta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fanta_Label)
                    .addComponent(Fanta_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fanta_img, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Fanta_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fanta_jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Bevarages_PanelLayout = new javax.swing.GroupLayout(Bevarages_Panel);
        Bevarages_Panel.setLayout(Bevarages_PanelLayout);
        Bevarages_PanelLayout.setHorizontalGroup(
            Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bevarages_PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bevarages_Title)
                    .addGroup(Bevarages_PanelLayout.createSequentialGroup()
                        .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Fanta_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pepsi_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Bevarages_PanelLayout.createSequentialGroup()
                                .addComponent(up_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cola_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sprite_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Bevarages_PanelLayout.createSequentialGroup()
                                .addComponent(Big_Apple_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kola_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fizzup_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(4, 25, Short.MAX_VALUE))
        );
        Bevarages_PanelLayout.setVerticalGroup(
            Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bevarages_PanelLayout.createSequentialGroup()
                .addComponent(Bevarages_Title)
                .addGap(12, 12, 12)
                .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprite_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Pepsi_Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cola_Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(up_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fanta_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Big_Apple_Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Bevarages_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fizzup_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kola_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Panel.add(Bevarages_Panel, "card6");

        Functional_btn.setBackground(new java.awt.Color(250, 250, 250));

        receipt_Button.setBackground(new java.awt.Color(0, 255, 204));
        receipt_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        receipt_Button.setForeground(new java.awt.Color(255, 255, 255));
        receipt_Button.setText("Receipt");
        receipt_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_ButtonActionPerformed(evt);
            }
        });

        reset_Button.setBackground(new java.awt.Color(51, 51, 255));
        reset_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        reset_Button.setForeground(new java.awt.Color(255, 255, 255));
        reset_Button.setText("Reset");
        reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_ButtonActionPerformed(evt);
            }
        });

        exit_Button.setBackground(new java.awt.Color(255, 51, 51));
        exit_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        exit_Button.setForeground(new java.awt.Color(255, 255, 255));
        exit_Button.setText("Exit");
        exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ButtonActionPerformed(evt);
            }
        });

        total_Button.setBackground(new java.awt.Color(0, 102, 51));
        total_Button.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        total_Button.setForeground(new java.awt.Color(255, 255, 255));
        total_Button.setText("Total");
        total_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Functional_btnLayout = new javax.swing.GroupLayout(Functional_btn);
        Functional_btn.setLayout(Functional_btnLayout);
        Functional_btnLayout.setHorizontalGroup(
            Functional_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Functional_btnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(total_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receipt_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Functional_btnLayout.setVerticalGroup(
            Functional_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Functional_btnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Functional_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receipt_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        Receipt_Panel.setBackground(new java.awt.Color(250, 250, 250));
        Receipt_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Receipt_extArea.setEditable(false);
        Receipt_extArea.setColumns(20);
        Receipt_extArea.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Receipt_extArea.setRows(5);
        jScrollPane1.setViewportView(Receipt_extArea);

        Tax_jLabel1.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Tax_jLabel1.setText("GST");

        Service_Charges_jLabel.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Service_Charges_jLabel.setText("Service Charges");

        total_jLabel.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        total_jLabel.setText("Total");

        tax_jTextField.setEditable(false);
        tax_jTextField.setBackground(new java.awt.Color(255, 255, 255));
        tax_jTextField.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        tax_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tax_jTextField.setText("0.0");
        tax_jTextField.setBorder(null);

        total_jTextField.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        total_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_jTextField.setText("0.0");
        total_jTextField.setBorder(null);
        total_jTextField.setPreferredSize(new java.awt.Dimension(71, 28));

        Service_charges_jTextField.setFont(new java.awt.Font("Open Sans Extrabold", 0, 14)); // NOI18N
        Service_charges_jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Service_charges_jTextField.setText("0.0");
        Service_charges_jTextField.setBorder(null);
        Service_charges_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Service_charges_jTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Receipt_PanelLayout = new javax.swing.GroupLayout(Receipt_Panel);
        Receipt_Panel.setLayout(Receipt_PanelLayout);
        Receipt_PanelLayout.setHorizontalGroup(
            Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Receipt_PanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tax_jLabel1)
                    .addComponent(Service_Charges_jLabel)
                    .addComponent(total_jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Service_charges_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addComponent(jScrollPane1)
        );
        Receipt_PanelLayout.setVerticalGroup(
            Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Receipt_PanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tax_jLabel1)
                    .addComponent(tax_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Service_charges_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Service_Charges_jLabel))
                .addGap(18, 18, 18)
                .addGroup(Receipt_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_jLabel)
                    .addComponent(total_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Categories_Button_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Functional_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Receipt_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Name_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Name_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Categories_Button_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Functional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Receipt_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// For Creating Card Layout
    private void Fast_Foods_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fast_Foods_buttonActionPerformed

        Menu_Panel.removeAll();
        Menu_Panel.add(Fast_Food_Panel);
        Menu_Panel.repaint();
        Menu_Panel.revalidate();
    }//GEN-LAST:event_Fast_Foods_buttonActionPerformed

    private void Snacks_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Snacks_buttonActionPerformed
        Menu_Panel.removeAll();
        Menu_Panel.add(Snacks_Pannel);
        Menu_Panel.repaint();
        Menu_Panel.revalidate();
    }//GEN-LAST:event_Snacks_buttonActionPerformed

    private void Main_Course_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Course_ButtonActionPerformed
        Menu_Panel.removeAll();
        Menu_Panel.add(Main_Course_Panel);
        Menu_Panel.repaint();
        Menu_Panel.revalidate();
    }//GEN-LAST:event_Main_Course_ButtonActionPerformed

    private void Desserts_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Desserts_ButtonActionPerformed
        Menu_Panel.removeAll();
        Menu_Panel.add(Dessert_Panel);
        Menu_Panel.repaint();
        Menu_Panel.revalidate();
    }//GEN-LAST:event_Desserts_ButtonActionPerformed

    private void Bevarages_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bevarages_ButtonActionPerformed
        Menu_Panel.removeAll();
        Menu_Panel.add(Bevarages_Panel);
        Menu_Panel.repaint();
        Menu_Panel.revalidate();
    }//GEN-LAST:event_Bevarages_ButtonActionPerformed

    private void total_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_ButtonActionPerformed

        ReceiptCalculator.calculateAndDisplayReceipt(AddButtonFunctionality.total, tax_jTextField, Service_charges_jTextField, total_jTextField, Receipt_extArea, orderid);

    }//GEN-LAST:event_total_ButtonActionPerformed

    private void exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exit_ButtonActionPerformed

    private void reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_ButtonActionPerformed
        resetOrder();
    }//GEN-LAST:event_reset_ButtonActionPerformed

    private void add_btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn33ActionPerformed
        // TODO add your handling code here:
        int quantity = (Integer) jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(jSpinner, Receipt_extArea, Pizza_Label27, 1200);
    }//GEN-LAST:event_add_btn33ActionPerformed

    private void add_btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn32ActionPerformed
        int quantity = (Integer) jSpinner41.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(jSpinner41, Receipt_extArea, Burgers_Label, 560);
    }//GEN-LAST:event_add_btn32ActionPerformed

    private void Service_charges_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Service_charges_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Service_charges_jTextFieldActionPerformed

    private void add_btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn35ActionPerformed
        int quantity = (Integer) French_Fries_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(French_Fries_jSpinner, Receipt_extArea, French_Fries_Label, 120);

    }//GEN-LAST:event_add_btn35ActionPerformed

    private void add_btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn34ActionPerformed
        int quantity = (Integer) Sandwiches_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Sandwiches_jSpinner, Receipt_extArea, Sandwiches_Label, 180);
    }//GEN-LAST:event_add_btn34ActionPerformed

    private void add_btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn37ActionPerformed
        int quantity = (Integer) Hot_Dogs_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Hot_Dogs_jSpinner, Receipt_extArea, Hot_Dogs_Label, 300);
    }//GEN-LAST:event_add_btn37ActionPerformed

    private void add_btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn36ActionPerformed
        int quantity = (Integer) Tacos_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Tacos_jSpinner, Receipt_extArea, Tacos_Label, 250);
    }//GEN-LAST:event_add_btn36ActionPerformed

    private void add_btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn24ActionPerformed
        int quantity = (Integer) Spring_Rolls_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Spring_Rolls_jSpinner, Receipt_extArea, Spring_Rolls_Label, 850);
    }//GEN-LAST:event_add_btn24ActionPerformed

    private void add_btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn25ActionPerformed
        int quantity = (Integer) Samosas_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Samosas_jSpinner, Receipt_extArea, Samosas_Label, 60);
    }//GEN-LAST:event_add_btn25ActionPerformed

    private void add_btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn26ActionPerformed
        int quantity = (Integer) Garlic_Bread_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Garlic_Bread_jSpinner, Receipt_extArea, Garlic_Bread_Label, 210);
    }//GEN-LAST:event_add_btn26ActionPerformed

    private void add_btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn28ActionPerformed
        int quantity = (Integer) Onion_Rings_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Onion_Rings_jSpinner, Receipt_extArea, Onion_Rings_Label, 450);
    }//GEN-LAST:event_add_btn28ActionPerformed

    private void add_btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn27ActionPerformed
        int quantity = (Integer) Popcorn_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Popcorn_jSpinner, Receipt_extArea, Popcorn_Label, 445);
    }//GEN-LAST:event_add_btn27ActionPerformed

    private void add_btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn29ActionPerformed
        int quantity = (Integer) Mozzarella_Sticks_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Mozzarella_Sticks_jSpinner, Receipt_extArea, Mozzarella_Sticks_Label, 399);
    }//GEN-LAST:event_add_btn29ActionPerformed

    private void add_btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn30ActionPerformed
        int quantity = (Integer) Chips_Salsa_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Chips_Salsa_jSpinner, Receipt_extArea, Chips_Salsa_Label, 470);
    }//GEN-LAST:event_add_btn30ActionPerformed

    private void add_btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn31ActionPerformed
        int quantity = (Integer) Pretzels_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Mozzarella_Sticks_jSpinner, Receipt_extArea, Pretzels_Label, 690);
    }//GEN-LAST:event_add_btn31ActionPerformed

    private void add_btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn16ActionPerformed
        int quantity = (Integer) Pasta_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Pasta_jSpinner, Receipt_extArea, Pasta_Label, 280);
    }//GEN-LAST:event_add_btn16ActionPerformed

    private void add_btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn17ActionPerformed
        int quantity = (Integer) Steaks_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Steaks_jSpinner, Receipt_extArea, Steaks_Label, 1300);
    }//GEN-LAST:event_add_btn17ActionPerformed

    private void add_btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn19ActionPerformed
        int quantity = (Integer) Grilled_Chicken_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Grilled_Chicken_jSpinner, Receipt_extArea, Grilled_Chicken_Label, 1440);
    }//GEN-LAST:event_add_btn19ActionPerformed

    private void add_btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn18ActionPerformed
        int quantity = (Integer) Rice_Bowls_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Rice_Bowls_jSpinner, Receipt_extArea, Rice_Bowls_Label, 720);
    }//GEN-LAST:event_add_btn18ActionPerformed

    private void add_btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn20ActionPerformed
        int quantity = (Integer) Seafood_Platter_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Seafood_Platter_jSpinner, Receipt_extArea, Seafood_Platter_Label, 2995);
    }//GEN-LAST:event_add_btn20ActionPerformed

    private void add_btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn21ActionPerformed
        int quantity = (Integer) Soup_Bread_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Soup_Bread_jSpinner, Receipt_extArea, Soup_Bread_Label, 899);
    }//GEN-LAST:event_add_btn21ActionPerformed

    private void add_btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn22ActionPerformed
        int quantity = (Integer) Stir_Fried_Noodles_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);

        AddButtonFunctionality.addButtonAction(Stir_Fried_Noodles_jSpinner, Receipt_extArea, Stir_Fried_Noodles_Label, 670);
    }//GEN-LAST:event_add_btn22ActionPerformed

    private void add_btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn23ActionPerformed
        int quantity = (Integer) Roast_Beef_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Roast_Beef_jSpinner, Receipt_extArea, Roast_Beef_Label, 1520);
    }//GEN-LAST:event_add_btn23ActionPerformed

    private void add_btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn12ActionPerformed
        int quantity = (Integer) Ice_Cream_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Ice_Cream_jSpinner, Receipt_extArea, Ice_Cream_Label, 250); // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_add_btn12ActionPerformed

    private void add_btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn9ActionPerformed
        int quantity = (Integer) Cake_Slice_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Cake_Slice_jSpinner, Receipt_extArea, Cake_Slice_Label, 35000);
    }//GEN-LAST:event_add_btn9ActionPerformed

    private void add_btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn10ActionPerformed
        int quantity = (Integer) Brownies_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Brownies_jSpinner, Receipt_extArea, Brownies_Label, 220);
    }//GEN-LAST:event_add_btn10ActionPerformed

    private void add_btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn11ActionPerformed
        int quantity = (Integer) Cheese_cake_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Cheese_cake_jSpinner, Receipt_extArea, Cheese_cake_Label, 799);
    }//GEN-LAST:event_add_btn11ActionPerformed

    private void add_btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn13ActionPerformed
        int quantity = (Integer) Cup_cake_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Cup_cake_jSpinner, Receipt_extArea, Cup_cake_Label, 250);  // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_add_btn13ActionPerformed

    private void add_btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn8ActionPerformed
        int quantity = (Integer) Waffles_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Waffles_jSpinner, Receipt_extArea, Waffles_Label, 499);        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_add_btn8ActionPerformed

    private void add_btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn14ActionPerformed
        int quantity = (Integer) Donuts_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Donuts_jSpinner, Receipt_extArea, Donuts_Label, 220);     // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_add_btn14ActionPerformed

    private void add_btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn15ActionPerformed
        int quantity = (Integer) Pudding_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Pudding_jSpinner, Receipt_extArea, Pudding_Label, 160);
    }//GEN-LAST:event_add_btn15ActionPerformed

    private void add_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn1ActionPerformed
        int quantity = (Integer) up_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(up_jSpinner, Receipt_extArea, up_Label, 150);
    }//GEN-LAST:event_add_btn1ActionPerformed

    private void Pepsi_add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pepsi_add_btnActionPerformed
        int quantity = (Integer) Pepsi_Label_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(up_jSpinner, Receipt_extArea, Pepsi_Label, 150);      // TODO add your handling code here:
    }//GEN-LAST:event_Pepsi_add_btnActionPerformed

    private void add_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn2ActionPerformed
        int quantity = (Integer) Big_apple_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Big_apple_jSpinner, Receipt_extArea, Big_apple_Label, 150);// TODO add your handling code here:
    }//GEN-LAST:event_add_btn2ActionPerformed

    private void add_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn3ActionPerformed
        int quantity = (Integer) cola_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(cola_jSpinner, Receipt_extArea, cola_Label, 150);
    }//GEN-LAST:event_add_btn3ActionPerformed

    private void add_btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn7ActionPerformed
        int quantity = (Integer) Fanta_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Fanta_jSpinner, Receipt_extArea, Fanta_Label, 150);
    }//GEN-LAST:event_add_btn7ActionPerformed

    private void add_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn6ActionPerformed
        int quantity = (Integer) Fizzup_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Fizzup_jSpinner, Receipt_extArea, Fizzup_Label, 150);
    }//GEN-LAST:event_add_btn6ActionPerformed

    private void add_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn5ActionPerformed
        int quantity = (Integer) kola_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(kola_jSpinner, Receipt_extArea, kola_Label, 150);// TODO add your handling code here:
    }//GEN-LAST:event_add_btn5ActionPerformed

    private void add_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn4ActionPerformed
        int quantity = (Integer) Sprite_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Sprite_jSpinner, Receipt_extArea, Sprite_Label, 150);     // TODO add your handling code here:
    }//GEN-LAST:event_add_btn4ActionPerformed

    private void add_btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn39ActionPerformed
        // TODO add your handling code here:
        int quantity = (Integer) Nachos_jSpinner.getValue();
        System.out.println("Spinner value: " + quantity);
        AddButtonFunctionality.addButtonAction(Nachos_jSpinner, Receipt_extArea, Nachos_Label, 150);     // TODO add your handling code here:                                     
    }//GEN-LAST:event_add_btn39ActionPerformed

    private void receipt_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_ButtonActionPerformed
        ReceiptProcessor receiptProcessor = new ReceiptProcessor();
        receiptProcessor.processReceipt(Receipt_extArea, tax_jTextField, total_jTextField, Service_charges_jTextField, orderid);

    }//GEN-LAST:event_receipt_ButtonActionPerformed

    private void add_btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn38ActionPerformed

    }//GEN-LAST:event_add_btn38ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//         System.out.println(new File("images/7up.jpeg").getParentFile());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bevarages_Button;
    private javax.swing.JPanel Bevarages_Panel;
    private javax.swing.JLabel Bevarages_Title;
    private javax.swing.JPanel Big_Apple_Panel;
    private javax.swing.JLabel Big_apple_Label;
    private javax.swing.JLabel Big_apple_img;
    private javax.swing.JSpinner Big_apple_jSpinner;
    private javax.swing.JLabel Big_apple_price;
    private javax.swing.JPanel Browmies_panel;
    private javax.swing.JLabel Brownies_Label;
    private javax.swing.JLabel Brownies_img;
    private javax.swing.JSpinner Brownies_jSpinner;
    private javax.swing.JLabel Burgers_Label;
    private javax.swing.JPanel Burgers_Panel;
    private javax.swing.JLabel Burgers_img;
    private javax.swing.JLabel Cafe_Name;
    private javax.swing.JLabel Cake_Slice_Label;
    private javax.swing.JSpinner Cake_Slice_jSpinner;
    private javax.swing.JPanel Categories_Button_Pannel;
    private javax.swing.JLabel Cheese_cake_Label;
    private javax.swing.JSpinner Cheese_cake_jSpinner;
    private javax.swing.JLabel Cheesecake_img;
    private javax.swing.JPanel Cheesecake_panel;
    private javax.swing.JLabel Chicken_Nuggets_Label;
    private javax.swing.JPanel Chicken_Nuggets_Panel;
    private javax.swing.JLabel Chicken_Nuggets_img;
    private javax.swing.JSpinner Chicken_Nuggets_jSpinner;
    private javax.swing.JLabel Chips_Salsa_Label;
    private javax.swing.JPanel Chips_Salsa_Panel;
    private javax.swing.JLabel Chips_Salsa_img;
    private javax.swing.JSpinner Chips_Salsa_jSpinner;
    private javax.swing.JLabel Cup_cake_Label;
    private javax.swing.JSpinner Cup_cake_jSpinner;
    private javax.swing.JPanel Dessert_Panel;
    private javax.swing.JButton Desserts_Button;
    private javax.swing.JLabel Donuts_Label;
    private javax.swing.JPanel Donuts_Panel;
    private javax.swing.JLabel Donuts_img;
    private javax.swing.JSpinner Donuts_jSpinner;
    private javax.swing.JLabel Fanta_Label;
    private javax.swing.JPanel Fanta_Panel;
    private javax.swing.JSpinner Fanta_jSpinner;
    private javax.swing.JLabel Fanta_price;
    private javax.swing.JPanel Fast_Food_Panel;
    private javax.swing.JButton Fast_Foods_button;
    private javax.swing.JLabel Fizzup_Label;
    private javax.swing.JPanel Fizzup_Panel;
    private javax.swing.JLabel Fizzup_img;
    private javax.swing.JSpinner Fizzup_jSpinner;
    private javax.swing.JLabel Fizzup_price;
    private javax.swing.JLabel French_Fries_Label;
    private javax.swing.JPanel French_Fries_Panel;
    private javax.swing.JLabel French_Fries_img;
    private javax.swing.JSpinner French_Fries_jSpinner;
    private javax.swing.JPanel Functional_btn;
    private javax.swing.JLabel Garlic_Bread_Label;
    private javax.swing.JPanel Garlic_Bread_Panel;
    private javax.swing.JLabel Garlic_Bread_img;
    private javax.swing.JSpinner Garlic_Bread_jSpinner;
    private javax.swing.JLabel Grilled_Chicken_Label;
    private javax.swing.JPanel Grilled_Chicken_Panel;
    private javax.swing.JLabel Grilled_Chicken_img;
    private javax.swing.JSpinner Grilled_Chicken_jSpinner;
    private javax.swing.JLabel Hot_Dogs_Label;
    private javax.swing.JPanel Hot_Dogs_Panel;
    private javax.swing.JLabel Hot_Dogs_img;
    private javax.swing.JSpinner Hot_Dogs_jSpinner;
    private javax.swing.JPanel IceCream_Panel1;
    private javax.swing.JLabel Ice_Cream_Label;
    private javax.swing.JSpinner Ice_Cream_jSpinner;
    private javax.swing.JButton Main_Course_Button;
    private javax.swing.JPanel Main_Course_Panel;
    private javax.swing.JLayeredPane Menu_Panel;
    private javax.swing.JLabel Mozzarella_Sticks_Label;
    private javax.swing.JPanel Mozzarella_Sticks_Panel;
    private javax.swing.JLabel Mozzarella_Sticks_img;
    private javax.swing.JSpinner Mozzarella_Sticks_jSpinner;
    private javax.swing.JLabel Nachos_Label;
    private javax.swing.JPanel Nachos_Panel;
    private javax.swing.JLabel Nachos_img;
    private javax.swing.JSpinner Nachos_jSpinner;
    private javax.swing.JPanel Name_Container;
    private javax.swing.JLabel Onion_Rings_Label;
    private javax.swing.JPanel Onion_Rings_Panel;
    private javax.swing.JLabel Onion_Rings_img;
    private javax.swing.JSpinner Onion_Rings_jSpinner;
    private javax.swing.JLabel Pasta_Label;
    private javax.swing.JPanel Pasta_Panel;
    private javax.swing.JLabel Pasta_img;
    private javax.swing.JSpinner Pasta_jSpinner;
    private javax.swing.JLabel Pepsi_Label;
    private javax.swing.JSpinner Pepsi_Label_jSpinner;
    private javax.swing.JPanel Pepsi_Panel1;
    private javax.swing.JLabel Pepsi_Price1;
    private javax.swing.JLabel Pepsi_Price10;
    private javax.swing.JLabel Pepsi_Price11;
    private javax.swing.JLabel Pepsi_Price12;
    private javax.swing.JLabel Pepsi_Price13;
    private javax.swing.JLabel Pepsi_Price14;
    private javax.swing.JLabel Pepsi_Price15;
    private javax.swing.JLabel Pepsi_Price16;
    private javax.swing.JLabel Pepsi_Price17;
    private javax.swing.JLabel Pepsi_Price18;
    private javax.swing.JLabel Pepsi_Price19;
    private javax.swing.JLabel Pepsi_Price2;
    private javax.swing.JLabel Pepsi_Price20;
    private javax.swing.JLabel Pepsi_Price21;
    private javax.swing.JLabel Pepsi_Price22;
    private javax.swing.JLabel Pepsi_Price23;
    private javax.swing.JLabel Pepsi_Price24;
    private javax.swing.JLabel Pepsi_Price25;
    private javax.swing.JLabel Pepsi_Price26;
    private javax.swing.JLabel Pepsi_Price27;
    private javax.swing.JLabel Pepsi_Price28;
    private javax.swing.JLabel Pepsi_Price29;
    private javax.swing.JLabel Pepsi_Price3;
    private javax.swing.JLabel Pepsi_Price30;
    private javax.swing.JLabel Pepsi_Price31;
    private javax.swing.JLabel Pepsi_Price32;
    private javax.swing.JLabel Pepsi_Price33;
    private javax.swing.JLabel Pepsi_Price4;
    private javax.swing.JLabel Pepsi_Price5;
    private javax.swing.JLabel Pepsi_Price6;
    private javax.swing.JLabel Pepsi_Price7;
    private javax.swing.JLabel Pepsi_Price8;
    private javax.swing.JLabel Pepsi_Price9;
    private javax.swing.JButton Pepsi_add_btn;
    private javax.swing.JLabel Pepsi_img;
    private javax.swing.JLabel Pizza_Label27;
    private javax.swing.JPanel Pizza_Panel;
    private javax.swing.JLabel Pizza_img;
    private javax.swing.JLabel Popcorn_Label;
    private javax.swing.JPanel Popcorn_Panel;
    private javax.swing.JLabel Popcorn_img;
    private javax.swing.JSpinner Popcorn_jSpinner;
    private javax.swing.JLabel Pretzels_Label;
    private javax.swing.JLabel Pretzels_img;
    private javax.swing.JSpinner Pretzels_jSpinner;
    private javax.swing.JPanel Pretzelsn_Panel;
    private javax.swing.JLabel Pudding_Label;
    private javax.swing.JLabel Pudding_img;
    private javax.swing.JSpinner Pudding_jSpinner;
    private javax.swing.JPanel Receipt_Panel;
    private javax.swing.JTextArea Receipt_extArea;
    private javax.swing.JLabel Rice_Bowls_Label;
    private javax.swing.JPanel Rice_Bowls_Panel;
    private javax.swing.JLabel Rice_Bowls_img;
    private javax.swing.JSpinner Rice_Bowls_jSpinner;
    private javax.swing.JLabel Roast_Beef_Label;
    private javax.swing.JPanel Roast_Beef_Panel;
    private javax.swing.JLabel Roast_Beef_img;
    private javax.swing.JSpinner Roast_Beef_jSpinner;
    private javax.swing.JLabel Samosas_Label;
    private javax.swing.JPanel Samosas_Panel;
    private javax.swing.JLabel Samosas_img;
    private javax.swing.JSpinner Samosas_jSpinner;
    private javax.swing.JLabel Sandwiches_Label;
    private javax.swing.JPanel Sandwiches_Panel;
    private javax.swing.JLabel Sandwiches_img;
    private javax.swing.JSpinner Sandwiches_jSpinner;
    private javax.swing.JLabel Seafood_Platter_Label;
    private javax.swing.JPanel Seafood_Platter_Panel;
    private javax.swing.JLabel Seafood_Platter_img;
    private javax.swing.JSpinner Seafood_Platter_jSpinner;
    private javax.swing.JLabel Service_Charges_jLabel;
    private javax.swing.JTextField Service_charges_jTextField;
    private javax.swing.JPanel Snacks_Pannel;
    private javax.swing.JButton Snacks_button;
    private javax.swing.JLabel Soup_Bread_Label;
    private javax.swing.JPanel Soup_Bread_Panel;
    private javax.swing.JLabel Soup_Bread_img;
    private javax.swing.JSpinner Soup_Bread_jSpinner;
    private javax.swing.JLabel Spring_Rolls_Label;
    private javax.swing.JPanel Spring_Rolls_Panel;
    private javax.swing.JLabel Spring_Rolls_img;
    private javax.swing.JSpinner Spring_Rolls_jSpinner;
    private javax.swing.JLabel Sprite_Label;
    private javax.swing.JSpinner Sprite_jSpinner;
    private javax.swing.JLabel Steaks_Label;
    private javax.swing.JPanel Steaks_Panel;
    private javax.swing.JLabel Steaks_img;
    private javax.swing.JSpinner Steaks_jSpinner;
    private javax.swing.JLabel Stir_Fried_Noodles_Label;
    private javax.swing.JPanel Stir_Fried_Noodles_Panel;
    private javax.swing.JLabel Stir_Fried_Noodles_img;
    private javax.swing.JSpinner Stir_Fried_Noodles_jSpinner;
    private javax.swing.JLabel Tacos_Label;
    private javax.swing.JPanel Tacos_Panel;
    private javax.swing.JLabel Tacos_img;
    private javax.swing.JSpinner Tacos_jSpinner;
    private javax.swing.JLabel Tax_jLabel1;
    private javax.swing.JLabel Waffles_Label;
    private javax.swing.JLabel Waffles_img;
    private javax.swing.JSpinner Waffles_jSpinner;
    private javax.swing.JButton add_btn1;
    private javax.swing.JButton add_btn10;
    private javax.swing.JButton add_btn11;
    private javax.swing.JButton add_btn12;
    private javax.swing.JButton add_btn13;
    private javax.swing.JButton add_btn14;
    private javax.swing.JButton add_btn15;
    private javax.swing.JButton add_btn16;
    private javax.swing.JButton add_btn17;
    private javax.swing.JButton add_btn18;
    private javax.swing.JButton add_btn19;
    private javax.swing.JButton add_btn2;
    private javax.swing.JButton add_btn20;
    private javax.swing.JButton add_btn21;
    private javax.swing.JButton add_btn22;
    private javax.swing.JButton add_btn23;
    private javax.swing.JButton add_btn24;
    private javax.swing.JButton add_btn25;
    private javax.swing.JButton add_btn26;
    private javax.swing.JButton add_btn27;
    private javax.swing.JButton add_btn28;
    private javax.swing.JButton add_btn29;
    private javax.swing.JButton add_btn3;
    private javax.swing.JButton add_btn30;
    private javax.swing.JButton add_btn31;
    private javax.swing.JButton add_btn32;
    private javax.swing.JButton add_btn33;
    private javax.swing.JButton add_btn34;
    private javax.swing.JButton add_btn35;
    private javax.swing.JButton add_btn36;
    private javax.swing.JButton add_btn37;
    private javax.swing.JButton add_btn38;
    private javax.swing.JButton add_btn39;
    private javax.swing.JButton add_btn4;
    private javax.swing.JButton add_btn5;
    private javax.swing.JButton add_btn6;
    private javax.swing.JButton add_btn7;
    private javax.swing.JButton add_btn8;
    private javax.swing.JButton add_btn9;
    private javax.swing.JLabel cakeSlice_img;
    private javax.swing.JPanel cakeSlice_panel;
    private javax.swing.JLabel cola_Label;
    private javax.swing.JPanel cola_Panel2;
    private javax.swing.JLabel cola_Price;
    private javax.swing.JLabel cola_img;
    private javax.swing.JSpinner cola_jSpinner;
    private javax.swing.JPanel cupCake_Panel;
    private javax.swing.JPanel cupCake_Panel1;
    private javax.swing.JPanel cupCake_Panel3;
    private javax.swing.JLabel cupCake_img;
    private javax.swing.JButton exit_Button;
    private javax.swing.JLabel fanta_img;
    private javax.swing.JLabel iceCream_img;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JSpinner jSpinner41;
    private javax.swing.JLabel kola_Label;
    private javax.swing.JPanel kola_Panel;
    private javax.swing.JLabel kola_img;
    private javax.swing.JSpinner kola_jSpinner;
    private javax.swing.JLabel kola_price;
    private javax.swing.JButton receipt_Button;
    private javax.swing.JButton reset_Button;
    private javax.swing.JPanel sprite_Panel;
    private javax.swing.JLabel sprite_img;
    private javax.swing.JLabel sprite_price;
    private javax.swing.JTextField tax_jTextField;
    private javax.swing.JButton total_Button;
    private javax.swing.JLabel total_jLabel;
    private javax.swing.JTextField total_jTextField;
    private javax.swing.JLabel up_Label;
    private javax.swing.JPanel up_Panel;
    private javax.swing.JLabel up_img;
    private javax.swing.JSpinner up_jSpinner;
    private javax.swing.JLabel up_price;
    // End of variables declaration//GEN-END:variables
}

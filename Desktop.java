class Desktop {
	
    static String processor = "Intel i7";
    static int ramSize = 16;
    static int storage = 512;
    static String desktopName = "Windows 11";
    static String graphicsCard = "Nvidin GTX 1660";
    static double screenSize = 24.0;
    static String desktopBrand = "HP";
    static String coolingSystem = "Fan-based";
    static boolean wifi = true;
    static boolean expandable = true;
    static String monitorType = "LED";
    // static String inputDevices = "Keyboard, Mouse";

    public static void main(String[] args) {
        System.out.println("Desktop Details are:");
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Brand: " + desktopBrand);
        System.out.println("Cooling System is: " + coolingSystem);
        // System.out.println("Wi-Fi : " + wifi);
        System.out.println("Expandable: " + expandable);
        System.out.println("Monitor Type is: " + monitorType);
        System.out.println("Input Devices are: " + inputDevices);
    }
}

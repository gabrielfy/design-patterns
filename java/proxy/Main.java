package proxy;

class Main {
    public static void main(String args[]) {
		Image image1 = new ProxyImage("HiRes_10mb_Photo1");
		Image image2 = new ProxyImage("HiRes_10mb_Photo2");
		
		image1.displayImage();
		image2.displayImage();

		image1.displayImage();
	}
}

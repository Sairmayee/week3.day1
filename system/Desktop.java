package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("16 inches");
	}
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		Desktop dsk = new Desktop();
		dsk.desktopSize();
		comp.computerModel();
	}
}

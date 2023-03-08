package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_03_SwitchCase {
	private WebDriver driver;
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	}

	@Test
	public void TC_01() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;

		}
	}

}

package UtilLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseLayer.Baseclass;

public class ExtentReportClass extends Baseclass {
	public static ExtentReports extent;

	public static ExtentReports extentsetup() {
		ExtentSparkReporter sparkreport = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\Reports\\abc.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkreport);
		sparkreport.config().setDocumentTitle("Page Test Cases");
		sparkreport.config().setTheme(Theme.DARK);
		sparkreport.config().setTimeStampFormat("HH:mm:ss ddMMMyyyy");
		return extent;

	}

}

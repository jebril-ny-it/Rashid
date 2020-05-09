//@Author Jebril
package com.Amgen.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amgen.qa.base.TestBase;
import com.Amgen.qa.pages.CardInformationPage;
import com.Amgen.qa.pages.EligibilityPage;
import com.Amgen.qa.pages.StandAlonePage;

public class EligibilityPageTerst extends TestBase {

	EligibilityPage eligibilityPage;
	StandAlonePage standAlonePage;
	CardInformationPage cardInformationPage;

	public EligibilityPageTerst() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initalization();
		eligibilityPage = new EligibilityPage();
		standAlonePage = new StandAlonePage();
		Thread.sleep(3000);
		eligibilityPage = standAlonePage.clickOnGetStarted();
	}

	@Test
	public void clickOnRadioBtnQ1Test() {
		cardInformationPage = eligibilityPage.filloutEligebilityQuestions();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

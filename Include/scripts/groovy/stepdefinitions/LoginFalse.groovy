package stepdefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginFalse {
	@Given("User navigates to loginpage")
	def navigateToLoginPage() {
		println ("\n I am inside LoginPage")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://www.vergency.vn/account/login')
	}

	@When("User inputs user (.*) and pass (.*)")
	def enterCredentials(String user, String pass) {
		WebUI.setText(findTestObject('Object Repository/Page_Ti khon  Vergency/input_ng nhp_customeremail'), user)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ti khon  Vergency/input_ng nhp_customerpassword'), pass)
	}
	@And("Click on loginbutton")
	def clickonLoginbtn() {
		println ("\n I am click on Login Button")
		WebUI.click(findTestObject('Object Repository/Page_Ti khon  Vergency/input_ng nhp_btn btn-signin (2)'))
	}
	@Then("Verify element text")
	def verifytext1() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Ti khon  Vergency/li_Thng tin ng nhp khng hp l'), 'Thông tin đăng nhập không hợp lệ.')
		WebUI.closeBrowser()
	}
}
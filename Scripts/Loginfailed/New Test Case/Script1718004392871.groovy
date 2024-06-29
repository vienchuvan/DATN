import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.vergency.vn/')

WebUI.click(findTestObject('Object Repository/loginFailed/Page_Ca hng qun o.  Vergency/svg_Toggle navigation_svg-next-icon svg-nex_fd1658'))

WebUI.setText(findTestObject('Object Repository/loginFailed/Page_Ti khon  Vergency/input_ng nhp_customeremail'), 'sakurakiss102@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/loginFailed/Page_Ti khon  Vergency/input_ng nhp_customerpassword'), 
    'N1hlShgCjmNWpugwkXOB0g==')

WebUI.click(findTestObject('Object Repository/loginFailed/Page_Ti khon  Vergency/input_ng nhp_btn btn-signin'))

WebUI.click(findTestObject('Object Repository/loginFailed/Page_Ti khon  Vergency/li_Thng tin ng nhp khng hp l'))

WebUI.verifyElementText(findTestObject('Object Repository/loginFailed/Page_Ti khon  Vergency/li_Thng tin ng nhp khng hp l'), 
    'Thông tin đăng nhập không hợp lệ.')
WebUI.closeBrowser()
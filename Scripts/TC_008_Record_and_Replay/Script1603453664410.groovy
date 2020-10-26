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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_Username_txtPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/img'))

WebUI.click(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_Status Not Submitted_button'))

WebUI.click(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_Sun                                 2_7650eb'))

WebUI.click(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_Sun                                 2_85cb6c'))

WebUI.click(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input__btnSave'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RP_Record and Replay/Page_OrangeHRM/input_Sun                                 2_85cb6c'), 
    0)

WebUI.closeBrowser()


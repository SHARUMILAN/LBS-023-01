import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://qatrunkapps.sqlpower.ca/')

WebUI.setText(findTestObject('Page_Login - Liferay/input_Email Address__58_login'), '1105101_cimatest_bnk_1@org.com')

WebUI.setEncryptedText(findTestObject('Page_Login - Liferay/input_Password__58_password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Page_Login - Liferay/button_Sign In'))

WebUI.click(findTestObject('Page_Filings - Liferay/a_Locational Banking Statistics - Class A'))

WebUI.click(findTestObject('Page_Home - Liferay/clicking on Return Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Home - Liferay/clicking on Return Name'), 'LBS-023-01')

WebUI.click(findTestObject('Page_Login - Liferay/button2'))

WebUI.click(findTestObject('Page_Login - Liferay/button3'))

WebUI.switchToWindowTitle('Table of Schedules')

WebUI.click(findTestObject('Page_Table of Schedules/a_A - Claims Debt Securities  Short-Term (Market Value)'))

WebUI.selectOptionByValue(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Counterparty'), 'Austria', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'), 'Euro', 
    true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Banks (Related offices)'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Banks (Related offices)'), '12333')

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Banks(Unrelated banks)'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Banks(Unrelated banks)'), '3213123')

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Non Financial'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Non Financial'), '312321132')

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Non Bankk'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Non Bankk'), '321321')

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/General gov'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/General gov'), '321321321')

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Households Incl'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Households Incl'), '321321')

WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Unallocated by sector'))

WebUI.setText(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/Unallocated by sector'), '321312')

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button5'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button6'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button7'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button4'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/Upload File'))

not_run: WebUI.uploadFile(findTestObject('Page_Login - Liferay/Upload File'), RunConfiguration.getProjectDir() + '/Test-files/main (5).pdf')

not_run: WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('B'), [:], FailureHandling.STOP_ON_FAILURE)


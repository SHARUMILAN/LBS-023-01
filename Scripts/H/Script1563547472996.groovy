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

WebUI.click(findTestObject('Page_G - Liabilities Deposits (Deposits Repos Hybrid and Subordinated Debt Other Borrowings)/a_H - Liabilit'))

WebUI.selectOptionByValue(findTestObject('Page_H - Liabilities Other Inst/Counterparty H'), 'Bahamas', true)

WebUI.selectOptionByValue(findTestObject('Page_H - Liabilities Other Inst/In currency H'), 'US Dollar', true)

not_run: WebUI.click(findTestObject('Page_A - Claims Debt Securities  Short-Term (Market Value)/In currency'))

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Banks Related H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Banks Related H'), '32121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Banks Unrelated H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Banks Unrelated H'), '12212', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Banks Central H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Banks Central H'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Non-financial Corp H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Non-financial Corp H'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Non-Banks H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Non-Banks H'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/General H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/General H'), '212121', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Households Incl H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Households Incl H'), '321321321', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_H - Liabilities Other Inst/Unallocated H'))

WebUI.setText(findTestObject('Page_H - Liabilities Other Inst/Unallocated H'), '11111111111', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Login - Liferay/button4'))

WebUI.uploadFile(findTestObject('Page_Login - Liferay/Upload File'), RunConfiguration.getProjectDir() + '/Test-files/main (5).pdf')

WebUI.click(findTestObject('Page_Login - Liferay/button5'))

WebUI.click(findTestObject('Page_Login - Liferay/button6'))

WebUI.click(findTestObject('Page_Login - Liferay/button7'))

not_run: WebUI.callTestCase(findTestCase('D'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))


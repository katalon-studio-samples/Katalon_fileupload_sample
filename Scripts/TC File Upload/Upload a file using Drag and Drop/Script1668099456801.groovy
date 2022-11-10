import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.igniteui.com/file-upload/multiple-upload')

WebUI.maximizeWindow()

WebUI.delay(5)
String dirName = RunConfiguration.getProjectDir()
println("Project Directory: "+dirName)

WebUI.sendKeys(findTestObject('OR File Upload/Page_Multiple Uploads Sample/input_Upload multiple_File'), dirName+'/MyTestFile/TestData.xlsx \n'+ dirName+'/MyTestFile/DDT.xlsx')

WebUI.delay(5)

WebUI.closeBrowser()


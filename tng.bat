set myProjectpath=C:\Users\envy\Desktop\March26Space\TestNGProject\
cd %myProjectpath%
set classpath=%myProjectpath%\bin;F:\SeleniumSoftware\JavaBindings\All\*;F:\SeleniumSoftware\Eclipse\EclipseMar9\plugins\*;
java org.testng.TestNG %myProjectpath%\demoClasses.xml
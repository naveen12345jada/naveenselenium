set projectLocation=C:\Users\jadan\OneDrive\Documents\Seleniumworksp-1\Framework_Add_Employee\Addnewemployee
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\nav\*
java org.testng.TestNG %projectLocation%\testng.xml


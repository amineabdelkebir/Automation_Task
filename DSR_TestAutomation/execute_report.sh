echo  "⚠️ cleaning Allure reports "
rm -rf allure-results/*
echo  "⚠️ runing test "
mvn test
echo  "⚠️ generate Allure reports "
allure serve
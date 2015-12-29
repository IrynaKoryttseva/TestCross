step1 -> Selenium Grid (http://autoqa.org/selenium-grid/vvedenie-selenium-grid.html)
: download Selenium Server Standalone
: create folder SeleniumGrid
: copy Selenium Server Standalone in folder SeleniumGrid
: in console java -jar selenium_server_standalone_2.46.0.jar -role hub
: open browser goto link http://localhost:4444/grid/console
: for FIREFOX java -jar selenium-server-standalone-2.46.0.jar -role webdriver -hub http://localhost:4444/grid/register
                                                                                -port 5556 -browser browserName=firefox
  for IE  java -Dwebdriver.ie.driver=IEDriverServer.exe -jar selenium-server-standalone-2.46.0.jar -role webdriver -hub
          http://localhost:4444/grid/register -port 5558 -browser browserName=iexplorer
  for CHROME  java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-2.46.0.jar -role
          webdriver -hub http://localhost:4444/grid/register -port 5558 -browser browserName=chrome


          sonar????
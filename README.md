git config user.name "nisanth.pa@gmail.com" ##For login
cf push pal-tracker -p build/libs/pal-tracker.jar --random-route ##To push the jar to repo
cf logs pal-tracker --recent  ##to check logs

https://apps.sys.evans.pal.pivotal.io ## Pivotal app manager
http://courses.education.pivotal.io/  ## Pivotal eductaion course

WELCOME_MESSAGE=hello ./gradlew bootRun ## To start the application with the property value

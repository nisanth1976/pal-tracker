git config user.name "nisanth.pa@gmail.com" ##For login
cf push pal-tracker -p build/libs/pal-tracker.jar --random-route ##To push the jar to repo
cf logs pal-tracker --recent  ##to check logs

https://apps.sys.evans.pal.pivotal.io ## Pivotal app manager
http://courses.education.pivotal.io/  ## Pivotal eductaion course

WELCOME_MESSAGE=hello ./gradlew bootRun ## To start the application with the property value


Extras
=======
http://blog.kfish.org/2010/04/git-lola.html ##Git resources
git status
git log
git clean -df
git tag
git log --graph --decorate --pretty=oneline --abbrev-commit --all
git merge pipeline-start
git remote add origin https://github.com/nisanth1976/pal-tracker.git
git remote -v

git push origin master
git push origin master --force-with-lease

git commit -m "Add remead and update repository to use jcenter"

git config --global user.name "nisanth1976"

git push origin master --force-with-lease

git push origin master -f
git push --tags

git cherry-pick pipeline-start

https://help.github.com/en/github/extending-github/git-automation-with-oauth-tokens

Check Routes
===================
cf domains

cf check-route <your-route-name> <domain-name>
e.g. cf check-route pal-tracker-nisanth1976 apps.evans.pal.pivotal.io

CF Console:
https://login.sys.evans.pal.pivotal.io/login


CICD
============
https://travis-ci.org/


Rest tool: Insomnia

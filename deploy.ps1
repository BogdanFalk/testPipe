set HTTP_PROXY=http://uidq6826:Online*121@cias3basic.conti.de:8080
set HTTPS_PROXY=http://uidq6826:Online*121@cias3basic.conti.de:8080
set HEROKU_API_KEY 3b28c1d7-3045-4d45-bd45-179c18752fcc
Set-InternetProxy -proxy "http://uidq6826:Online*121@cias3basic.conti.de:8080"
echo "-------------------------------------------------------------"
echo "--------------------------Set API KEY------------------------"
echo "-------------------------------------------------------------"
mvn clean package
echo "-------------------------------------------------------------"
echo "--------------------------Maven Built------------------------"
echo "-------------------------------------------------------------"
git add .
$CommitMsg = Read-Host -Prompt 'Git Commit Message:'
git commit -m $CommitMsg
pause
git push heroku master
echo "-------------------------------------------------------------"
echo "------------------------Heroku Deployed----------------------"
echo "-------------------------------------------------------------"
pause
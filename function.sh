function myfunction(){
echo $1
}
result="$( myfunction $((RANDOM%2)) )"
if [ $result -eq 1 ]
then
echo "SUCCESS"
else
echo "FAIL"
fi

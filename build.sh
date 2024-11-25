set -e 

cd src

docker build -t mattiasa/java-memusage .
docker push mattiasa/java-memusage

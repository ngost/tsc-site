# TSC Site based WebGL on Maven, Java Spring boot

# Install / Build

mvn package

# Run on Local

sh run_local.sh

# Run on Docker

docker build -t tsc-site:0.1 .

docker run -d -p 8080:8080 tsc-site:0.1

docker ps

### Install maven:
-------------------------
https://maven.apache.org/install.html

### Build:
-------------------------
From project root folder
> `mvn clean package -DskipTests`
Should create the jar in ./target

### Run service:
-------------------------
`java -jar target/demo-0.0.1-SNAPSHOT.jar`

### Test:
-------------------------
http://localhost:8080/
http://localhost:8080/index.html
http://localhost:8080/other.html
http://localhost:8080/resource

Login with `user`/`pass` when prompted

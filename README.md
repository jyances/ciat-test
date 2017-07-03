#test 
It can be deployed in a Tomcat or with the UbberJar as java -jar ciat.jar
The UbberJar encampulate the necesary api from a jee container into a single jar along with the application, microservice oriented. 

Requirements:
    The partner.txt file must be in the temp folder
        UNIX        /tmp/partner.txt
        WINDOWS     c://temp/partner.txt

Patterns
    Singleton
    Dto
    Dao

Country list from a rest service
    https://restcountries.eu/rest/v2/all

Enumeration for types of partners

Java Packages
    business
    service
    dao
    model

Dependency stack
    struts2 core
    gson
    struts bootstrap pluggin
    bootstrap 4.0 
    struts java8 support
    log4j
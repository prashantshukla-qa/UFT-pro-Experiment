# UFT-pro-Experiment
This repo contains the experimental java code for UFT Pro


## Install UFT Pro Maven files in local maven repo

This is for **UFT Developer 2023**. This is required so that you can import the UFT Promaven dependecies in the POM file

### Install UFT Developer jars:

```
mvn install:install-file -Dfile=com.hp.lft.common-2023.0.0.jar -DpomFile=com.hp.lft.common-2023.0.0-pom.xml
mvn install:install-file -Dfile=com.hp.lft.report-2023.0.0.jar -DpomFile=com.hp.lft.report-2023.0.0-pom.xml
mvn install:install-file -Dfile=com.hp.lft.reportbuilder-2023.0.0.jar -DpomFile=com.hp.lft.reportbuilder-2023.0.0-pom.xml
mvn install:install-file -Dfile=com.hp.lft.sdk-2023.0.0.jar -DpomFile=com.hp.lft.sdk-2023.0.0-pom.xml
mvn install:install-file -Dfile=com.hp.lft.unittesting-2023.0.0.jar -DpomFile=com.hp.lft.unittesting-2023.0.0-pom.xml
mvn install:install-file -Dfile=com.hp.lft.verifications-2023.0.0.jar -DpomFile=com.hp.lft.verifications-2023.0.0-pom.xml
```

### Install java docs

```
mvn install:install-file -Dfile=com.hp.lft.sdk-2023.0.0-javadoc.jar  -DgroupId=com.hp.lft -DartifactId=sdk -Dversion=2023.0.0 -Dpackaging=jar -Dclassifier=javadoc
mvn install:install-file -Dfile=com.hp.lft.report-2023.0.0-javadoc.jar -DgroupId=com.hp.lft -DartifactId=report -Dversion=2023.0.0 -Dpackaging=jar -Dclassifier=javadoc
mvn install:install-file -Dfile=com.hp.lft.unittesting-2023.0.0-javadoc.jar -DgroupId=com.hp.lft -DartifactId=unittesting -Dversion=2023.0.0 -Dpackaging=jar -Dclassifier=javadoc
mvn install:install-file -Dfile=com.hp.lft.verifications-2023.0.0-javadoc.jar -DgroupId=com.hp.lft -DartifactId=verifications -Dversion=2023.0.0 -Dpackaging=jar -Dclassifier=javadoc
```


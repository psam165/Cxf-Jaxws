1) CXF Maven dependencies
<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-frontend-jaxws</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-transports-http</artifactId>
			<version>${cxf.version}</version>
		</dependency>
		
2) Above dependency declaration will include

aopalliance-1.0.jar
asm-2.2.3.jar
commons-lang-2.5.jar
commons-logging-1.1.1.jar
cxf-api-2.2.11.jar
cxf-common-schemas-2.2.11.jar
cxf-common-utilities-2.2.11.jar
cxf-rt-bindings-soap-2.2.11.jar
cxf-rt-bindings-xml-2.2.11.jar
cxf-rt-core-2.2.11.jar
cxf-rt-databinding-jaxb-2.2.11.jar
cxf-rt-frontend-jaxws-2.2.11.jar
cxf-rt-frontend-simple-2.2.11.jar
cxf-rt-transports-http-2.2.11.jar
cxf-rt-ws-addr-2.2.11.jar
cxf-tools-common-2.2.11.jar
geronimo-activation_1.1_spec-1.0.2.jar
geronimo-annotation_1.0_spec-1.1.1.jar
geronimo-javamail_1.4_spec-1.6.jar
geronimo-jaxws_2.1_spec-1.0.jar
geronimo-stax-api_1.0_spec-1.0.1.jar
geronimo-ws-metadata_2.0_spec-1.1.2.jar
jaxb-api-2.1.jar
jaxb-impl-2.1.13.jar
neethi-2.0.4.jar
saaj-api-1.3.jar
saaj-impl-1.3.2.jar
spring-beans-2.5.6.jar
spring-context-2.5.6.jar
spring-core-2.5.6.jar
spring-web-2.5.6.jar
wsdl4j-1.6.2.jar
wstx-asl-3.2.9.jar
xml-resolver-1.2.jar
XmlSchema-1.4.7.jar

3)   <!-- Needed to avoid ServiceConstructionException: Could not resolve a binding for http://www.w3.org/2003/05/soap/bindings/HTTP/ -->
    <import resource="classpath:META-INF/cxf/cxf-extension-soap.xml" /> 

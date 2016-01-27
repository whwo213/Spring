server.xml

<GlobalNamingResources>
    <!-- Editable user database that can also be used by
         UserDatabaseRealm to authenticate users
    -->
    <Resource name="UserDatabase" auth="Container"
              type="org.apache.catalina.UserDatabase"
              description="User database that can be updated and saved"
              factory="org.apache.catalina.users.MemoryUserDatabaseFactory"
              pathname="conf/tomcat-users.xml" />
       <!--  <Resource name="jdbc/Oracle"
                auth="Container"
                type="javax.sql.DataSource"
                factory="org.apache.tomcat.jdbc.pool.DataSourceFactory"
                maxActive="100"
                minIdle="10"
                maxWait="10000"
                initialSize="10"
                validationQuery="SELECT 1 FROM DUAL"
                driverClassName="oracle.jdbc.driver.OracleDriver"
                defaultAutoCommit="false"
                username="C##APPLE6268"
                password="rave6268"
                url="jdbc:oracle:thin:@localhost:1521/ORCL" /> -->
				<!-- <Resource name="jdbc/Oracle"
				                auth="Container"
				                type="javax.sql.DataSource"
				                factory="org.apache.tomcat.jdbc.pool.DataSourceFactory"
				                maxActive="100"
				                minIdle="10"
				                maxWait="10000"
				                initialSize="10"
				                validationQuery="SELECT 1 FROM DUAL"
				                driverClassName="oracle.jdbc.driver.OracleDriver"
				                defaultAutoCommit="false"
				                username="schuser"
				                password="schuser"
				                url="jdbc:oracle:thin:@118.219.7.137:1521:SCHORA" /> -->
      <!--<Resource name="jdbc/Mysql"-->
                <!--auth="Container"-->
                <!--type="javax.sql.DataSource"-->
                <!--factory="org.apache.tomcat.jdbc.pool.DataSourceFactory"-->
                <!--maxActive="100"-->
                <!--minIdle="10"-->
                <!--maxWait="10000"-->
                <!--initialSize="10"-->
                <!--validationQuery="SELECT 1 FROM DUAL"-->
                <!--driverClassName="com.mysql.jdbc.Driver"-->
                <!--defaultAutoCommit="false"-->
                <!--username="root"-->
                <!--password="rave6268"-->
                <!--url="jdbc:mysql://localhost:3306/test" />-->

  </GlobalNamingResources>
  
  
  
  
  
  
  
  
  
  
context.xml

<!-- <ResourceLink global="jdbc/Oracle" name="jdbc/Oracle"
    type="javax.sql.DataSource" />  -->
    <!--<ResourceLink global="jdbc/Mysql" name="jdbc/Mysql"-->
    <!--type="javax.sql.DataSource" />-->

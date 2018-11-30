# spark-maven-plugin

                <plugin>
                  <groupId>net.oneqay</groupId>
                  <artifactId>spark-maven-plugin</artifactId>
                  <version>0.0.1-SNAPSHOT</version>
                  <executions>
                    <execution>
                      <id>start-spark</id>
                      <phase>pre-integration-test</phase>
                      <goals>
                        <goal>start-server</goal>
                      </goals>
                      <configuration>
                        <port>4567</port>
                        <directory>${project.basedir}/testdata</directory>
                      </configuration>
                    </execution>
                    <execution>
                      <id>stop-spark</id>
                      <phase>post-integration-test</phase>
                      <goals>
                        <goal>stop-server</goal>
                      </goals>
                    </execution>
                  </executions>
                </plugin>

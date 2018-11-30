package net.oneqay.mavensparkplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import spark.Spark;

@Mojo(name = "stop-server")
public class StopSpark extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Stop Spark Server");
        Spark.stop();
    }

}

package net.oneqay.mavensparkplugin;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import spark.Spark;

@Mojo(name = "start-server")
public class StartSpark extends AbstractMojo {

    @Parameter(property = "port", defaultValue = "8080")
    private int port;

    @Parameter(property = "directory", defaultValue = "/tmp")
    private String directory;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Start Spark Server");
        getLog().debug("Serving directory: " + directory);
        final File dir = new File(directory);
        if (!dir.exists()) {
            getLog().error(directory + ": do not exist!");
            throw new MojoExecutionException(directory + ": not found");
        }
        Spark.externalStaticFileLocation(directory);
        Spark.port(port);
        Spark.init();
    }

}

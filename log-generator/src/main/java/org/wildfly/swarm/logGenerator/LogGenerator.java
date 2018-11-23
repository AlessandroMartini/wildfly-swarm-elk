package org.wildfly.swarm.logGenerator;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class LogGenerator {

  private static final Logger LOG = Logger.getLogger(LogGenerator.class);

  @GET
  @Path("/debug")
  public String debug() {
    LOG.debug("DEBUG message");
    return "DEBUG message";
  }

  @GET
  @Path("/info")
  public String info() {
    LOG.info("WARN message");
    return "WARN message";
  }

  @GET
  @Path("/warn")
  public String warn() {
    LOG.warn("WARN message");
    return "WARN message";
  }

  @GET
  @Path("/error")
  public String error() {
    LOG.error("ERROR message");
    return "ERROR message";
  }

  @GET
  @Path("/exception")
  public String exception() {
    throw new RuntimeException("uh-oh");
  }

}

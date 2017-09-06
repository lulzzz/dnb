package net.apispark.webapi.resource;

public interface ApiRatelimitResource {

    /**
     * How am I doing? Am I near my limit? .
     *
     * @return  {@link net.apispark.webapi.representation.StringList} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    @org.restlet.resource.Get
    net.apispark.webapi.representation.StringList getApiRatelimit();

}
package net.apispark.webapi.resource;

public interface TransactionsCategoryMccAccountResource {

    /**
     * 
     *
     * @return  {@link net.apispark.webapi.representation.TransactionList} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    @org.restlet.resource.Get
    net.apispark.webapi.representation.TransactionList getTransactionsCategoryMccAccount();

}
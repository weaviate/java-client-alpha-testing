package io.weaviate;

import io.weaviate.client6.Config;
import io.weaviate.client6.WeaviateClient;

public class Step1_ConnectToWeaviate {
    public static WeaviateClient run() {
        // Connect to the local Weaviate instance and return the Client object
        // Connection details {scheme: "http", httpHost: "localhost:8080", grpcHost: "localhost:50051"}
        // 
        // See Weaviate docs: 
        //      Connect to Weaviate: https://java-client-v6--weaviate-docs.netlify.app/docs/weaviate/connections/connect-local#no-authentication-enabled
        return null;
    }
}
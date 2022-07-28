package com.cabas.config;

public class EndpointURLs {

    //Root
    public static final String TEMPLATE = "/template";

    //TODO  change controllers to use these variables
    //Endpoints
    public static final String TEST_STRING = TEMPLATE + "/test-string";
    public static final String TEMPLATE_ENTITIES = TEMPLATE + "/template-entities";

    public static String getUrls(){
        return String.join("\n",
                TEST_STRING
        );
    }

}

package com.cabas.controller;

import com.cabas.persistance.entity.TemplateEntity;
import com.cabas.config.EndpointURLs;
import com.cabas.persistance.repository.TemplateEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemplateController {

    @Autowired
    TemplateEntityRepository repository;


    @RequestMapping(
            value = EndpointURLs.TEST_STRING,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String testString() {
        return "{ \"value\" : \"Test string\"}";
    }

    @RequestMapping(
            value = EndpointURLs.TEMPLATE_ENTITIES,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TemplateEntity> templateEntities() {
        return repository.findAll();
    }

    @RequestMapping(
            value = EndpointURLs.TEMPLATE_ENTITIES,
            method = RequestMethod.GET,
            params = {"id"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public TemplateEntity getEntityById(@RequestParam("id") String id){
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(
            value = EndpointURLs.TEMPLATE_ENTITIES,
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<TemplateEntity> postTemplateEntities(@RequestBody List<TemplateEntity> body){
        repository.deleteAll();
        repository.saveAll(body);
        return repository.findAll();
    }
}

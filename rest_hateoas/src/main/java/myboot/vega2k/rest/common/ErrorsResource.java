package myboot.vega2k.rest.common;

import org.springframework.hateoas.Link;
import org.springframework.validation.Errors;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import myboot.vega2k.rest.index.IndexController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import org.springframework.hateoas.EntityModel;

public class ErrorsResource extends EntityModel<Errors> {
	@JsonUnwrapped
	private Errors errors;
	
    public ErrorsResource(Errors content) {
        //EntityModel.of(content, links);
    	this.errors = content;
        add(linkTo(methodOn(IndexController.class).index()).withRel("index"));
    }
    
}
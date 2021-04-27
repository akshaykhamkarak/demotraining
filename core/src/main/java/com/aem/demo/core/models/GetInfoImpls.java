package com.aem.demo.core.models;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = GetInfos.class, 
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class GetInfoImpls implements GetInfos {
	@Inject
Resource componentResource;
	@ValueMapValue
	@Default(values = "akshay")
	private String name;
	@ValueMapValue
	int mark;
	@ValueMapValue
	private List<String>books;
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getMark() {
		// TODO Auto-generated method stub
		return mark;
	}

	@Override
	public List<String> getAuthorBooks() {
		if(books!=null) {
			return new ArrayList<String>(books);
		}
		else {
			return Collections.emptyList();
		}
	}



}
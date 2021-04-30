package com.aem.demo.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = CodeChallenge.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CodeChallengeImpl implements CodeChallenge {

	@ValueMapValue
	@Default(values="put the name:")
	private String name;
	
	@ValueMapValue
	int mark;
	@ValueMapValue
	boolean gender;
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
	public List<String> getBooks() {
	if(books!=null)
		return new ArrayList<String>(books);
	else
		return Collections.emptyList();
	}

	

	
}

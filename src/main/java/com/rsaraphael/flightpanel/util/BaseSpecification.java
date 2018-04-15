package com.rsaraphael.flightpanel.util;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

/**
 * Class responsible to abstract some common logic used in Specification.
 *
 * @author Raphael Alves
 */
public abstract class BaseSpecification<T> implements Specification<T> {
	
	private static final long serialVersionUID = 1L;

	protected Path<?> preparePath(String path, Root<?> root, Join<?, ?> join) {
        String[] p = {path};
        if(path.contains(".")) {
            p = path.split("\\.");
        }
        Path<?> pathObj = join.get(p[0]);	
        for (int i = 1; i < p.length; i++) {
            pathObj = pathObj.get(p[i]);
        }
        return pathObj;
    }
    
    protected String startsOrEndsWith(final String searchTerm) {
        return new StringBuilder()
            .append("%")
            .append(searchTerm.toLowerCase())
            .append("%")
            .toString();
    }

	
}

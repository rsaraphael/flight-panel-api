package com.rsaraphael.flightpanel.itinerary;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import com.rsaraphael.flightpanel.util.BaseSpecification;

public class ItineraryLikeFilter<T> extends BaseSpecification<T> {

	private static final long serialVersionUID = 1L;
	protected String value;
	protected String path;

	public ItineraryLikeFilter(final String value, final String path) {
		this.value = value;
		this.path = path;
	}

	@Override
	public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		if (StringUtils.isEmpty(value)) {
			return null;
		}
		Expression<String> exp = preparePath(path, root, root.join("itineraries")).as(String.class);
		return criteriaBuilder.like(criteriaBuilder.lower(exp), startsOrEndsWith(value));
	}

}

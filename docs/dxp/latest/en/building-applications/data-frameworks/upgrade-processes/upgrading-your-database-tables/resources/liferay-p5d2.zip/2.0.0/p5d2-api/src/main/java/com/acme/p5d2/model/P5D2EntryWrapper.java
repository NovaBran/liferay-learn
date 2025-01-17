/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.acme.p5d2.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link P5D2Entry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see P5D2Entry
 * @generated
 */
public class P5D2EntryWrapper
	extends BaseModelWrapper<P5D2Entry>
	implements ModelWrapper<P5D2Entry>, P5D2Entry {

	public P5D2EntryWrapper(P5D2Entry p5d2Entry) {
		super(p5d2Entry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("p5d2EntryId", getP5d2EntryId());
		attributes.put("able", getAble());
		attributes.put("bar", getBar());
		attributes.put("charlie", getCharlie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long p5d2EntryId = (Long)attributes.get("p5d2EntryId");

		if (p5d2EntryId != null) {
			setP5d2EntryId(p5d2EntryId);
		}

		Date able = (Date)attributes.get("able");

		if (able != null) {
			setAble(able);
		}

		String bar = (String)attributes.get("bar");

		if (bar != null) {
			setBar(bar);
		}

		String charlie = (String)attributes.get("charlie");

		if (charlie != null) {
			setCharlie(charlie);
		}
	}

	@Override
	public P5D2Entry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the able of this p5d2 entry.
	 *
	 * @return the able of this p5d2 entry
	 */
	@Override
	public Date getAble() {
		return model.getAble();
	}

	/**
	 * Returns the bar of this p5d2 entry.
	 *
	 * @return the bar of this p5d2 entry
	 */
	@Override
	public String getBar() {
		return model.getBar();
	}

	/**
	 * Returns the charlie of this p5d2 entry.
	 *
	 * @return the charlie of this p5d2 entry
	 */
	@Override
	public String getCharlie() {
		return model.getCharlie();
	}

	/**
	 * Returns the p5d2 entry ID of this p5d2 entry.
	 *
	 * @return the p5d2 entry ID of this p5d2 entry
	 */
	@Override
	public long getP5d2EntryId() {
		return model.getP5d2EntryId();
	}

	/**
	 * Returns the primary key of this p5d2 entry.
	 *
	 * @return the primary key of this p5d2 entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the able of this p5d2 entry.
	 *
	 * @param able the able of this p5d2 entry
	 */
	@Override
	public void setAble(Date able) {
		model.setAble(able);
	}

	/**
	 * Sets the bar of this p5d2 entry.
	 *
	 * @param bar the bar of this p5d2 entry
	 */
	@Override
	public void setBar(String bar) {
		model.setBar(bar);
	}

	/**
	 * Sets the charlie of this p5d2 entry.
	 *
	 * @param charlie the charlie of this p5d2 entry
	 */
	@Override
	public void setCharlie(String charlie) {
		model.setCharlie(charlie);
	}

	/**
	 * Sets the p5d2 entry ID of this p5d2 entry.
	 *
	 * @param p5d2EntryId the p5d2 entry ID of this p5d2 entry
	 */
	@Override
	public void setP5d2EntryId(long p5d2EntryId) {
		model.setP5d2EntryId(p5d2EntryId);
	}

	/**
	 * Sets the primary key of this p5d2 entry.
	 *
	 * @param primaryKey the primary key of this p5d2 entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected P5D2EntryWrapper wrap(P5D2Entry p5d2Entry) {
		return new P5D2EntryWrapper(p5d2Entry);
	}

}
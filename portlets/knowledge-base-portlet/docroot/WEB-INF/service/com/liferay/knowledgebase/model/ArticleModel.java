/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.knowledgebase.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Article service. Represents a row in the &quot;KB_Article&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.ArticleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.ArticleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Article
 * @see com.liferay.knowledgebase.model.impl.ArticleImpl
 * @see com.liferay.knowledgebase.model.impl.ArticleModelImpl
 * @generated
 */
public interface ArticleModel extends BaseModel<Article> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a article model instance should use the {@link Article} interface instead.
	 */

	/**
	 * Gets the primary key of this article.
	 *
	 * @return the primary key of this article
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this article
	 *
	 * @param pk the primary key of this article
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this article.
	 *
	 * @return the uuid of this article
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this article.
	 *
	 * @param uuid the uuid of this article
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the article ID of this article.
	 *
	 * @return the article ID of this article
	 */
	public long getArticleId();

	/**
	 * Sets the article ID of this article.
	 *
	 * @param articleId the article ID of this article
	 */
	public void setArticleId(long articleId);

	/**
	 * Gets the resource prim key of this article.
	 *
	 * @return the resource prim key of this article
	 */
	public long getResourcePrimKey();

	/**
	 * Sets the resource prim key of this article.
	 *
	 * @param resourcePrimKey the resource prim key of this article
	 */
	public void setResourcePrimKey(long resourcePrimKey);

	/**
	 * Gets the group ID of this article.
	 *
	 * @return the group ID of this article
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this article.
	 *
	 * @param groupId the group ID of this article
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this article.
	 *
	 * @return the company ID of this article
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this article.
	 *
	 * @param companyId the company ID of this article
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this article.
	 *
	 * @return the user ID of this article
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this article.
	 *
	 * @param userId the user ID of this article
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this article.
	 *
	 * @return the user uuid of this article
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this article.
	 *
	 * @param userUuid the user uuid of this article
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this article.
	 *
	 * @return the user name of this article
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this article.
	 *
	 * @param userName the user name of this article
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this article.
	 *
	 * @return the create date of this article
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this article.
	 *
	 * @param createDate the create date of this article
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this article.
	 *
	 * @return the modified date of this article
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this article.
	 *
	 * @param modifiedDate the modified date of this article
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the parent resource prim key of this article.
	 *
	 * @return the parent resource prim key of this article
	 */
	public long getParentResourcePrimKey();

	/**
	 * Sets the parent resource prim key of this article.
	 *
	 * @param parentResourcePrimKey the parent resource prim key of this article
	 */
	public void setParentResourcePrimKey(long parentResourcePrimKey);

	/**
	 * Gets the version of this article.
	 *
	 * @return the version of this article
	 */
	public int getVersion();

	/**
	 * Sets the version of this article.
	 *
	 * @param version the version of this article
	 */
	public void setVersion(int version);

	/**
	 * Gets the title of this article.
	 *
	 * @return the title of this article
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this article.
	 *
	 * @param title the title of this article
	 */
	public void setTitle(String title);

	/**
	 * Gets the content of this article.
	 *
	 * @return the content of this article
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this article.
	 *
	 * @param content the content of this article
	 */
	public void setContent(String content);

	/**
	 * Gets the description of this article.
	 *
	 * @return the description of this article
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this article.
	 *
	 * @param description the description of this article
	 */
	public void setDescription(String description);

	/**
	 * Gets the priority of this article.
	 *
	 * @return the priority of this article
	 */
	public int getPriority();

	/**
	 * Sets the priority of this article.
	 *
	 * @param priority the priority of this article
	 */
	public void setPriority(int priority);

	/**
	 * Gets the latest of this article.
	 *
	 * @return the latest of this article
	 */
	public int getLatest();

	/**
	 * Sets the latest of this article.
	 *
	 * @param latest the latest of this article
	 */
	public void setLatest(int latest);

	/**
	 * Gets the status of this article.
	 *
	 * @return the status of this article
	 */
	public int getStatus();

	/**
	 * Sets the status of this article.
	 *
	 * @param status the status of this article
	 */
	public void setStatus(int status);

	/**
	 * Gets the status by user ID of this article.
	 *
	 * @return the status by user ID of this article
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this article.
	 *
	 * @param statusByUserId the status by user ID of this article
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Gets the status by user uuid of this article.
	 *
	 * @return the status by user uuid of this article
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this article.
	 *
	 * @param statusByUserUuid the status by user uuid of this article
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Gets the status by user name of this article.
	 *
	 * @return the status by user name of this article
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this article.
	 *
	 * @param statusByUserName the status by user name of this article
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Gets the status date of this article.
	 *
	 * @return the status date of this article
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this article.
	 *
	 * @param statusDate the status date of this article
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated {@link #isApproved}
	 */
	public boolean getApproved();

	/**
	 * Determines if this article is approved.
	 *
	 * @return <code>true</code> if this article is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines if this article is a draft.
	 *
	 * @return <code>true</code> if this article is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines if this article is expired.
	 *
	 * @return <code>true</code> if this article is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines if this article is pending.
	 *
	 * @return <code>true</code> if this article is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Article article);

	public int hashCode();

	public Article toEscapedModel();

	public String toString();

	public String toXmlString();
}
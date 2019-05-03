/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.learning.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.learning.fulfilmentprocess.constants.LearningFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class LearningFulfilmentProcessManager extends GeneratedLearningFulfilmentProcessManager
{
	public static final LearningFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (LearningFulfilmentProcessManager) em.getExtension(LearningFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}

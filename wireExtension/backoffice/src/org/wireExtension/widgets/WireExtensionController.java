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
package org.wireExtension.widgets;

import com.hybris.cockpitng.core.model.WidgetModel;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;

import com.hybris.cockpitng.util.DefaultWidgetController;

import org.wireExtension.services.WireExtensionService;


public class WireExtensionController extends DefaultWidgetController
{
	private static final long serialVersionUID = 1L;
	private Label label;

	@WireVariable
	private transient WireExtensionService wireExtensionService;

	@Override
	public void initialize(final Component comp)
	{
		super.initialize(comp);
		label.setValue(wireExtensionService.getHello());

		WidgetModel model = getModel();

	}
}

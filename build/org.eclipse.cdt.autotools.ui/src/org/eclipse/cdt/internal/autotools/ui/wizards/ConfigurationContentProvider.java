/*******************************************************************************
 * Copyright (c) 2002, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Rational Software - Initial API and implementation
 * Red Hat Inc. - Copy from CDT 3.1.2 to here
 *******************************************************************************/
package org.eclipse.cdt.internal.autotools.ui.wizards;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ConfigurationContentProvider implements IStructuredContentProvider {
	// The contents of the parent of the table is a list of configurations
	@Override
	public Object[] getElements(Object parent) {
		// The content is an array of configurations
		Object array[] = (Object[])parent;
		return (array == null || array.length == 0) ? new Object[0] : array;
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(
		Viewer viewer,
		Object oldInput,
		Object newInput) {
	}
}

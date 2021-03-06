/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi.ejb.apps.aroundconstruct.interceptors;

import javax.annotation.Priority;
import javax.interceptor.Interceptor;

@Interceptor
@DirectlyIntercepted
@Priority(Interceptor.Priority.APPLICATION)
public class DirectBindingConstructInterceptor extends SuperConstructInterceptor {}

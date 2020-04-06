/*******************************************************************************
 * Copyright (c) 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package cdi.interceptors.currency;

import javax.enterprise.context.ApplicationScoped;

import cdi.beans.v2.log.Log;

/**
 * Injectable currency event log.
 */
@ApplicationScoped
public class CurrencyExchangeEventLog extends Log {
    //
    private static final long serialVersionUID = 1L;

    //
    public CurrencyExchangeEventLog() {
        super();
    }
}
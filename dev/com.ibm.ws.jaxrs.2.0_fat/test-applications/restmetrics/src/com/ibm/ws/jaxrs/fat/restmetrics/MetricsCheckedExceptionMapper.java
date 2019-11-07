/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.jaxrs.fat.restmetrics;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MetricsCheckedExceptionMapper implements ExceptionMapper<MetricsMappedCheckedException> {

    @Context
    private HttpServletRequest httpServletRequest;

    public MetricsCheckedExceptionMapper() {
    }

    @Override
    public Response toResponse(MetricsMappedCheckedException ex) {
        System.out.println("Jim!!!   in MetricsCheckedExceptionMapper");
        return Response.status(200).entity(ex.getMessage()).type("text/plain").build();
        }

}
package org.nuxeo.ecm.restapi.server.jaxrs.usermanager;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.nuxeo.ecm.core.api.NuxeoPrincipal;
import org.nuxeo.ecm.platform.usermanager.UserManager;
import org.nuxeo.ecm.webengine.model.WebObject;
import org.nuxeo.ecm.webengine.model.impl.DefaultObject;
import org.nuxeo.runtime.api.Framework;

@WebObject(type = "me")
@Produces({ MediaType.APPLICATION_JSON })
public class CustomMeObject extends MeObject {

    private static final Log log = LogFactory.getLog(CustomMeObject.class);
    
    @GET
    public NuxeoPrincipal doGet(@Context Request request) {
        log.warn("<doGet>");
        return super.doGet(request);
    }

    @PUT
    @Path("changepassword")
    public Object changePassword(String payload) throws JSONException {
        log.warn("<changePassword>");
        return super.changePassword(payload);
    }

}

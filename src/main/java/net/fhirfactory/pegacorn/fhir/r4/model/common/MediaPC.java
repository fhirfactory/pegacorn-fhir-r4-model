/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fhirfactory.pegacorn.fhir.r4.model.common;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import org.hl7.fhir.r4.model.Media;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.PractitionerRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mark A. Hunter (ACT Health)
 */
@ResourceDef(name = "MediaPC", profile = "http://hl7.org/fhir/profiles/custom-resource")
public class MediaPC extends Media
{
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = LoggerFactory.getLogger(MediaPC.class);

    @Override
    public MediaPC copy()
    {
        MediaPC retVal = new MediaPC();
        super.copyValues(retVal);
        return (retVal);
    }

    public MediaPC()
    {
        super();
        FhirContext ctx = FhirContext.forR4();
        ctx.registerCustomType(GroupPC.class);
    }    
}

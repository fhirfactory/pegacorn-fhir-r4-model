/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fhirfactory.pegacorn.fhir.r4.model.common;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import org.hl7.fhir.r4.model.Organization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mark A. Hunter (ACT Health)
 */
@ResourceDef(name = "OrganisationPC", profile = "http://hl7.org/fhir/profiles/custom-resource")
public class OrganisationPC extends Organization
{
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = LoggerFactory.getLogger(OrganisationPC.class);
//    private static final GroupExtensionMeanings pegacornGroupExtensionMeanings = new GroupExtensionMeanings();

    @Override
    public OrganisationPC copy()
    {
        OrganisationPC retVal = new OrganisationPC();
        super.copyValues(retVal);
        return (retVal);
    }

    public OrganisationPC()
    {
        super();
        FhirContext ctx = FhirContext.forR4();
        ctx.registerCustomType(GroupPC.class);
    }    
}

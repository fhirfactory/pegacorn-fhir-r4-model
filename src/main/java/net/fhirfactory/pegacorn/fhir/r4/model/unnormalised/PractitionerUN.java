/* 
 * The MIT License
 *
 * Copyright 2020 Mark A. Hunter (ACT Health).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.fhirfactory.pegacorn.fhir.r4.model.unnormalised;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import net.fhirfactory.pegacorn.fhir.r4.model.common.PractitionerPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ACT Health
 */
@ResourceDef(name = "PractitionerUN", profile = "http://hl7.org/fhir/profiles/custom-resource")
public class PractitionerUN extends PractitionerPC
{
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = LoggerFactory.getLogger(PractitionerUN.class);

    @Override
    public PractitionerUN copy()
    {
        PractitionerUN retVal = new PractitionerUN();
        super.copyValues(retVal);
        return (retVal);
    }

    public PractitionerUN()
    {
        super();
        FhirContext ctx = FhirContext.forR4();
        ctx.registerCustomType(PractitionerUN.class);
    }     
}

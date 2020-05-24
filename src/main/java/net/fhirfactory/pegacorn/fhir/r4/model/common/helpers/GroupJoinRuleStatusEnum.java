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
package net.fhirfactory.pegacorn.fhir.r4.model.common.helpers;

/**
 *
 * @author Mark A. Hunter (ACT Health)
 * @since 2020-05-09
 */
public enum GroupJoinRuleStatusEnum
{
    JOINRULE_STATUS_PUBLIC("Pegacorn.FHIR.R4.Group.JoinRule.PUBLIC"),
    JOINRULE_STATUS_KNOCK("Pegacorn.FHIR.R4.Group.JoinRule.KNOCK"),
    JOINRULE_STATUS_INVITE("Pegacorn.FHIR.R4.Group.JoinRule.INVITE"),
    JOINRULE_STATUS_PRIVATE("Pegacorn.FHIR.R4.Group.JoinRule.PRIVATE");
    
    private String joinruleStatus;
    
    private GroupJoinRuleStatusEnum(String newJoinRuleStatus ){
        this.joinruleStatus = newJoinRuleStatus;
    }
    
    public String getJoinRuleStatus(){
        return(this.joinruleStatus);
    }
}

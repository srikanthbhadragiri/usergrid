/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */
package org.apache.usergrid.persistence.collection.exception;


import org.apache.usergrid.persistence.collection.MvccEntity;
import org.apache.usergrid.persistence.core.scope.ApplicationScope;


public class WriteStartException extends CollectionRuntimeException {


    public WriteStartException( MvccEntity entity, ApplicationScope scope, final String message ) {
        super( entity, scope, message );
    }


    public WriteStartException( MvccEntity entity, ApplicationScope scope, final String message, final Throwable cause ) {
        super( entity, scope, message, cause );
    }


    public WriteStartException( MvccEntity entity, ApplicationScope scope, final Throwable cause ) {
        super( entity, scope, cause );
    }


    public WriteStartException( MvccEntity entity, ApplicationScope scope, final String message, final Throwable cause, final boolean enableSuppression,
                                       final boolean writableStackTrace ) {
        super( entity, scope, message, cause, enableSuppression, writableStackTrace );
    }
}

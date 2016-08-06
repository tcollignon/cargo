/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2016 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.util.log;

/**
 * Helper class for implementing {@link Loggable} methods.
 * 
 */
public class LoggedObject implements Loggable
{
    /**
     * The log used for logging.
     */
    private Logger log = new NullLogger();

    /**
     * {@inheritDoc}
     * @see Loggable#setLogger(Logger)
     */
    public void setLogger(Logger logger)
    {
        this.log = logger;
    }

    /**
     * {@inheritDoc}
     * @see Loggable#getLogger()
     */
    public Logger getLogger()
    {
        return this.log;
    }
}

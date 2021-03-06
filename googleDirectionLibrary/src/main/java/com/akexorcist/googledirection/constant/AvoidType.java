/*

Copyright 2015 Akexorcist

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

package com.akexorcist.googledirection.constant;

/**
 * Route restriction to avoid.
 *
 * @since 1.0.0
 */
public class AvoidType {
    /**
     * Indicates that the calculated route should avoid toll roads/bridges.
     *
     * @since 1.0.0
     */
    public static final String TOLLS = "tolls";
    /**
     * Indicates that the calculated route should avoid highways.
     *
     * @since 1.0.0
     */
    public static final String HIGHWAYS = "highways";
    /**
     * Indicates that the calculated route should avoid ferries.
     *
     * @since 1.0.0
     */
    public static final String FERRIES = "ferries";
    /**
     * Indicates that the calculated route should avoid indoor
     * steps for walking and transit directions.
     *
     * @since 1.0.0
     */
    public static final String INDOOR = "indoor";
}

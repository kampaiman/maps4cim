/**
 * maps4cim - a real world map generator for CiM 2
 * Copyright 2013 Sebastian Straub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nx42.maps4cim.map.texture.osm.primitives;

import java.util.Collection;
import java.util.List;

import de.nx42.maps4cim.config.texture.ColorDef;
import de.nx42.maps4cim.config.texture.osm.WayDef;
import de.nx42.maps4cim.util.gis.Coordinate;


public class Polyline extends Polygon {

    protected double strokeWidth;   // default: 1.0


    // basic constructors

    public Polyline(List<Coordinate> nodes) {
        super(nodes);
        this.strokeWidth = 1.0;
    }

    public Polyline(List<Coordinate> nodes, WayDef def) {
        super(nodes);
        this.strokeWidth = def.getStrokeWidth();
    }

    // Constructors with color

    public Polyline(List<Coordinate> nodes, int color, double strokeWidth) {
        super(nodes, color);
        this.strokeWidth = strokeWidth;
    }

    public Polyline(List<Coordinate> nodes, int color) {
        this(nodes, color, 1.0);
    }

    public Polyline(List<Coordinate> nodes, ColorDef color) {
        super(nodes, color);
        this.strokeWidth = 1.0;
    }

    public Polyline(List<Coordinate> nodes, Collection<ColorDef> colors, WayDef def) {
        super(nodes, colors, def);
        this.strokeWidth = def.getStrokeWidth();
    }

    // getters

    /**
     * @return the strokeWidth
     */
    public double getStrokeWidth() {
        return strokeWidth;
    }

}

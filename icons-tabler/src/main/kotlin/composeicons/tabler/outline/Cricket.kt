package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = tablerOutlineIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.105 18.79l-1 .992c-1.595 1.581-4.156 1.61-5.787 .067C2.688 18.305 2.576 15.746 4.067 14.067l.157-.166L12.506 5.5 14.006 7 17.456 3.609c.79-.783 2.055-.806 2.873-.053 .818 .753 .899 2.016 .184 2.868l-.116 .126L17.006 10l1.5 1.5-3.668 3.617")
            addPathData("M10.5 7.5l6 6")
            addPathData("M11 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _cricket!!
    }

private var _cricket: ImageVector? = null

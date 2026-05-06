package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spaces: ImageVector
    get() {
        if (_spaces != null) return _spaces!!
        _spaces = tablerOutlineIcon(
            name = "Spaces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.045 9.777C3.677 11.117 2.507 13.883 3.195 16.516c.688 2.632 3.061 4.473 5.782 4.483 2.721 .011 5.108-1.811 5.816-4.438 .708-2.627-.44-5.402-2.798-6.76")
            addPathData("M11.997 20.196c2.289 1.323 5.174 .991 7.104-.816 1.929-1.807 2.448-4.665 1.278-7.035C19.208 9.974 16.624 8.649 14.016 9.082c-2.608 .433-4.625 2.522-4.967 5.144")
            addPathData("M17.95 9.785Q18 9.399 18 9C17.999 6.291 16.183 3.918 13.567 3.21 10.952 2.503 8.187 3.635 6.82 5.975c-1.367 2.339-.996 5.305 .904 7.236 1.901 1.931 4.859 2.349 7.22 1.019")
        }
        return _spaces!!
    }

private var _spaces: ImageVector? = null

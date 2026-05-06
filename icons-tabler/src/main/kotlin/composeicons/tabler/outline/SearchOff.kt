package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SearchOff: ImageVector
    get() {
        if (_searchOff != null) return _searchOff!!
        _searchOff = tablerOutlineIcon(
            name = "SearchOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.039 5.062c-2.731 2.737-2.727 7.169 .01 9.9 2.737 2.731 7.169 2.727 9.9-.01M16.533 12.518c.997-2.581 .38-5.508-1.575-7.466C13.003 3.093 10.078 2.47 7.495 3.461")
            addPathData("M3 3 21 21")
        }
        return _searchOff!!
    }

private var _searchOff: ImageVector? = null

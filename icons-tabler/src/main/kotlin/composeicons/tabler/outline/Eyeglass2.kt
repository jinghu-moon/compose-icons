package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Eyeglass2: ImageVector
    get() {
        if (_eyeglass2 != null) return _eyeglass2!!
        _eyeglass2 = tablerOutlineIcon(
            name = "Eyeglass2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h-2L3 14v2.5")
            addPathData("M16 4h2l3 10v2.5")
            addPathData("M10 16h4")
            addPathData("M14 16.5C14 18.433 15.567 20 17.5 20 19.433 20 21 18.433 21 16.5 21 14.567 19.433 13 17.5 13 15.567 13 14 14.567 14 16.5")
            addPathData("M3 16.5C3 18.433 4.567 20 6.5 20 8.433 20 10 18.433 10 16.5 10 14.567 8.433 13 6.5 13 4.567 13 3 14.567 3 16.5")
        }
        return _eyeglass2!!
    }

private var _eyeglass2: ImageVector? = null

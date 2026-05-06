package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ListCheck: ImageVector
    get() {
        if (_listCheck != null) return _listCheck!!
        _listCheck = tablerOutlineIcon(
            name = "ListCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.5 5.5 5 7 7.5 4.5")
            addPathData("M3.5 11.5 5 13 7.5 10.5")
            addPathData("M3.5 17.5 5 19 7.5 16.5")
            addPathData("M11 6h9")
            addPathData("M11 12h9")
            addPathData("M11 18h9")
        }
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null

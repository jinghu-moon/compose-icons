package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrossOff: ImageVector
    get() {
        if (_crossOff != null) return _crossOff!!
        _crossOff = tablerOutlineIcon(
            name = "CrossOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h3v-4h-5v-5h-4v3M8 8h-3v4h5v9h4v-7")
            addPathData("M3 3 21 21")
        }
        return _crossOff!!
    }

private var _crossOff: ImageVector? = null

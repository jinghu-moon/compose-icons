package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DialpadOff: ImageVector
    get() {
        if (_dialpadOff != null) return _dialpadOff!!
        _dialpadOff = tablerOutlineIcon(
            name = "DialpadOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h-4v-4")
            addPathData("M17 3h4v4h-4v-4")
            addPathData("M10 6v-3h4v4h-3")
            addPathData("M3 10h4v4h-4v-4")
            addPathData("M17 13v-3h4v4h-3")
            addPathData("M14 14h-4v-4")
            addPathData("M10 17h4v4h-4v-4")
            addPathData("M3 3 21 21")
        }
        return _dialpadOff!!
    }

private var _dialpadOff: ImageVector? = null

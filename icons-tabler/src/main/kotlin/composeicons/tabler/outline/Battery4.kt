package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Battery4: ImageVector
    get() {
        if (_battery4 != null) return _battery4!!
        _battery4 = tablerOutlineIcon(
            name = "Battery4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 7h11c1.105 0 2 .895 2 2v.5c0 .276 .224 .5 .5 .5 .276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5 .224-.5 .5v.5c0 1.105-.895 2-2 2h-11C4.895 17 4 16.105 4 15v-6C4 7.895 4.895 7 6 7")
            addPathData("M7 10v4")
            addPathData("M10 10v4")
            addPathData("M13 10v4")
            addPathData("M16 10v4")
        }
        return _battery4!!
    }

private var _battery4: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExposureMinus1: ImageVector
    get() {
        if (_exposureMinus1 != null) return _exposureMinus1!!
        _exposureMinus1 = tablerOutlineIcon(
            name = "ExposureMinus1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h6")
            addPathData("M18 19v-14L14 9")
        }
        return _exposureMinus1!!
    }

private var _exposureMinus1: ImageVector? = null

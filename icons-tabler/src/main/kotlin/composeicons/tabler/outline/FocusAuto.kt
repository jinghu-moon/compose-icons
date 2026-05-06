package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FocusAuto: ImageVector
    get() {
        if (_focusAuto != null) return _focusAuto!!
        _focusAuto = tablerOutlineIcon(
            name = "FocusAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M10 15v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M10 13h4")
        }
        return _focusAuto!!
    }

private var _focusAuto: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CraneOff: ImageVector
    get() {
        if (_craneOff != null) return _craneOff!!
        _craneOff = tablerOutlineIcon(
            name = "CraneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21h6")
            addPathData("M9 21v-12")
            addPathData("M9 5v-2L8 4")
            addPathData("M6 6 3 9h6")
            addPathData("M13 9h8")
            addPathData("M9 3 19 9")
            addPathData("M17 9v4c1.105 0 2 .895 2 2M17 17c-1.105 0-2-.895-2-2")
            addPathData("M3 3 21 21")
        }
        return _craneOff!!
    }

private var _craneOff: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracketsAngleOff: ImageVector
    get() {
        if (_bracketsAngleOff != null) return _bracketsAngleOff!!
        _bracketsAngleOff = tablerOutlineIcon(
            name = "BracketsAngleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h.01")
            addPathData("M6.453 6.474 3 12l5 8")
            addPathData("M16 4l5 8-1.917 3.067")
            addPathData("M17.535 17.544 16 20")
            addPathData("M3 3 21 21")
        }
        return _bracketsAngleOff!!
    }

private var _bracketsAngleOff: ImageVector? = null

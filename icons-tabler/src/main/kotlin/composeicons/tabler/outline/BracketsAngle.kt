package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = tablerOutlineIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4 3 12l5 8")
            addPathData("M16 4l5 8-5 8")
        }
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null

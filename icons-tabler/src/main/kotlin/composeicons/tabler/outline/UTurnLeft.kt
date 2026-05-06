package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UTurnLeft: ImageVector
    get() {
        if (_uTurnLeft != null) return _uTurnLeft!!
        _uTurnLeft = tablerOutlineIcon(
            name = "UTurnLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 20v-11.5C17 6.015 14.985 4 12.5 4 10.015 4 8 6.015 8 8.5v8.5")
            addPathData("M11 14 8 17 5 14")
        }
        return _uTurnLeft!!
    }

private var _uTurnLeft: ImageVector? = null

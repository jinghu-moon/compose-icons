package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UTurnRight: ImageVector
    get() {
        if (_uTurnRight != null) return _uTurnRight!!
        _uTurnRight = tablerOutlineIcon(
            name = "UTurnRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20v-11.5C7 6.015 9.015 4 11.5 4 13.985 4 16 6.015 16 8.5v8.5")
            addPathData("M13 14l3 3 3-3")
        }
        return _uTurnRight!!
    }

private var _uTurnRight: ImageVector? = null

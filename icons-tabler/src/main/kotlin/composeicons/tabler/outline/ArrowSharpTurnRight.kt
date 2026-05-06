package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowSharpTurnRight: ImageVector
    get() {
        if (_arrowSharpTurnRight != null) return _arrowSharpTurnRight!!
        _arrowSharpTurnRight = tablerOutlineIcon(
            name = "ArrowSharpTurnRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18v-11.31c-0-.283 .171-.538 .432-.647 .262-.108 .563-.048 .763 .152L18 16")
            addPathData("M13 16h5v-5")
        }
        return _arrowSharpTurnRight!!
    }

private var _arrowSharpTurnRight: ImageVector? = null

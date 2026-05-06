package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowSharpTurnLeft: ImageVector
    get() {
        if (_arrowSharpTurnLeft != null) return _arrowSharpTurnLeft!!
        _arrowSharpTurnLeft = tablerOutlineIcon(
            name = "ArrowSharpTurnLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18v-11.31c0-.283-.171-.538-.432-.647-.262-.108-.563-.048-.763 .152L6 16")
            addPathData("M11 16h-5v-5")
        }
        return _arrowSharpTurnLeft!!
    }

private var _arrowSharpTurnLeft: ImageVector? = null

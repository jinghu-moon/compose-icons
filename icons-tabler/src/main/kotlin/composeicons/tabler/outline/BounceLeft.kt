package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) return _bounceLeft!!
        _bounceLeft = tablerOutlineIcon(
            name = "BounceLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 15.5C17 14.5 14.5 15 12 20 11.5 17 10.5 14.5 9 12")
            addPathData("M6 9C4.895 9 4 8.105 4 7 4 5.895 4.895 5 6 5c1.105 0 2 .895 2 2C8 8.105 7.105 9 6 9")
        }
        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null

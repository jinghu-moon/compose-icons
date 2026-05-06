package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMaxMin: ImageVector
    get() {
        if (_mathMaxMin != null) return _mathMaxMin!!
        _mathMaxMin = tablerOutlineIcon(
            name = "MathMaxMin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 5c0 1.105 .895 2 2 2C8.105 7 9 6.105 9 5 9 3.895 8.105 3 7 3 5.895 3 5 3.895 5 5")
            addPathData("M3 14C3 14 3.605 8.56 5.284 6.138M8.679 6.164c2.137 2.652 4.547 9.113 6.68 11.719")
            addPathData("M18.748 18.038C19.45 17.158 20.2 14.478 21 10")
        }
        return _mathMaxMin!!
    }

private var _mathMaxMin: ImageVector? = null

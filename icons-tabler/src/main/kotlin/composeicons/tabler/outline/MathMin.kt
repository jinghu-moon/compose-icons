package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMin: ImageVector
    get() {
        if (_mathMin != null) return _mathMin!!
        _mathMin = tablerOutlineIcon(
            name = "MathMin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 13C3 13 4 4 7 4c2.48 0 5.643 9.565 8.36 12.883")
            addPathData("M18.748 17.038C19.45 16.158 20.2 13.478 21 9")
        }
        return _mathMin!!
    }

private var _mathMin: ImageVector? = null

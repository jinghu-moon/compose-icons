package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRotaryLastLeft: ImageVector
    get() {
        if (_arrowRotaryLastLeft != null) return _arrowRotaryLastLeft!!
        _arrowRotaryLastLeft = tablerOutlineIcon(
            name = "ArrowRotaryLastLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3")
            addPathData("M15 15v6")
            addPathData("M12.5 9.5 6 3")
            addPathData("M11 3h-5v5")
        }
        return _arrowRotaryLastLeft!!
    }

private var _arrowRotaryLastLeft: ImageVector? = null

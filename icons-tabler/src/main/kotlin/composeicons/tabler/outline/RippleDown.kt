package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RippleDown: ImageVector
    get() {
        if (_rippleDown != null) return _rippleDown!!
        _rippleDown = tablerOutlineIcon(
            name = "RippleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7Q7.5 4 12 7q4.5 3 9 0")
            addPathData("M3 17q4.5-3 9 0 .213 .142 .427 .27")
            addPathData("M3 12q4.5-3 9 0 2.006 1.338 4.012 1.482")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _rippleDown!!
    }

private var _rippleDown: ImageVector? = null

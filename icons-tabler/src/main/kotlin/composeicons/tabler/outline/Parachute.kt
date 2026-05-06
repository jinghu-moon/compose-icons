package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = tablerOutlineIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12")
            addPathData("M22 12C22 10.34 20.54 9 18.75 9c-1.8 0-3.25 1.34-3.25 3C15.5 10.34 13.93 9 12 9 10.07 9 8.5 10.34 8.5 12 8.5 10.34 7.04 9 5.25 9 3.45 9 2 10.34 2 12")
            addPathData("M2 12 12 22 8.5 12")
            addPathData("M15.5 12 12 22 22 12")
        }
        return _parachute!!
    }

private var _parachute: ImageVector? = null

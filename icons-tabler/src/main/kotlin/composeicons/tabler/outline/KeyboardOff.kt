package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.KeyboardOff: ImageVector
    get() {
        if (_keyboardOff != null) return _keyboardOff!!
        _keyboardOff = tablerOutlineIcon(
            name = "KeyboardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 18h-14C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6h2M10 6h10c1.105 0 2 .895 2 2v8c0 .554-.226 1.056-.59 1.418")
            addPathData("M6 10v.01")
            addPathData("M10 10v.01")
            addPathData("M14 10v.01")
            addPathData("M18 10v.01")
            addPathData("M6 14v.01")
            addPathData("M18 14v.01")
            addPathData("M10 14h4")
            addPathData("M3 3 21 21")
        }
        return _keyboardOff!!
    }

private var _keyboardOff: ImageVector? = null

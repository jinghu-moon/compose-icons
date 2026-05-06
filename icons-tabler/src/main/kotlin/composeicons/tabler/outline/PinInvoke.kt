package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PinInvoke: ImageVector
    get() {
        if (_pinInvoke != null) return _pinInvoke!!
        _pinInvoke = tablerOutlineIcon(
            name = "PinInvoke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 13v5c0 .552-.448 1-1 1h-16C3.448 19 3 18.552 3 18v-12C3 5.448 3.448 5 4 5h9")
            addPathData("M17 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 5.895 20.105 5 19 5c-1.105 0-2 .895-2 2")
            addPathData("M10 11h4v4")
            addPathData("M10 15l4-4")
        }
        return _pinInvoke!!
    }

private var _pinInvoke: ImageVector? = null

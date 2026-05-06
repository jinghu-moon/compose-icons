package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clock24: ImageVector
    get() {
        if (_clock24 != null) return _clock24!!
        _clock24 = tablerOutlineIcon(
            name = "Clock24",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c-0 3.813 2.403 7.213 5.998 8.485M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 7v5")
            addPathData("M12 15h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h2")
            addPathData("M18 15v2c0 .552 .448 1 1 1h1")
            addPathData("M21 15v6")
        }
        return _clock24!!
    }

private var _clock24: ImageVector? = null

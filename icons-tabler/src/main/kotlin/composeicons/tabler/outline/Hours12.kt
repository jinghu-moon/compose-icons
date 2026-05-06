package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hours12: ImageVector
    get() {
        if (_hours12 != null) return _hours12!!
        _hours12 = tablerOutlineIcon(
            name = "Hours12",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11C19.497 7.383 16.636 4.549 13.014 4.082 9.391 3.614 5.905 5.629 4.5 9M4 5v4h4")
            addPathData("M4 13c.468 3.6 3.384 6.546 7 7")
            addPathData("M18 15h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h2")
            addPathData("M15 21v-6")
        }
        return _hours12!!
    }

private var _hours12: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindowOff: ImageVector
    get() {
        if (_windowOff != null) return _windowOff!!
        _windowOff = tablerOutlineIcon(
            name = "WindowOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.166 6.19C5.411 7.318 5.006 8.643 5 10v10c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-1M19 15v-5C19 6.272 15.866 3 12 3 10.645 3.002 9.322 3.405 8.196 4.158")
            addPathData("M5 13h8M17 13h2")
            addPathData("M12 3v5M12 12v9")
            addPathData("M3 3 21 21")
        }
        return _windowOff!!
    }

private var _windowOff: ImageVector? = null

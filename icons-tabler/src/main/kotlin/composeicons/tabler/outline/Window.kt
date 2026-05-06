package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Window: ImageVector
    get() {
        if (_window != null) return _window!!
        _window = tablerOutlineIcon(
            name = "Window",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3C8.134 3 5 6.272 5 10v10c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-10C19 6.272 15.866 3 12 3")
            addPathData("M5 13h14")
            addPathData("M12 3v18")
        }
        return _window!!
    }

private var _window: ImageVector? = null

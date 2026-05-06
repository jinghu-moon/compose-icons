package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindowMaximize: ImageVector
    get() {
        if (_windowMaximize != null) return _windowMaximize!!
        _windowMaximize = tablerOutlineIcon(
            name = "WindowMaximize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C3.448 21 3 20.552 3 20v-3")
            addPathData("M4 12v-6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-6")
            addPathData("M12 8h4v4")
            addPathData("M16 8l-5 5")
        }
        return _windowMaximize!!
    }

private var _windowMaximize: ImageVector? = null

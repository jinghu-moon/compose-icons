package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AppsOff: ImageVector
    get() {
        if (_appsOff != null) return _appsOff!!
        _appsOff = tablerOutlineIcon(
            name = "AppsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h1c.552 0 1 .448 1 1v1M9.71 9.704C9.522 9.893 9.267 10 9 10h-4C4.448 10 4 9.552 4 9v-4c0-.276 .111-.525 .292-.706")
            addPathData("M18 14h1c.552 0 1 .448 1 1v1M19.71 19.704c-.188 .189-.443 .296-.71 .296h-4c-.552 0-1-.448-1-1v-4c0-.276 .111-.525 .292-.706")
            addPathData("M4 15c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-4")
            addPathData("M14 7h6")
            addPathData("M17 4v6")
            addPathData("M3 3 21 21")
        }
        return _appsOff!!
    }

private var _appsOff: ImageVector? = null

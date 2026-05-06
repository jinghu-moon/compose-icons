package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutDashboard: ImageVector
    get() {
        if (_layoutDashboard != null) return _layoutDashboard!!
        _layoutDashboard = tablerOutlineIcon(
            name = "LayoutDashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4C4.448 12 4 11.552 4 11v-6C4 4.448 4.448 4 5 4")
            addPathData("M5 16h4c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-2c0-.552 .448-1 1-1")
            addPathData("M15 12h4c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1")
            addPathData("M15 4h4c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-4C14.448 8 14 7.552 14 7v-2c0-.552 .448-1 1-1")
        }
        return _layoutDashboard!!
    }

private var _layoutDashboard: ImageVector? = null

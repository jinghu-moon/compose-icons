package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayoutDashboard: ImageVector
    get() {
        if (_layoutDashboard != null) return _layoutDashboard!!
        _layoutDashboard = lucideOutlineIcon(
            name = "LayoutDashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h5c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-5C3.448 12 3 11.552 3 11v-7C3 3.448 3.448 3 4 3Z")
            addPathData("M15 3h5c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-5C14.448 8 14 7.552 14 7v-3c0-.552 .448-1 1-1Z")
            addPathData("M15 12h5c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-7c0-.552 .448-1 1-1Z")
            addPathData("M4 16h5c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-5C3.448 21 3 20.552 3 20v-3c0-.552 .448-1 1-1Z")
        }
        return _layoutDashboard!!
    }

private var _layoutDashboard: ImageVector? = null

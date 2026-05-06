package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayoutPanelLeft: ImageVector
    get() {
        if (_layoutPanelLeft != null) return _layoutPanelLeft!!
        _layoutPanelLeft = lucideOutlineIcon(
            name = "LayoutPanelLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h5c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-5C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3Z")
            addPathData("M15 3h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1Z")
            addPathData("M15 14h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1Z")
        }
        return _layoutPanelLeft!!
    }

private var _layoutPanelLeft: ImageVector? = null

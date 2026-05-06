package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayoutTemplate: ImageVector
    get() {
        if (_layoutTemplate != null) return _layoutTemplate!!
        _layoutTemplate = lucideOutlineIcon(
            name = "LayoutTemplate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h16c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-16C3.448 10 3 9.552 3 9v-5C3 3.448 3.448 3 4 3Z")
            addPathData("M4 14h7c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-7C3.448 21 3 20.552 3 20v-5c0-.552 .448-1 1-1Z")
            addPathData("M17 14h3c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1Z")
        }
        return _layoutTemplate!!
    }

private var _layoutTemplate: ImageVector? = null

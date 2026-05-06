package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Grip: ImageVector
    get() {
        if (_grip != null) return _grip!!
        _grip = lucideOutlineIcon(
            name = "Grip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5c0 .552-.448 1-1 1C11.448 6 11 5.552 11 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 5c0 .552-.448 1-1 1C18.448 6 18 5.552 18 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M6 5C6 5.552 5.552 6 5 6 4.448 6 4 5.552 4 5 4 4.448 4.448 4 5 4c.552 0 1 .448 1 1Z")
            addPathData("M13 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M6 12c0 .552-.448 1-1 1C4.448 13 4 12.552 4 12c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M13 19c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M20 19c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M6 19c0 .552-.448 1-1 1C4.448 20 4 19.552 4 19c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _grip!!
    }

private var _grip: ImageVector? = null

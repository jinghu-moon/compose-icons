package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileStack: ImageVector
    get() {
        if (_fileStack != null) return _fileStack!!
        _fileStack = lucideOutlineIcon(
            name = "FileStack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21c0 .552-.448 1-1 1h-6C3.448 22 3 21.552 3 21v-8c0-.552 .448-1 1-1")
            addPathData("M16 16c0 .552-.448 1-1 1h-6C8.448 17 8 16.552 8 16v-8C8 7.448 8.448 7 9 7")
            addPathData("M21 6c-0-.53-.211-1.039-.586-1.414l-2-2C18.039 2.211 17.53 2 17 2h-3c-.552 0-1 .448-1 1v8c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1Z")
        }
        return _fileStack!!
    }

private var _fileStack: ImageVector? = null

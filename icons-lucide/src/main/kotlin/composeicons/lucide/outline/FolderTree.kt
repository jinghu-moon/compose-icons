package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderTree: ImageVector
    get() {
        if (_folderTree != null) return _folderTree!!
        _folderTree = lucideOutlineIcon(
            name = "FolderTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c.552 0 1-.448 1-1v-3C21 5.448 20.552 5 20 5h-2.5c-.315 0-.611-.148-.8-.4L15.8 3.4C15.611 3.148 15.315 3 15 3h-2c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1Z")
            addPathData("M20 21c.552 0 1-.448 1-1v-3c0-.552-.448-1-1-1h-2.9c-.373-.005-.712-.217-.88-.55l-.42-.85c-.16-.366-.521-.601-.92-.6h-1.88c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1Z")
            addPathData("M3 5c0 1.105 .895 2 2 2h3")
            addPathData("M3 3v13c0 1.105 .895 2 2 2h3")
        }
        return _folderTree!!
    }

private var _folderTree: ImageVector? = null

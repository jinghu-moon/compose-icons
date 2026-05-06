package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drill: ImageVector
    get() {
        if (_drill != null) return _drill!!
        _drill = lucideOutlineIcon(
            name = "Drill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 18c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-5C3.343 22 2 20.657 2 19c0-.552 .448-1 1-1Z")
            addPathData("M13 10h-9C2.895 10 2 9.105 2 8v-4C2 2.895 2.895 2 4 2h9c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1l-.81 3.242c-.111 .445-.511 .758-.97 .758h-3.22")
            addPathData("M14 4h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3")
            addPathData("M18 6h4")
            addPathData("M5 10 3 18")
            addPathData("M7 18 9 10")
        }
        return _drill!!
    }

private var _drill: ImageVector? = null

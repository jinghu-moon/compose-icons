package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Blocks: ImageVector
    get() {
        if (_blocks != null) return _blocks!!
        _blocks = lucideOutlineIcon(
            name = "Blocks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 22v-15C10 6.448 9.552 6 9 6h-5C2.895 6 2 6.895 2 8v12c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-5c0-.552-.448-1-1-1h-15")
            addPathData("M15 2h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1Z")
        }
        return _blocks!!
    }

private var _blocks: ImageVector? = null

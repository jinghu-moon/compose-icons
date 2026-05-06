package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = lucideOutlineIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 16h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1Z")
            addPathData("M3 16h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C2.448 22 2 21.552 2 21v-4c0-.552 .448-1 1-1Z")
            addPathData("M10 2h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C9.448 8 9 7.552 9 7v-4C9 2.448 9.448 2 10 2Z")
            addPathData("M5 16v-3c0-.552 .448-1 1-1h12c.552 0 1 .448 1 1v3")
            addPathData("M12 12v-4")
        }
        return _network!!
    }

private var _network: ImageVector? = null

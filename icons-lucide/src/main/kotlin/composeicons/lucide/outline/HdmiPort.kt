package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HdmiPort: ImageVector
    get() {
        if (_hdmiPort != null) return _hdmiPort!!
        _hdmiPort = lucideOutlineIcon(
            name = "HdmiPort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 9C22 8.448 21.552 8 21 8h-18C2.448 8 2 8.448 2 9v4c0 .552 .448 1 1 1h1l2 2h12l2-2h1c.552 0 1-.448 1-1Z")
            addPathData("M7.5 12h9")
        }
        return _hdmiPort!!
    }

private var _hdmiPort: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = lucideOutlineIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.536 21.686c.078 .194 .268 .319 .477 .314 .209-.005 .392-.14 .46-.338L21.973 2.662c.065-.181 .02-.383-.116-.519-.136-.136-.338-.181-.519-.116L2.338 8.527c-.198 .068-.332 .251-.338 .46-.005 .209 .12 .399 .314 .477l7.93 3.18c.507 .203 .908 .604 1.112 1.11Z")
            addPathData("M21.854 2.147 10.914 13.086")
        }
        return _send!!
    }

private var _send: ImageVector? = null

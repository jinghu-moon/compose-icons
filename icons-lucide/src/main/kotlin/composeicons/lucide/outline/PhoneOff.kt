package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) return _phoneOff!!
        _phoneOff = lucideOutlineIcon(
            name = "PhoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.1 13.9c1.089 1.088 2.35 1.99 3.732 2.668 .425 .195 .929 .069 1.213-.303l.355-.465C15.778 15.296 16.37 15 17 15h3c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2C15.226 22 10.648 20.104 7.272 16.728")
            addPathData("M22 2 2 22")
            addPathData("M4.76 13.582C2.956 10.712 1.999 7.39 2 4 2 2.895 2.895 2 4 2h3c1.105 0 2 .895 2 2v3c0 .63-.296 1.222-.8 1.6l-.468 .351c-.379 .289-.501 .805-.292 1.233 .078 .159 .16 .317 .244 .473")
        }
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null

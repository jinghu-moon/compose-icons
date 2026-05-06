package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = lucideOutlineIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17l2 2c.828 .828 2.172 .828 3 0 .828-.828 .828-2.172 0-3")
            addPathData("M14 14l2.5 2.5c.828 .828 2.172 .828 3 0 .828-.828 .828-2.172 0-3L15.62 9.62c-1.171-1.17-3.069-1.17-4.24 0l-.88 .88c-.828 .828-2.172 .828-3 0-.828-.828-.828-2.172 0-3L10.31 4.69c1.877-1.872 4.785-2.23 7.06-.87l.47 .28c.426 .257 .932 .346 1.42 .25L21 4")
            addPathData("M21 3l1 11h-2")
            addPathData("M3 3 2 14l6.5 6.5c.828 .828 2.172 .828 3 0 .828-.828 .828-2.172 0-3")
            addPathData("M3 4h8")
        }
        return _handshake!!
    }

private var _handshake: ImageVector? = null

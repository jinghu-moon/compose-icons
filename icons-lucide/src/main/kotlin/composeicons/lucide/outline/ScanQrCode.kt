package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScanQrCode: ImageVector
    get() {
        if (_scanQrCode != null) return _scanQrCode!!
        _scanQrCode = lucideOutlineIcon(
            name = "ScanQrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12v4c0 .552-.448 1-1 1h-4")
            addPathData("M17 3h2c1.105 0 2 .895 2 2v2")
            addPathData("M17 8v-1")
            addPathData("M21 17v2c0 1.105-.895 2-2 2h-2")
            addPathData("M3 7v-2C3 3.895 3.895 3 5 3h2")
            addPathData("M7 17h.01")
            addPathData("M7 21h-2C3.895 21 3 20.105 3 19v-2")
            addPathData("M8 7h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C7.448 12 7 11.552 7 11v-3C7 7.448 7.448 7 8 7Z")
        }
        return _scanQrCode!!
    }

private var _scanQrCode: ImageVector? = null

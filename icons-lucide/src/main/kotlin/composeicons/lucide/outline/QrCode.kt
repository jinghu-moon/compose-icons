package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.QrCode: ImageVector
    get() {
        if (_qrCode != null) return _qrCode!!
        _qrCode = lucideOutlineIcon(
            name = "QrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h3c.552 0 1 .448 1 1v3C8 7.552 7.552 8 7 8h-3C3.448 8 3 7.552 3 7v-3C3 3.448 3.448 3 4 3Z")
            addPathData("M17 3h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C16.448 8 16 7.552 16 7v-3c0-.552 .448-1 1-1Z")
            addPathData("M4 16h3c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C3.448 21 3 20.552 3 20v-3c0-.552 .448-1 1-1Z")
            addPathData("M21 16h-3c-1.105 0-2 .895-2 2v3")
            addPathData("M21 21v.01")
            addPathData("M12 7v3c0 1.105-.895 2-2 2h-3")
            addPathData("M3 12h.01")
            addPathData("M12 3h.01")
            addPathData("M12 16v.01")
            addPathData("M16 12h1")
            addPathData("M21 12v.01")
            addPathData("M12 21v-1")
        }
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null

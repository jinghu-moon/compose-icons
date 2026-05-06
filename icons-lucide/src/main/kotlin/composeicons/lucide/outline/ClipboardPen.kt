package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardPen: ImageVector
    get() {
        if (_clipboardPen != null) return _clipboardPen!!
        _clipboardPen = lucideOutlineIcon(
            name = "ClipboardPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M21.34 15.664c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0l-5.01 5.012c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
            addPathData("M8 22h-2C4.895 22 4 21.105 4 20v-14C4 4.895 4.895 4 6 4h2")
            addPathData("M9 2h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6C8.448 6 8 5.552 8 5v-2C8 2.448 8.448 2 9 2Z")
        }
        return _clipboardPen!!
    }

private var _clipboardPen: ImageVector? = null

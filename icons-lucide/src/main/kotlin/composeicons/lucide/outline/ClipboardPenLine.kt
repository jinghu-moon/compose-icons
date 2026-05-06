package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardPenLine: ImageVector
    get() {
        if (_clipboardPenLine != null) return _clipboardPenLine!!
        _clipboardPenLine = lucideOutlineIcon(
            name = "ClipboardPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 2h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6C8.448 6 8 5.552 8 5v-2C8 2.448 8.448 2 9 2Z")
            addPathData("M8 4h-2C4.895 4 4 4.895 4 6v14c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-.5")
            addPathData("M16 4h2c.714 .001 1.373 .382 1.73 1")
            addPathData("M8 18h1")
            addPathData("M21.378 12.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0l-4.01 4.012c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
        }
        return _clipboardPenLine!!
    }

private var _clipboardPenLine: ImageVector? = null

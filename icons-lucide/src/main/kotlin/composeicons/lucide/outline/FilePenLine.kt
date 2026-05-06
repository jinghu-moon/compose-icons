package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePenLine: ImageVector
    get() {
        if (_filePenLine != null) return _filePenLine!!
        _filePenLine = lucideOutlineIcon(
            name = "FilePenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.364 13.634c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506l4.013-4.009c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0Z")
            addPathData("M14.487 7.858C14.185 7.678 14 7.352 14 7v-5")
            addPathData("M20 19.645v.355c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l2.516 2.516")
            addPathData("M8 18h1")
        }
        return _filePenLine!!
    }

private var _filePenLine: ImageVector? = null

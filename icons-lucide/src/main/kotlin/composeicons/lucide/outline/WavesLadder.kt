package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesLadder: ImageVector
    get() {
        if (_wavesLadder != null) return _wavesLadder!!
        _wavesLadder = lucideOutlineIcon(
            name = "WavesLadder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5c-1.105 0-2 .895-2 2v11")
            addPathData("M2 18c.6 .5 1.2 1 2.5 1C7 19 7 17 9.5 17c2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
            addPathData("M7 13h10")
            addPathData("M7 9h10")
            addPathData("M9 5C7.895 5 7 5.895 7 7v11")
        }
        return _wavesLadder!!
    }

private var _wavesLadder: ImageVector? = null

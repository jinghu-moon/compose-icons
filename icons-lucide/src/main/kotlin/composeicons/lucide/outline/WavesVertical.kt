package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesVertical: ImageVector
    get() {
        if (_wavesVertical != null) return _wavesVertical!!
        _wavesVertical = lucideOutlineIcon(
            name = "WavesVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2q2 2.5 0 5-2 2.5 0 5 2 2.5 0 5-2 2.5 0 5")
            addPathData("M19 2q2 2.5 0 5-2 2.5 0 5 2 2.5 0 5-2 2.5 0 5")
            addPathData("M5 2Q7 4.5 5 7 3 9.5 5 12q2 2.5 0 5-2 2.5 0 5")
        }
        return _wavesVertical!!
    }

private var _wavesVertical: ImageVector? = null

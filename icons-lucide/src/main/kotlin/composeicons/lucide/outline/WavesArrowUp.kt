package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesArrowUp: ImageVector
    get() {
        if (_wavesArrowUp != null) return _wavesArrowUp!!
        _wavesArrowUp = lucideOutlineIcon(
            name = "WavesArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v8")
            addPathData("M2 15c.6 .5 1.2 1 2.5 1C7 16 7 14 9.5 14c2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
            addPathData("M2 21c.6 .5 1.2 1 2.5 1C7 22 7 20 9.5 20c2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
            addPathData("M8 6 12 2l4 4")
        }
        return _wavesArrowUp!!
    }

private var _wavesArrowUp: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesArrowDown: ImageVector
    get() {
        if (_wavesArrowDown != null) return _wavesArrowDown!!
        _wavesArrowDown = lucideOutlineIcon(
            name = "WavesArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v-8")
            addPathData("M16 6l-4 4L8 6")
            addPathData("M2 15c.6 .5 1.2 1 2.5 1C7 16 7 14 9.5 14c2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
            addPathData("M2 21c.6 .5 1.2 1 2.5 1C7 22 7 20 9.5 20c2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
        }
        return _wavesArrowDown!!
    }

private var _wavesArrowDown: ImageVector? = null

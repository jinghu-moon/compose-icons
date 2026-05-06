package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesHorizontal: ImageVector
    get() {
        if (_wavesHorizontal != null) return _wavesHorizontal!!
        _wavesHorizontal = lucideOutlineIcon(
            name = "WavesHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12q2.5 2 5 0 2.5-2 5 0 2.5 2 5 0 2.5-2 5 0")
            addPathData("M2 19q2.5 2 5 0 2.5-2 5 0 2.5 2 5 0 2.5-2 5 0")
            addPathData("M2 5Q4.5 7 7 5 9.5 3 12 5q2.5 2 5 0 2.5-2 5 0")
        }
        return _wavesHorizontal!!
    }

private var _wavesHorizontal: ImageVector? = null

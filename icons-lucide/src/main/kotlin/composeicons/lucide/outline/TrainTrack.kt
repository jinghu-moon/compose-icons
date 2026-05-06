package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrainTrack: ImageVector
    get() {
        if (_trainTrack != null) return _trainTrack!!
        _trainTrack = lucideOutlineIcon(
            name = "TrainTrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17 17 2")
            addPathData("M2 14l8 8")
            addPathData("M5 11l8 8")
            addPathData("M8 8l8 8")
            addPathData("M11 5l8 8")
            addPathData("M14 2l8 8")
            addPathData("M7 22 22 7")
        }
        return _trainTrack!!
    }

private var _trainTrack: ImageVector? = null

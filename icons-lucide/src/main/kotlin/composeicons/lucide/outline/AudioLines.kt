package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AudioLines: ImageVector
    get() {
        if (_audioLines != null) return _audioLines!!
        _audioLines = lucideOutlineIcon(
            name = "AudioLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 10v3")
            addPathData("M6 6v11")
            addPathData("M10 3v18")
            addPathData("M14 8v7")
            addPathData("M18 5v13")
            addPathData("M22 10v3")
        }
        return _audioLines!!
    }

private var _audioLines: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Drum: ImageVector
    get() {
        if (_drum != null) return _drum!!
        _drum = lucideOutlineIcon(
            name = "Drum",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 2l8 8")
            addPathData("M22 2l-8 8")
            addPathData("M22 9c0 2.761-4.477 5-10 5C6.477 14 2 11.761 2 9 2 6.239 6.477 4 12 4c5.523 0 10 2.239 10 5Z")
            addPathData("M7 13.4v7.9")
            addPathData("M12 14v8")
            addPathData("M17 13.4v7.9")
            addPathData("M2 9v8c0 2.761 4.477 5 10 5 5.523 0 10-2.239 10-5v-8")
        }
        return _drum!!
    }

private var _drum: ImageVector? = null

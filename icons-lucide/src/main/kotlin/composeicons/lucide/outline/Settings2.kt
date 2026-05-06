package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Settings2: ImageVector
    get() {
        if (_settings2 != null) return _settings2!!
        _settings2 = lucideOutlineIcon(
            name = "Settings2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 17h-9")
            addPathData("M19 7h-9")
            addPathData("M20 17c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M10 7c0 1.657-1.343 3-3 3C5.343 10 4 8.657 4 7 4 5.343 5.343 4 7 4c1.657 0 3 1.343 3 3Z")
        }
        return _settings2!!
    }

private var _settings2: ImageVector? = null

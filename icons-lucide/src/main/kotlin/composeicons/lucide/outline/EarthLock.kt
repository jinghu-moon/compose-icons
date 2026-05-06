package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EarthLock: ImageVector
    get() {
        if (_earthLock != null) return _earthLock!!
        _earthLock = lucideOutlineIcon(
            name = "EarthLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3.34v1.66c0 1.657 1.343 3 3 3")
            addPathData("M11 21.95v-3.95c0-1.105-.895-2-2-2C7.895 16 7 15.105 7 14v-1C7 11.895 6.105 11 5 11h-2.95")
            addPathData("M21.54 15h-4.54c-1.105 0-2 .895-2 2v4.54")
            addPathData("M12 2C6.87 2 2.572 5.883 2.052 10.987c-.52 5.104 2.907 9.773 7.931 10.808C15.008 22.829 20.001 19.894 21.54 15")
            addPathData("M20 6v-2C20 2.895 19.105 2 18 2c-1.105 0-2 .895-2 2v2")
            addPathData("M15 6h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
        }
        return _earthLock!!
    }

private var _earthLock: ImageVector? = null

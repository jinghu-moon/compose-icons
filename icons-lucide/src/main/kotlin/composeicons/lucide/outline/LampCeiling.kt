package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampCeiling: ImageVector
    get() {
        if (_lampCeiling != null) return _lampCeiling!!
        _lampCeiling = lucideOutlineIcon(
            name = "LampCeiling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v5")
            addPathData("M14.829 15.998c.439 1.243 .015 2.627-1.045 3.411-1.06 .784-2.507 .784-3.567 0C9.156 18.625 8.732 17.241 9.171 15.998")
            addPathData("M20.92 14.606c.133 .309 .101 .664-.084 .945-.185 .281-.499 .449-.836 .449h-16c-.336 0-.65-.168-.836-.449-.185-.281-.217-.636-.084-.945l3-7C6.238 7.238 6.6 7 7 7h10c.4-0 .762 .238 .92 .606Z")
        }
        return _lampCeiling!!
    }

private var _lampCeiling: ImageVector? = null

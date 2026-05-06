package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImageUpscale: ImageVector
    get() {
        if (_imageUpscale != null) return _imageUpscale!!
        _imageUpscale = lucideOutlineIcon(
            name = "ImageUpscale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3h5v5")
            addPathData("M17 21h2c1.105 0 2-.895 2-2")
            addPathData("M21 12v3")
            addPathData("M21 3 16 8")
            addPathData("M3 7v-2C3 3.895 3.895 3 5 3")
            addPathData("M5 21 9.144 16.856c.227-.227 .535-.355 .856-.355 .321 0 .629 .128 .856 .355L13 19")
            addPathData("M9 3h3")
            addPathData("M4 11h8c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-8C3.448 21 3 20.552 3 20v-8c0-.552 .448-1 1-1Z")
        }
        return _imageUpscale!!
    }

private var _imageUpscale: ImageVector? = null

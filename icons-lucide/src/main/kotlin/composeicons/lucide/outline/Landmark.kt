package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Landmark: ImageVector
    get() {
        if (_landmark != null) return _landmark!!
        _landmark = lucideOutlineIcon(
            name = "Landmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 18v-7")
            addPathData("M11.12 2.198c.556-.27 1.206-.268 1.76 .006l7.866 3.847c.476 .233 .31 .949-.22 .949h-17.052C2.944 7 2.779 6.284 3.254 6.051Z")
            addPathData("M14 18v-7")
            addPathData("M18 18v-7")
            addPathData("M3 22h18")
            addPathData("M6 18v-7")
        }
        return _landmark!!
    }

private var _landmark: ImageVector? = null

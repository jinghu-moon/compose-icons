package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlameKindling: ImageVector
    get() {
        if (_flameKindling != null) return _flameKindling!!
        _flameKindling = lucideOutlineIcon(
            name = "FlameKindling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c1 3 2.5 3.5 3.5 4.5C16.442 7.423 16.981 8.681 17 10c0 2.761-2.239 5-5 5C9.239 15 7 12.761 7 10c0-.3 0-.6 .1-.9 .232 .811 .947 1.389 1.788 1.446 .841 .057 1.628-.42 1.967-1.192 .339-.772 .157-1.674-.454-2.254C8 4.5 11 2 12 2Z")
            addPathData("M5 22 19 18")
            addPathData("M5 18l14 4")
        }
        return _flameKindling!!
    }

private var _flameKindling: ImageVector? = null

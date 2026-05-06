package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScanHeart: ImageVector
    get() {
        if (_scanHeart != null) return _scanHeart!!
        _scanHeart = lucideOutlineIcon(
            name = "ScanHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3h2c1.105 0 2 .895 2 2v2")
            addPathData("M21 17v2c0 1.105-.895 2-2 2h-2")
            addPathData("M3 7v-2C3 3.895 3.895 3 5 3h2")
            addPathData("M7 21h-2C3.895 21 3 20.105 3 19v-2")
            addPathData("M7.828 13.07C6.714 11.905 6.72 10.067 7.842 8.909 8.964 7.752 10.8 7.687 12 8.764c1.2-1.077 3.036-1.012 4.158 .145 1.122 1.158 1.128 2.995 .014 4.161l-3.447 3.62c-.189 .198-.451 .311-.725 .311-.274 0-.536-.112-.724-.311Z")
        }
        return _scanHeart!!
    }

private var _scanHeart: ImageVector? = null

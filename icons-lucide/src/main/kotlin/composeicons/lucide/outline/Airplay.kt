package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = lucideOutlineIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17h-1C2.895 17 2 16.105 2 15v-10C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-1")
            addPathData("M12 15l5 6h-10Z")
        }
        return _airplay!!
    }

private var _airplay: ImageVector? = null

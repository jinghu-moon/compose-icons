package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Clapperboard: ImageVector
    get() {
        if (_clapperboard != null) return _clapperboard!!
        _clapperboard = lucideOutlineIcon(
            name = "Clapperboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.296 3.464l3.02 3.956")
            addPathData("M20.2 6 3 11 2.1 8.6C1.8 7.5 2.4 6.4 3.4 6.1l13.5-4c1.1-.3 2.2 .3 2.5 1.3Z")
            addPathData("M3 11h18v8c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19Z")
            addPathData("M6.18 5.276 9.28 9.175")
        }
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null

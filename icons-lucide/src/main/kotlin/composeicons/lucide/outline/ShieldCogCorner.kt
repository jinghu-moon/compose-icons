package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldCogCorner: ImageVector
    get() {
        if (_shieldCogCorner != null) return _shieldCogCorner!!
        _shieldCogCorner = lucideOutlineIcon(
            name = "ShieldCogCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 22C7.194 20.55 4 18.034 4 13v-7C4 5.448 4.448 5 5 5 7 5 9.5 3.8 11.24 2.28c.438-.374 1.082-.374 1.52 0C14.51 3.81 17 5 19 5c.552 0 1 .448 1 1v4")
            addPathData("M14.923 16.547 14 16.164")
            addPathData("M14.923 18.843 14 19.226")
            addPathData("M16.547 14.923 16.164 14")
            addPathData("M16.547 20.467l-.383 .924")
            addPathData("M18.843 14.923 19.226 14")
            addPathData("M19.225 21.391l-.382-.924")
            addPathData("M20.467 16.547l.923-.383")
            addPathData("M20.467 18.843l.923 .383")
            addPathData("M20.695 17.695c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _shieldCogCorner!!
    }

private var _shieldCogCorner: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SaudiRiyal: ImageVector
    get() {
        if (_saudiRiyal != null) return _saudiRiyal!!
        _saudiRiyal = lucideOutlineIcon(
            name = "SaudiRiyal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 19.5l-5.5 1.2")
            addPathData("M14.5 4v11.22c0 .308 .142 .598 .384 .788 .243 .189 .559 .257 .858 .182L20 15.2")
            addPathData("M2.978 19.351 8.527 17.988C9.418 17.745 10.027 16.923 10 16v-14")
            addPathData("M20 10 4 13.5")
        }
        return _saudiRiyal!!
    }

private var _saudiRiyal: ImageVector? = null

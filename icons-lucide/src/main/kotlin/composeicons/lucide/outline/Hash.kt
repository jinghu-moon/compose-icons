package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = lucideOutlineIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9h16")
            addPathData("M4 15h16")
            addPathData("M10 3 8 21")
            addPathData("M16 3 14 21")
        }
        return _hash!!
    }

private var _hash: ImageVector? = null

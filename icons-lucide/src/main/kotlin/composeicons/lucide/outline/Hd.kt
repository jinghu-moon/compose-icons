package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hd: ImageVector
    get() {
        if (_hd != null) return _hd!!
        _hd = lucideOutlineIcon(
            name = "Hd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h-4")
            addPathData("M10 15v-6")
            addPathData("M14 14.5c0 .276 .224 .5 .5 .5h1C16.881 15 18 13.881 18 12.5v-1C18 10.119 16.881 9 15.5 9h-1C14.224 9 14 9.224 14 9.5Z")
            addPathData("M6 15v-6")
            addPathData("M4 5h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-10C2 5.895 2.895 5 4 5Z")
        }
        return _hd!!
    }

private var _hd: ImageVector? = null

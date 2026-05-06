package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sofa: ImageVector
    get() {
        if (_sofa != null) return _sofa!!
        _sofa = lucideOutlineIcon(
            name = "Sofa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 9v-3C20 4.895 19.105 4 18 4h-12C4.895 4 4 4.895 4 6v3")
            addPathData("M2 16c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-5C22 9.895 21.105 9 20 9c-1.105 0-2 .895-2 2v1.5c0 .276-.224 .5-.5 .5h-11C6.224 13 6 12.776 6 12.5v-1.5C6 9.895 5.105 9 4 9 2.895 9 2 9.895 2 11Z")
            addPathData("M4 18v2")
            addPathData("M20 18v2")
            addPathData("M12 4v9")
        }
        return _sofa!!
    }

private var _sofa: ImageVector? = null

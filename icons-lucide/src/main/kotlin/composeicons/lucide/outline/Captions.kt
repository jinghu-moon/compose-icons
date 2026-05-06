package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Captions: ImageVector
    get() {
        if (_captions != null) return _captions!!
        _captions = lucideOutlineIcon(
            name = "Captions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5Z")
            addPathData("M7 15h4M15 15h2M7 11h2M13 11h4")
        }
        return _captions!!
    }

private var _captions: ImageVector? = null

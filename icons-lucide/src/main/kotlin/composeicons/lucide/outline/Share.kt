package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = lucideOutlineIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v13")
            addPathData("M16 6 12 2 8 6")
            addPathData("M4 12v8c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-8")
        }
        return _share!!
    }

private var _share: ImageVector? = null

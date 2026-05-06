package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TabletSmartphone: ImageVector
    get() {
        if (_tabletSmartphone != null) return _tabletSmartphone!!
        _tabletSmartphone = lucideOutlineIcon(
            name = "TabletSmartphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8h6c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-6C3.895 22 3 21.105 3 20v-10C3 8.895 3.895 8 5 8Z")
            addPathData("M5 4C5 2.895 5.895 2 7 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-2.4")
            addPathData("M8 18h.01")
        }
        return _tabletSmartphone!!
    }

private var _tabletSmartphone: ImageVector? = null

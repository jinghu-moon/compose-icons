package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PanelRightClose: ImageVector
    get() {
        if (_panelRightClose != null) return _panelRightClose!!
        _panelRightClose = lucideOutlineIcon(
            name = "PanelRightClose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M15 3v18")
            addPathData("M8 9l3 3L8 15")
        }
        return _panelRightClose!!
    }

private var _panelRightClose: ImageVector? = null

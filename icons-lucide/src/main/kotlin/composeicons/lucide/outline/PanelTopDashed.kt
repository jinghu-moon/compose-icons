package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PanelTopDashed: ImageVector
    get() {
        if (_panelTopDashed != null) return _panelTopDashed!!
        _panelTopDashed = lucideOutlineIcon(
            name = "PanelTopDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M14 9h1")
            addPathData("M19 9h2")
            addPathData("M3 9h2")
            addPathData("M9 9h1")
        }
        return _panelTopDashed!!
    }

private var _panelTopDashed: ImageVector? = null

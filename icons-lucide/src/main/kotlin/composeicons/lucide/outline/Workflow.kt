package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Workflow: ImageVector
    get() {
        if (_workflow != null) return _workflow!!
        _workflow = lucideOutlineIcon(
            name = "Workflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C3.895 11 3 10.105 3 9v-4C3 3.895 3.895 3 5 3Z")
            addPathData("M7 11v4c0 1.105 .895 2 2 2h4")
            addPathData("M15 13h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2Z")
        }
        return _workflow!!
    }

private var _workflow: ImageVector? = null

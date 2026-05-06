package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Layers2: ImageVector
    get() {
        if (_layers2 != null) return _layers2!!
        _layers2 = lucideOutlineIcon(
            name = "Layers2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 13.74c-.619 .357-1.381 .357-2 0L2.5 8.87C2.187 8.692 1.993 8.36 1.993 8c0-.36 .194-.692 .507-.87L11 2.26c.619-.357 1.381-.357 2 0l8.5 4.87c.313 .178 .507 .51 .507 .87 0 .36-.194 .692-.507 .87Z")
            addPathData("M20 14.285l1.5 .845c.313 .178 .507 .51 .507 .87 0 .36-.194 .692-.507 .87L13 21.74c-.619 .357-1.381 .357-2 0L2.5 16.87C2.187 16.692 1.993 16.36 1.993 16c0-.36 .194-.692 .507-.87L4 14.285")
        }
        return _layers2!!
    }

private var _layers2: ImageVector? = null

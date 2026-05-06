package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dock: ImageVector
    get() {
        if (_dock != null) return _dock!!
        _dock = lucideOutlineIcon(
            name = "Dock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8h20")
            addPathData("M4 4h16c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4Z")
            addPathData("M6 16h12")
        }
        return _dock!!
    }

private var _dock: ImageVector? = null

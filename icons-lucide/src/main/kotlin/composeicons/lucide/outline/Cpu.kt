package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = lucideOutlineIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20v2")
            addPathData("M12 2v2")
            addPathData("M17 20v2")
            addPathData("M17 2v2")
            addPathData("M2 12h2")
            addPathData("M2 17h2")
            addPathData("M2 7h2")
            addPathData("M20 12h2")
            addPathData("M20 17h2")
            addPathData("M20 7h2")
            addPathData("M7 20v2")
            addPathData("M7 2v2")
            addPathData("M6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4Z")
            addPathData("M9 8h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C8.448 16 8 15.552 8 15v-6C8 8.448 8.448 8 9 8Z")
        }
        return _cpu!!
    }

private var _cpu: ImageVector? = null

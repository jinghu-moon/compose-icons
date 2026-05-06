package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClockPlus: ImageVector
    get() {
        if (_clockPlus != null) return _clockPlus!!
        _clockPlus = lucideOutlineIcon(
            name = "ClockPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v6l3.644 1.822")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
            addPathData("M21.92 13.267C22.462 9.025 20.245 4.907 16.406 3.023 12.566 1.139 7.954 1.905 4.929 4.929 1.905 7.954 1.139 12.566 3.023 16.406c1.884 3.84 6.001 6.056 10.244 5.514")
        }
        return _clockPlus!!
    }

private var _clockPlus: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = lucideOutlineIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12 5.619 20.38c-.828 .829-2.172 .829-3 .001-.829-.828-.829-2.172-0-3.001L11 9")
            addPathData("M15 15.5c0 .276 .224 .5 .5 .5C19.09 16 22 13.09 22 9.5 22 9.224 21.776 9 21.5 9h-1.672c-.53-0-1.039-.211-1.414-.586L13.352 3.352c-.471-.47-1.233-.47-1.704 0L9.352 5.648c-.47 .471-.47 1.233 0 1.704l5.062 5.062c.375 .375 .586 .884 .586 1.414Z")
        }
        return _axe!!
    }

private var _axe: ImageVector? = null

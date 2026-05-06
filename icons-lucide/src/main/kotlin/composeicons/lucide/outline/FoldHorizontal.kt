package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FoldHorizontal: ImageVector
    get() {
        if (_foldHorizontal != null) return _foldHorizontal!!
        _foldHorizontal = lucideOutlineIcon(
            name = "FoldHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h6")
            addPathData("M22 12h-6")
            addPathData("M12 2v2")
            addPathData("M12 8v2")
            addPathData("M12 14v2")
            addPathData("M12 20v2")
            addPathData("M19 9l-3 3 3 3")
            addPathData("M5 15 8 12 5 9")
        }
        return _foldHorizontal!!
    }

private var _foldHorizontal: ImageVector? = null

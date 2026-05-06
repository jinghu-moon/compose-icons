package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SpellCheck2: ImageVector
    get() {
        if (_spellCheck2 != null) return _spellCheck2!!
        _spellCheck2 = lucideOutlineIcon(
            name = "SpellCheck2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 16 12 4l6 12")
            addPathData("M8 12h8")
            addPathData("M4 21c1.1 0 1.1-1 2.3-1 1.2 0 1.1 1 2.3 1 1.1 0 1.1-1 2.3-1C12 20 12 21 13.2 21c1.1 0 1.1-1 2.3-1 1.1 0 1.1 1 2.3 1 1.1 0 1.1-1 2.3-1")
        }
        return _spellCheck2!!
    }

private var _spellCheck2: ImageVector? = null

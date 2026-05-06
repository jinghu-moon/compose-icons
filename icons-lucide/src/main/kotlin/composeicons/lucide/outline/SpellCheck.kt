package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SpellCheck: ImageVector
    get() {
        if (_spellCheck != null) return _spellCheck!!
        _spellCheck = lucideOutlineIcon(
            name = "SpellCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 16 12 4l6 12")
            addPathData("M8 12h8")
            addPathData("M16 20l2 2 4-4")
        }
        return _spellCheck!!
    }

private var _spellCheck: ImageVector? = null

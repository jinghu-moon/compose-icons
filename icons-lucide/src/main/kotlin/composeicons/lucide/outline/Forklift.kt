package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Forklift: ImageVector
    get() {
        if (_forklift != null) return _forklift!!
        _forklift = lucideOutlineIcon(
            name = "Forklift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h-7c-1.105 0-2 .895-2 2v5")
            addPathData("M15 19h7")
            addPathData("M16 19v-17")
            addPathData("M6 12v-5C6 5.895 6.895 5 8 5h2.172c.53 0 1.039 .211 1.414 .586l3.828 3.828c.375 .375 .586 .884 .586 1.414")
            addPathData("M7 19h4")
            addPathData("M15 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M7 19c0 1.105-.895 2-2 2C3.895 21 3 20.105 3 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _forklift!!
    }

private var _forklift: ImageVector? = null

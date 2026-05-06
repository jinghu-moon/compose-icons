package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AArrowDown: ImageVector
    get() {
        if (_aArrowDown != null) return _aArrowDown!!
        _aArrowDown = lucideOutlineIcon(
            name = "AArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12l4 4 4-4")
            addPathData("M18 16v-9")
            addPathData("M2 16 6.039 6.31c.078-.186 .26-.308 .462-.308 .202 0 .384 .121 .461 .308L11 16")
            addPathData("M3.304 13h6.392")
        }
        return _aArrowDown!!
    }

private var _aArrowDown: ImageVector? = null

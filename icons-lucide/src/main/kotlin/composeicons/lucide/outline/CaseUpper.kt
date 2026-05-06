package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseUpper: ImageVector
    get() {
        if (_caseUpper != null) return _caseUpper!!
        _caseUpper = lucideOutlineIcon(
            name = "CaseUpper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11h4.5C20.881 11 22 12.119 22 13.5 22 14.881 20.881 16 19.5 16h-4C15.224 16 15 15.776 15 15.5v-9C15 6.224 15.224 6 15.5 6h3C19.881 6 21 7.119 21 8.5 21 9.881 19.881 11 18.5 11")
            addPathData("M2 16 6.039 6.31c.078-.186 .26-.308 .462-.308 .202 0 .384 .121 .461 .308L11 16")
            addPathData("M3.304 13h6.392")
        }
        return _caseUpper!!
    }

private var _caseUpper: ImageVector? = null

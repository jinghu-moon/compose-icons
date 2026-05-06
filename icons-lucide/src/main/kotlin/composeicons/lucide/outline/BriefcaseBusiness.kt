package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BriefcaseBusiness: ImageVector
    get() {
        if (_briefcaseBusiness != null) return _briefcaseBusiness!!
        _briefcaseBusiness = lucideOutlineIcon(
            name = "BriefcaseBusiness",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h.01")
            addPathData("M16 6v-2C16 2.895 15.105 2 14 2h-4C8.895 2 8 2.895 8 4v2")
            addPathData("M22 13C15.935 17.004 8.065 17.004 2 13")
            addPathData("M4 6h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-10C2 6.895 2.895 6 4 6Z")
        }
        return _briefcaseBusiness!!
    }

private var _briefcaseBusiness: ImageVector? = null

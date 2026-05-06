package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BriefcaseConveyorBelt: ImageVector
    get() {
        if (_briefcaseConveyorBelt != null) return _briefcaseConveyorBelt!!
        _briefcaseConveyorBelt = lucideOutlineIcon(
            name = "BriefcaseConveyorBelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20v2")
            addPathData("M14 20v2")
            addPathData("M18 20v2")
            addPathData("M21 20h-18")
            addPathData("M6 20v2")
            addPathData("M8 16v-12C8 2.895 8.895 2 10 2h4c1.105 0 2 .895 2 2v12")
            addPathData("M6 6h12c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-12C4.895 16 4 15.105 4 14v-6C4 6.895 4.895 6 6 6Z")
        }
        return _briefcaseConveyorBelt!!
    }

private var _briefcaseConveyorBelt: ImageVector? = null

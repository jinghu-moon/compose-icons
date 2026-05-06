package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = lucideOutlineIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 19h-2.185c-.642 .002-1.237-.332-1.57-.881-.32-.551-.321-1.231-.004-1.784L7.196 9.5")
            addPathData("M11 19h8.203c.638-.005 1.228-.342 1.556-.89 .315-.55 .315-1.225 0-1.775L19.533 14.215")
            addPathData("M14 16l-3 3 3 3")
            addPathData("M8.293 13.596 7.196 9.5 3.1 10.598")
            addPathData("M9.344 5.811 10.437 3.919c.319-.557 .907-.905 1.548-.919 .637-.001 1.226 .337 1.546 .888l3.943 6.843")
            addPathData("M13.378 9.633l4.096 1.098L18.571 6.635")
        }
        return _recycle!!
    }

private var _recycle: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CigaretteOff: ImageVector
    get() {
        if (_cigaretteOff != null) return _cigaretteOff!!
        _cigaretteOff = lucideOutlineIcon(
            name = "CigaretteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h-9c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h13")
            addPathData("M18 8C18 5.5 16 5.5 16 3")
            addPathData("M2 2 22 22")
            addPathData("M21 12c.552 0 1 .448 1 1v2c-0 .357-.191 .687-.5 .866")
            addPathData("M22 8C22 5.5 20 5.5 20 3")
            addPathData("M7 12v4")
        }
        return _cigaretteOff!!
    }

private var _cigaretteOff: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LocateFixed: ImageVector
    get() {
        if (_locateFixed != null) return _locateFixed!!
        _locateFixed = lucideOutlineIcon(
            name = "LocateFixed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h3")
            addPathData("M19 12h3")
            addPathData("M12 2v3")
            addPathData("M12 19v3")
            addPathData("M19 12c0 3.866-3.134 7-7 7C8.134 19 5 15.866 5 12 5 8.134 8.134 5 12 5c3.866 0 7 3.134 7 7Z")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
        }
        return _locateFixed!!
    }

private var _locateFixed: ImageVector? = null

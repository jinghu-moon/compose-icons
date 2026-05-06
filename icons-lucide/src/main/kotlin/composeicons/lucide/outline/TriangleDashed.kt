package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = lucideOutlineIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.17 4.193c.321-.728 1.042-1.196 1.837-1.193 .795 .003 1.513 .476 1.829 1.206")
            addPathData("M14 21h2")
            addPathData("M15.874 7.743l1 1.732")
            addPathData("M18.849 12.952l1 1.732")
            addPathData("M21.824 18.18c.281 .621 .226 1.342-.145 1.914-.371 .571-1.008 .915-1.69 .91")
            addPathData("M4.024 21c-.686 .008-1.329-.336-1.702-.913-.373-.576-.425-1.303-.137-1.926")
            addPathData("M5.136 12.952l-1 1.732")
            addPathData("M8 21h2")
            addPathData("M8.102 7.743l-1 1.732")
        }
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null

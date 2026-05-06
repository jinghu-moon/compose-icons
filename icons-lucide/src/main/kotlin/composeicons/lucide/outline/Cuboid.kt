package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cuboid: ImageVector
    get() {
        if (_cuboid != null) return _cuboid!!
        _cuboid = lucideOutlineIcon(
            name = "Cuboid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 22v-8")
            addPathData("M2.336 8.89 10 14 21.715 6.971")
            addPathData("M22 14c0 .703-.369 1.354-.971 1.715l-10 6c-.662 .398-1.495 .378-2.138-.05l-6-4C2.334 17.294 2 16.669 2 16v-6C2 9.297 2.369 8.646 2.971 8.285L12.971 2.285c.662-.398 1.495-.378 2.138 .05l6 4c.557 .371 .891 .996 .891 1.665Z")
        }
        return _cuboid!!
    }

private var _cuboid: ImageVector? = null

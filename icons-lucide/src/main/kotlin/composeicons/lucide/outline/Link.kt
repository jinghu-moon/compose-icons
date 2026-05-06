package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = lucideOutlineIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 13c.869 1.162 2.2 1.889 3.647 1.992 1.447 .104 2.868-.426 3.893-1.452l3-3C22.435 8.578 22.408 5.46 20.479 3.531 18.55 1.602 15.432 1.575 13.47 3.47L11.75 5.18")
            addPathData("M14 11C13.131 9.838 11.8 9.111 10.353 9.008 8.906 8.904 7.486 9.434 6.46 10.46l-3 3c-1.895 1.962-1.868 5.08 .061 7.009 1.929 1.929 5.047 1.956 7.009 .061l1.71-1.71")
        }
        return _link!!
    }

private var _link: ImageVector? = null

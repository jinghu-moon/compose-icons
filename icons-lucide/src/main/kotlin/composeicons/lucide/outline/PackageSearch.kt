package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PackageSearch: ImageVector
    get() {
        if (_packageSearch != null) return _packageSearch!!
        _packageSearch = lucideOutlineIcon(
            name = "PackageSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-10")
            addPathData("M20.27 18.27 22 20")
            addPathData("M21 10.498v-2.498C20.999 7.286 20.618 6.627 20 6.27l-7-4c-.619-.357-1.381-.357-2 0l-7 4C3.382 6.627 3.001 7.286 3 8v8c.001 .713 .382 1.372 1 1.729l7 4c.619 .358 1.381 .358 2 .001l.98-.559")
            addPathData("M3.29 7 12 12 20.71 7")
            addPathData("M7.5 4.27l8.997 5.148")
            addPathData("M21 16.5C21 17.881 19.881 19 18.5 19 17.119 19 16 17.881 16 16.5 16 15.119 17.119 14 18.5 14 19.881 14 21 15.119 21 16.5Z")
        }
        return _packageSearch!!
    }

private var _packageSearch: ImageVector? = null

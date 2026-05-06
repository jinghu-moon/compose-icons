package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = lucideOutlineIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21h10")
            addPathData("M12 21c4.971 0 9-4.029 9-9h-18c0 4.971 4.029 9 9 9Z")
            addPathData("M11.38 12C10.124 12.012 9.071 11.053 8.966 9.801 8.861 8.549 9.739 7.428 10.98 7.23c-.195-.863 .101-1.764 .77-2.344 .669-.579 1.603-.743 2.43-.426 .359-.565 .938-.955 1.597-1.075 .659-.12 1.338 .042 1.873 .445 .955-.751 2.321-.669 3.18 .19 .859 .859 .941 2.225 .19 3.18 .458 .608 .6 1.398 .383 2.127-.217 .73-.767 1.313-1.483 1.573 .091 .36 .101 .736 .03 1.1")
            addPathData("M13 12 17 8")
            addPathData("M10.9 7.25C9.777 6.053 8.037 5.666 6.513 6.273 4.989 6.881 3.992 8.359 4 10c0 .73 .2 1.41 .54 2")
        }
        return _salad!!
    }

private var _salad: ImageVector? = null

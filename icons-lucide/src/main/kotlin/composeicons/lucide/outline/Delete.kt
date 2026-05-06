package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Delete: ImageVector
    get() {
        if (_delete != null) return _delete!!
        _delete = lucideOutlineIcon(
            name = "Delete",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c-.497 0-.976 .185-1.344 .519L2.328 11.259c-.209 .19-.328 .458-.328 .741 0 .282 .119 .551 .328 .74l6.328 5.741c.368 .334 .847 .519 1.344 .519h10c1.105 0 2-.895 2-2v-10C22 5.895 21.105 5 20 5Z")
            addPathData("M12 9l6 6")
            addPathData("M18 9l-6 6")
        }
        return _delete!!
    }

private var _delete: ImageVector? = null

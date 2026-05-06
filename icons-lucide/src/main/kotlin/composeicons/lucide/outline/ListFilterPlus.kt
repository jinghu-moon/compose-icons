package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListFilterPlus: ImageVector
    get() {
        if (_listFilterPlus != null) return _listFilterPlus!!
        _listFilterPlus = lucideOutlineIcon(
            name = "ListFilterPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5h-10")
            addPathData("M6 12h12")
            addPathData("M9 19h6")
            addPathData("M16 5h6")
            addPathData("M19 8v-6")
        }
        return _listFilterPlus!!
    }

private var _listFilterPlus: ImageVector? = null

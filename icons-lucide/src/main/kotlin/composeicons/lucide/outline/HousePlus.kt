package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HousePlus: ImageVector
    get() {
        if (_housePlus != null) return _housePlus!!
        _housePlus = lucideOutlineIcon(
            name = "HousePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.35 21h-7.35C3.895 21 3 20.105 3 19v-9C3 9.41 3.259 8.85 3.71 8.47l7-6c.745-.629 1.835-.629 2.58 0l7 6c.451 .38 .71 .94 .71 1.53v2.35")
            addPathData("M14.8 12.4C14.611 12.148 14.315 12 14 12h-4c-.552 0-1 .448-1 1v8")
            addPathData("M15 18h6")
            addPathData("M18 15v6")
        }
        return _housePlus!!
    }

private var _housePlus: ImageVector? = null

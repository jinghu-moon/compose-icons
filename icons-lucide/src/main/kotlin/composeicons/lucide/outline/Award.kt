package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = lucideOutlineIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.477 12.89l1.515 8.526c.035 .206-.062 .411-.242 .516-.18 .105-.407 .086-.568-.046L12.602 19.199c-.355-.265-.842-.265-1.197 0L7.819 21.885c-.161 .132-.387 .15-.567 .046-.18-.104-.277-.309-.243-.515L8.523 12.89")
            addPathData("M18 8c0 3.314-2.686 6-6 6C8.686 14 6 11.314 6 8 6 4.686 8.686 2 12 2c3.314 0 6 2.686 6 6Z")
        }
        return _award!!
    }

private var _award: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = lucideOutlineIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v15")
            addPathData("M7 22C4.791 22 3 20.209 3 18c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1 0 2.209-1.791 4-4 4Z")
            addPathData("M9.159 2.46c.16-.249 .422-.414 .715-.452 .294-.037 .589 .057 .806 .259l9.977 8.98c.314 .274 .425 .714 .278 1.104-.146 .39-.519 .649-.935 .649h-16c-.372 0-.712-.206-.885-.535-.173-.329-.149-.726 .061-1.032Z")
        }
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = lucideOutlineIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20 8.75 17.5 6 18")
            addPathData("M10 4 8.75 6.5 6 6")
            addPathData("M14 20l1.25-2.5L18 18")
            addPathData("M14 4l1.25 2.5L18 6")
            addPathData("M17 21 14 15h-4")
            addPathData("M17 3 14 9l1.5 3")
            addPathData("M2 12h6.5L10 9")
            addPathData("M20 10l-1.5 2L20 14")
            addPathData("M22 12h-6.5L14 15")
            addPathData("M4 10l1.5 2L4 14")
            addPathData("M7 21l3-6L8.5 12")
            addPathData("M7 3l3 6h4")
        }
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null

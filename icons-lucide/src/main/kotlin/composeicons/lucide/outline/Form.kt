package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Form: ImageVector
    get() {
        if (_form != null) return _form!!
        _form = lucideOutlineIcon(
            name = "Form",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14h6")
            addPathData("M4 2h10")
            addPathData("M5 18h14c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-2c0-.552 .448-1 1-1Z")
            addPathData("M5 6h14c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-14C4.448 10 4 9.552 4 9v-2C4 6.448 4.448 6 5 6Z")
        }
        return _form!!
    }

private var _form: ImageVector? = null

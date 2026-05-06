package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListTodo: ImageVector
    get() {
        if (_listTodo != null) return _listTodo!!
        _listTodo = lucideOutlineIcon(
            name = "ListTodo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5h8")
            addPathData("M13 12h8")
            addPathData("M13 19h8")
            addPathData("M3 17l2 2L9 15")
            addPathData("M4 4h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C3.448 10 3 9.552 3 9v-4C3 4.448 3.448 4 4 4Z")
        }
        return _listTodo!!
    }

private var _listTodo: ImageVector? = null

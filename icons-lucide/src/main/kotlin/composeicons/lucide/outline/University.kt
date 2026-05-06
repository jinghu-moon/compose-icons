package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.University: ImageVector
    get() {
        if (_university != null) return _university!!
        _university = lucideOutlineIcon(
            name = "University",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 21v-3c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v3")
            addPathData("M18 12h.01")
            addPathData("M18 16h.01")
            addPathData("M22 7C22 6.448 21.552 6 21 6h-2c-.409-0-.808-.125-1.143-.359L13.143 2.36c-.687-.479-1.599-.479-2.286-.001L6.143 5.64C5.808 5.874 5.409 6 5 6h-2C2.448 6 2 6.448 2 7v12c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2Z")
            addPathData("M6 12h.01")
            addPathData("M6 16h.01")
            addPathData("M14 10c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _university!!
    }

private var _university: ImageVector? = null

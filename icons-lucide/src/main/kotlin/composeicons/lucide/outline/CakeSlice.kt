package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) return _cakeSlice!!
        _cakeSlice = lucideOutlineIcon(
            name = "CakeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 13h-13")
            addPathData("M16 17h-13")
            addPathData("M7.2 7.9 3.812 10.4c-.511 .377-.812 .975-.812 1.61v7.99c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-8.654c0-2-2.44-6.026-6.44-8.026-.341-.195-.764-.173-1.082 .057L10.4 5.6")
            addPathData("M11 7c0 1.105-.895 2-2 2C7.895 9 7 8.105 7 7 7 5.895 7.895 5 9 5c1.105 0 2 .895 2 2Z")
        }
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Save: ImageVector
    get() {
        if (_save != null) return _save!!
        _save = lucideOutlineIcon(
            name = "Save",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.2 3c.528 .008 1.031 .223 1.4 .6l3.8 3.8c.377 .369 .592 .872 .6 1.4v10.2c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M17 21v-7c0-.552-.448-1-1-1h-8c-.552 0-1 .448-1 1v7")
            addPathData("M7 3v4c0 .552 .448 1 1 1h7")
        }
        return _save!!
    }

private var _save: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WheatOff: ImageVector
    get() {
        if (_wheatOff != null) return _wheatOff!!
        _wheatOff = lucideOutlineIcon(
            name = "WheatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 22 12 12")
            addPathData("M16 8 14.83 9.17")
            addPathData("M3.47 12.53 5 11l1.53 1.53c1.36 1.366 1.36 3.574 0 4.94L5 19 3.47 17.47c-1.36-1.366-1.36-3.574 0-4.94Z")
            addPathData("M8 8l-.53 .53c-1.36 1.366-1.36 3.574 0 4.94L9 15l1.53-1.53c.55-.55 .88-1.25 .98-1.97")
            addPathData("M10.91 5.26c.15-.26 .34-.51 .56-.73L13 3l1.53 1.53c1.244 1.25 1.364 3.229 .28 4.62")
            addPathData("M20 2h2v2c0 2.209-1.791 4-4 4h-2v-2C16 3.791 17.791 2 20 2Z")
            addPathData("M11.47 17.47 13 19l-1.53 1.53c-1.366 1.36-3.574 1.36-4.94 0L5 19 6.53 17.47c1.366-1.36 3.574-1.36 4.94 0Z")
            addPathData("M16 16l-.53 .53c-1.366 1.36-3.574 1.36-4.94 0L9 15l1.53-1.53c.534-.531 1.225-.874 1.97-.98")
            addPathData("M18.74 13.09c.26-.15 .51-.34 .73-.56L21 11 19.47 9.47C18.22 8.226 16.241 8.106 14.85 9.19")
            addPathData("M2 2 22 22")
        }
        return _wheatOff!!
    }

private var _wheatOff: ImageVector? = null

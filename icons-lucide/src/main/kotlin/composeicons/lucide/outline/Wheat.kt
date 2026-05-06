package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wheat: ImageVector
    get() {
        if (_wheat != null) return _wheat!!
        _wheat = lucideOutlineIcon(
            name = "Wheat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 22 16 8")
            addPathData("M3.47 12.53 5 11l1.53 1.53c1.36 1.366 1.36 3.574 0 4.94L5 19 3.47 17.47c-1.36-1.366-1.36-3.574 0-4.94Z")
            addPathData("M7.47 8.53 9 7l1.53 1.53c1.36 1.366 1.36 3.574 0 4.94L9 15 7.47 13.47C6.11 12.104 6.11 9.896 7.47 8.53Z")
            addPathData("M11.47 4.53 13 3l1.53 1.53c1.36 1.366 1.36 3.574 0 4.94L13 11 11.47 9.47c-1.36-1.366-1.36-3.574 0-4.94Z")
            addPathData("M20 2h2v2c0 2.209-1.791 4-4 4h-2v-2C16 3.791 17.791 2 20 2Z")
            addPathData("M11.47 17.47 13 19l-1.53 1.53c-1.366 1.36-3.574 1.36-4.94 0L5 19 6.53 17.47c1.366-1.36 3.574-1.36 4.94 0Z")
            addPathData("M15.47 13.47 17 15l-1.53 1.53c-1.366 1.36-3.574 1.36-4.94 0L9 15l1.53-1.53c1.366-1.36 3.574-1.36 4.94 0Z")
            addPathData("M19.47 9.47 21 11l-1.53 1.53c-1.366 1.36-3.574 1.36-4.94 0L13 11 14.53 9.47c1.366-1.36 3.574-1.36 4.94 0Z")
        }
        return _wheat!!
    }

private var _wheat: ImageVector? = null

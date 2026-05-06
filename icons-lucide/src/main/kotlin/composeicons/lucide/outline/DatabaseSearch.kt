package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DatabaseSearch: ImageVector
    get() {
        if (_databaseSearch != null) return _databaseSearch!!
        _databaseSearch = lucideOutlineIcon(
            name = "DatabaseSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 11.693v-6.693")
            addPathData("M22 22 20.125 20.125")
            addPathData("M3 12c0 1.617 3.847 2.944 8.697 2.998")
            addPathData("M3 5v14c-0 .812 .987 1.589 2.735 2.154 1.749 .565 4.11 .87 6.545 .845")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M21 5c0 1.657-4.029 3-9 3C7.029 8 3 6.657 3 5 3 3.343 7.029 2 12 2c4.971 0 9 1.343 9 3Z")
        }
        return _databaseSearch!!
    }

private var _databaseSearch: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DatabaseBackup: ImageVector
    get() {
        if (_databaseBackup != null) return _databaseBackup!!
        _databaseBackup = lucideOutlineIcon(
            name = "DatabaseBackup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5c0 1.657-4.029 3-9 3C7.029 8 3 6.657 3 5 3 3.343 7.029 2 12 2c4.971 0 9 1.343 9 3Z")
            addPathData("M3 12c-.003 1.141 1.935 2.183 5 2.69")
            addPathData("M21 9.3v-4.3")
            addPathData("M3 5v14c-.001 1.332 2.634 2.505 6.47 2.88")
            addPathData("M12 12v4h4")
            addPathData("M13 20c1.291 1.722 3.539 2.424 5.581 1.743C20.623 21.063 22 19.152 22 17c0-2.485-2.015-4.5-4.5-4.5-1.33 0-2.54 .54-3.41 1.41L12 16")
        }
        return _databaseBackup!!
    }

private var _databaseBackup: ImageVector? = null

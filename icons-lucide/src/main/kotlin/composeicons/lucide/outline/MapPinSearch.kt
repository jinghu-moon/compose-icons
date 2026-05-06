package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinSearch: ImageVector
    get() {
        if (_mapPinSearch != null) return _mapPinSearch!!
        _mapPinSearch = lucideOutlineIcon(
            name = "MapPinSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.248 21.969c-.294 .075-.606 .013-.849-.17C9.539 20.193 4 14.993 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 .42-.039 .841-.112 1.262")
            addPathData("M22 22 20.12 20.12")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _mapPinSearch!!
    }

private var _mapPinSearch: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = lucideOutlineIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.914 11.105c.057-.366 .085-.735 .086-1.105C20 5.582 16.418 2 12 2 7.582 2 4 5.582 4 10c0 4.993 5.539 10.193 7.399 11.799 .356 .268 .846 .268 1.202 0 .279-.241 .554-.487 .824-.738")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
            addPathData("M16 18h6")
            addPathData("M19 15v6")
        }
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null

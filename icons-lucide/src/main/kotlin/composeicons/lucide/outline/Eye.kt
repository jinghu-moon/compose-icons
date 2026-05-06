package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = lucideOutlineIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.062 12.348c-.083-.225-.083-.471 0-.696C3.722 7.627 7.646 5.001 12 5.001c4.354 0 8.278 2.626 9.938 6.651 .083 .225 .083 .471 0 .696C20.278 16.373 16.354 18.999 12 18.999c-4.354 0-8.278-2.626-9.938-6.651")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
        }
        return _eye!!
    }

private var _eye: ImageVector? = null

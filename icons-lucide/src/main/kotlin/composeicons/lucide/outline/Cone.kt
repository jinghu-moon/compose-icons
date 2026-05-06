package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = lucideOutlineIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.9 18.55l-8-15.98C12.733 2.225 12.383 2.006 12 2.006c-.383 0-.733 .219-.9 .564L3.1 18.55")
            addPathData("M21 19c0 1.657-4.029 3-9 3C7.029 22 3 20.657 3 19c0-1.657 4.029-3 9-3 4.971 0 9 1.343 9 3Z")
        }
        return _cone!!
    }

private var _cone: ImageVector? = null

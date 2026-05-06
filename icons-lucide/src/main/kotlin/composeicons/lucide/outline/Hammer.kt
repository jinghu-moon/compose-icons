package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = lucideOutlineIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12 5.627 21.373c-.828 .829-2.172 .829-3 .001-.829-.828-.829-2.172-.001-3.001L12 9")
            addPathData("M18 15l4-4")
            addPathData("M21.5 11.5 19.586 9.586C19.211 9.211 19 8.702 19 8.172v-.344c-0-.53-.211-1.039-.586-1.414L16.757 4.757C15.632 3.632 14.107 3 12.516 3h-3.516l1.243 1.243C11.368 5.368 12 6.894 12 8.485v1.515l2 2h1.172c.53 0 1.039 .211 1.414 .586l1.914 1.914")
        }
        return _hammer!!
    }

private var _hammer: ImageVector? = null

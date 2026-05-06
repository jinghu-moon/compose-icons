package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = lucideOutlineIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.67 19c.531-0 1.041-.212 1.416-.588l6.154-6.172c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0L5.586 9.914c-.375 .375-.586 .884-.586 1.414v6.672c0 .552 .448 1 1 1Z")
            addPathData("M16 8 2 22")
            addPathData("M17.5 15h-8.5")
        }
        return _feather!!
    }

private var _feather: ImageVector? = null

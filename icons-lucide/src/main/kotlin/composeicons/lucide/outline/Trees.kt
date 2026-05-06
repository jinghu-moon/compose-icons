package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Trees: ImageVector
    get() {
        if (_trees != null) return _trees!!
        _trees = lucideOutlineIcon(
            name = "Trees",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10v.2c1.353 .52 2.141 1.934 1.871 3.359C11.6 14.984 10.35 16.011 8.9 16h-3.9C3.568 15.964 2.362 14.922 2.118 13.511 1.875 12.099 2.663 10.713 4 10.2v-.2C4 8.343 5.343 7 7 7c1.657 0 3 1.343 3 3Z")
            addPathData("M7 16v6")
            addPathData("M13 19v3")
            addPathData("M12 19h8.3c.4-.006 .758-.249 .911-.619 .152-.37 .069-.795-.211-1.081L18 14h.3c.4-.006 .758-.249 .911-.619 .152-.37 .069-.795-.211-1.081L16 9h.2c.418 .038 .816-.19 .995-.57 .179-.38 .101-.832-.195-1.13L13 3 11.6 4.5")
        }
        return _trees!!
    }

private var _trees: ImageVector? = null

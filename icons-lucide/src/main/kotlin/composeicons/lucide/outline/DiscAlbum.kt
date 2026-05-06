package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DiscAlbum: ImageVector
    get() {
        if (_discAlbum != null) return _discAlbum!!
        _discAlbum = lucideOutlineIcon(
            name = "DiscAlbum",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M17 12c0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12 7 9.239 9.239 7 12 7c2.761 0 5 2.239 5 5Z")
            addPathData("M12 12h.01")
        }
        return _discAlbum!!
    }

private var _discAlbum: ImageVector? = null

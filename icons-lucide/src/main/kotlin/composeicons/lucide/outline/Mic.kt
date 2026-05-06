package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mic: ImageVector
    get() {
        if (_mic != null) return _mic!!
        _mic = lucideOutlineIcon(
            name = "Mic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v3")
            addPathData("M19 10v2c0 3.866-3.134 7-7 7C8.134 19 5 15.866 5 12v-2")
            addPathData("M12 2h0c1.657 0 3 1.343 3 3v7c0 1.657-1.343 3-3 3h0C10.343 15 9 13.657 9 12v-7C9 3.343 10.343 2 12 2Z")
        }
        return _mic!!
    }

private var _mic: ImageVector? = null

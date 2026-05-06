package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = lucideOutlineIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v12")
            addPathData("M17 8 12 3 7 8")
            addPathData("M21 15v4c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-4")
        }
        return _upload!!
    }

private var _upload: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pyramid: ImageVector
    get() {
        if (_pyramid != null) return _pyramid!!
        _pyramid = lucideOutlineIcon(
            name = "Pyramid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.5 16.88c-.24-.14-.411-.374-.472-.645-.061-.271-.006-.556 .152-.785L11.18 2.43c.187-.268 .493-.428 .82-.428 .327 0 .633 .16 .82 .428l9 13.01c.161 .23 .218 .517 .157 .79-.061 .274-.234 .51-.477 .65l-8.51 4.86c-.614 .35-1.366 .35-1.98 0Z")
            addPathData("M12 2v20")
        }
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null

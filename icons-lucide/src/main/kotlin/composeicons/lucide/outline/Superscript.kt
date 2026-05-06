package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Superscript: ImageVector
    get() {
        if (_superscript != null) return _superscript!!
        _superscript = lucideOutlineIcon(
            name = "Superscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19l8-8")
            addPathData("M12 19 4 11")
            addPathData("M20 12h-4c0-1.5 .442-2 1.5-2.5C18.558 9 20 8.334 20 7.002c0-.472-.17-.93-.484-1.29-.659-.746-1.751-.928-2.617-.436-.42 .239-.738 .614-.899 1.06")
        }
        return _superscript!!
    }

private var _superscript: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = lucideOutlineIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v12")
            addPathData("M17.196 9 6.804 15")
            addPathData("M6.804 9l10.392 6")
        }
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null

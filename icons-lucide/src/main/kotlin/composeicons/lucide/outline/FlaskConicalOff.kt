package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlaskConicalOff: ImageVector
    get() {
        if (_flaskConicalOff != null) return _flaskConicalOff!!
        _flaskConicalOff = lucideOutlineIcon(
            name = "FlaskConicalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v2.343")
            addPathData("M14 2v6.343")
            addPathData("M2 2 22 22")
            addPathData("M20 20c0 1.105-.895 2-2 2h-12c-.706 0-1.361-.372-1.721-.98-.36-.608-.373-1.36-.034-1.98L9.472 9.477")
            addPathData("M6.453 15h8.547")
            addPathData("M8.5 2h7")
        }
        return _flaskConicalOff!!
    }

private var _flaskConicalOff: ImageVector? = null

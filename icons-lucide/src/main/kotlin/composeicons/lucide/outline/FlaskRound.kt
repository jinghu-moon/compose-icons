package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlaskRound: ImageVector
    get() {
        if (_flaskRound != null) return _flaskRound!!
        _flaskRound = lucideOutlineIcon(
            name = "FlaskRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v6.292C6.669 9.285 4.572 12.572 5.073 16.011c.502 3.439 3.451 5.989 6.927 5.989 3.476 0 6.425-2.55 6.927-5.989C19.428 12.572 17.331 9.285 14 8.292v-6.292")
            addPathData("M5 15h14")
            addPathData("M8.5 2h7")
        }
        return _flaskRound!!
    }

private var _flaskRound: ImageVector? = null

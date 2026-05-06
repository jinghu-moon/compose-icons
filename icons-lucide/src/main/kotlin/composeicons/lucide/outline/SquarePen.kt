package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquarePen: ImageVector
    get() {
        if (_squarePen != null) return _squarePen!!
        _squarePen = lucideOutlineIcon(
            name = "SquarePen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3h-7C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-7")
            addPathData("M18.375 2.625c.828-.828 2.172-.828 3 0 .828 .828 .828 2.172 0 3l-9.013 9.014c-.237 .237-.531 .411-.853 .505l-2.873 .84c-.175 .051-.364 .003-.494-.126-.129-.129-.178-.318-.126-.494l.84-2.873c.095-.322 .269-.615 .506-.852Z")
        }
        return _squarePen!!
    }

private var _squarePen: ImageVector? = null

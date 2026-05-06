package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = lucideOutlineIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h13c.552 0 1 .448 1 1 0 2.761-2.239 5-5 5h-.598c-.182 0-.349 .099-.437 .258-.088 .159-.083 .353 .013 .507l1.544 2.47c.096 .154 .101 .348 .013 .507-.088 .159-.256 .258-.437 .258h-10.696c-.182 0-.349-.099-.437-.258-.088-.159-.083-.353 .013-.507L7 18")
            addPathData("M8 18C5.239 18 3 15.761 3 13v-9C3 2.895 3.895 2 5 2h8c1.105 0 2 .895 2 2v8")
        }
        return _toilet!!
    }

private var _toilet: ImageVector? = null

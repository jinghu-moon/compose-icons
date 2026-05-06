package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = lucideOutlineIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 14l-1 1")
            addPathData("M13.75 18.25l-1.25 1.42")
            addPathData("M17.775 5.654C11.689 6.933 6.933 11.688 5.654 17.774")
            addPathData("M18.8 9.3C16.674 9.88 15.42 12.074 16 14.2c.58 2.126 2.774 3.38 4.9 2.8")
            addPathData("M21.964 20.732c.097 .348-.001 .721-.256 .976-.255 .255-.628 .353-.976 .256l-18-5c-.256-.071-.472-.241-.603-.472-.13-.231-.164-.504-.092-.76C3.884 9.081 9.081 3.884 15.732 2.037c.256-.071 .529-.038 .76 .092 .231 .13 .401 .347 .472 .603Z")
        }
        return _pizza!!
    }

private var _pizza: ImageVector? = null

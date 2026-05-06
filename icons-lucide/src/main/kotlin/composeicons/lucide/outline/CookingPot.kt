package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = lucideOutlineIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h20")
            addPathData("M20 12v8c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-8")
            addPathData("M4 8 20 4")
            addPathData("M8.86 6.78 8.41 4.97C8.28 4.455 8.359 3.91 8.631 3.454c.272-.456 .714-.785 1.229-.914l1.94-.48c.516-.13 1.062-.049 1.518 .225 .456 .274 .784 .718 .912 1.235l.45 1.8")
        }
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null

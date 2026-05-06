package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = lucideOutlineIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16c1.184-.002 2.258 .693 2.742 1.773 .484 1.08 .287 2.344-.502 3.227")
            addPathData("M18 12h.01")
            addPathData("M18 21h-8C7.791 21 6 19.209 6 17c0-3.866 3.134-7 7-7h.2L9.6 6.4c-.773-.773-.773-2.027 0-2.8 .773-.773 2.027-.773 2.8 0L15.8 7h.2c3.3 0 6 2.7 6 6v1c0 1.105-.895 2-2 2h-1c-1.657 0-3 1.343-3 3")
            addPathData("M20 8.54v-4.54C20 2.895 19.105 2 18 2c-1.105 0-2 .895-2 2v3")
            addPathData("M7.612 12.524C6.829 11.139 5.102 10.606 3.675 11.308c-1.427 .703-2.058 2.397-1.437 3.862 .621 1.465 2.277 2.19 3.774 1.654")
        }
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null

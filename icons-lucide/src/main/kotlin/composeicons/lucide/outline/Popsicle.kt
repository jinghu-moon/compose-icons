package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = lucideOutlineIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.6 14.4c.8-.8 .8-2 0-2.8L10.5 3.5C8.539 1.539 5.361 1.539 3.4 3.5c-1.961 1.961-1.961 5.139 0 7.1l8.1 8.1c.9 .7 2.1 .7 2.9-.1Z")
            addPathData("M22 22 16.5 16.5")
        }
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null

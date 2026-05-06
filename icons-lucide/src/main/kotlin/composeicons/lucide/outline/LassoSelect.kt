package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LassoSelect: ImageVector
    get() {
        if (_lassoSelect != null) return _lassoSelect!!
        _lassoSelect = lucideOutlineIcon(
            name = "LassoSelect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 22C5.741 21.056 5 19.574 5 18")
            addPathData("M7 16.93c.96 .43 1.96 .74 2.99 .91")
            addPathData("M3.34 14C2.481 12.842 2.011 11.442 2 10 2 5.58 6.48 2 12 2c5.52 0 10 3.58 10 8-.015 .679-.126 1.352-.33 2")
            addPathData("M5 18c1.105 0 2-.895 2-2C7 14.895 6.105 14 5 14c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z")
            addPathData("M14.33 22h-.09c-.139-.046-.235-.174-.24-.32v-10c-0-.184 .146-.335 .33-.34 .08 0 .15 .03 .21 .08l7.34 6c.112 .087 .155 .237 .108 .371-.048 .134-.176 .222-.318 .219h-4.49l-2.57 3.85c-.066 .088-.17 .14-.28 .14Z")
        }
        return _lassoSelect!!
    }

private var _lassoSelect: ImageVector? = null

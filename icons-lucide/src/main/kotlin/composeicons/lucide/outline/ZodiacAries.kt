package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacAries: ImageVector
    get() {
        if (_zodiacAries != null) return _zodiacAries!!
        _zodiacAries = lucideOutlineIcon(
            name = "ZodiacAries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7.5c.015-2.417 1.936-4.39 4.351-4.47 2.415-.08 4.462 1.763 4.637 4.173C21.162 9.614 19.402 11.731 17 12")
            addPathData("M7 12C4.598 11.731 2.838 9.614 3.012 7.203 3.186 4.793 5.233 2.951 7.649 3.03c2.415 .08 4.337 2.053 4.351 4.47v13.5")
        }
        return _zodiacAries!!
    }

private var _zodiacAries: ImageVector? = null

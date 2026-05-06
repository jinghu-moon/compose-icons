package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacAquarius: ImageVector
    get() {
        if (_zodiacAquarius != null) return _zodiacAquarius!!
        _zodiacAquarius = lucideOutlineIcon(
            name = "ZodiacAquarius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 10 4.456 6.316c.131-.172 .334-.275 .55-.277 .216-.003 .422 .095 .556 .264L7.952 9.716c.133 .167 .335 .264 .548 .264 .213-0 .415-.098 .548-.265L11.45 6.283c.133-.168 .335-.266 .549-.266 .214 0 .416 .098 .549 .266l2.402 3.432c.133 .168 .335 .266 .549 .266 .214 0 .416-.098 .549-.266L18.437 6.302c.135-.169 .34-.267 .556-.264 .216 .003 .419 .105 .55 .277L22 10")
            addPathData("M2 18.002 4.456 14.318c.131-.172 .334-.275 .55-.277 .216-.003 .422 .095 .556 .264l2.39 3.413c.133 .167 .335 .265 .548 .265 .214 0 .416-.098 .549-.265l2.402-3.432c.133-.168 .335-.266 .549-.266 .214 0 .416 .098 .549 .266l2.402 3.432c.133 .168 .335 .266 .549 .266 .214 0 .416-.098 .549-.266l2.389-3.413c.135-.169 .34-.267 .556-.264 .216 .003 .419 .105 .55 .277L22 18.002")
        }
        return _zodiacAquarius!!
    }

private var _zodiacAquarius: ImageVector? = null

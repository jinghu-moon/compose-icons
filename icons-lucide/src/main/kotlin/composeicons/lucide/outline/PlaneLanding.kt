package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlaneLanding: ImageVector
    get() {
        if (_planeLanding != null) return _planeLanding!!
        _planeLanding = lucideOutlineIcon(
            name = "PlaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 22h20")
            addPathData("M3.77 10.77 2 9 4 4.5l1.1 .55C5.65 5.33 6 5.89 6 6.5c0 .61 .35 1.17 .9 1.45L8 8.5l3-6 1.05 .53c.592 .295 1.001 .864 1.09 1.52l.72 5.4c.089 .656 .498 1.225 1.09 1.52l4.4 2.2c.42 .22 .78 .55 1.01 .96l.6 1.03c.49 .88-.06 1.98-1.06 2.1l-1.18 .15c-.47 .06-.95-.02-1.37-.24L4.29 11.15c-.193-.098-.368-.226-.52-.38Z")
        }
        return _planeLanding!!
    }

private var _planeLanding: ImageVector? = null

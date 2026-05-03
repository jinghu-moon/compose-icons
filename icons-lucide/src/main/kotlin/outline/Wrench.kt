package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = lucideOutlineIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.700 6.300 C 14.319 6.689 14.319 7.311 14.700 7.700 L 16.300 9.300 C 16.689 9.681 17.311 9.681 17.700 9.300 L 20.806 6.195 C 21.126 5.873 21.669 5.975 21.789 6.413 C 22.406 8.656 21.670 11.054 19.901 12.565 C 18.133 14.077 15.650 14.429 13.530 13.470 L 5.620 21.380 C 4.792 22.208 3.449 22.208 2.621 21.379 C 1.792 20.551 1.793 19.208 2.621 18.380 L 10.531 10.470 C 9.572 8.350 9.924 5.867 11.436 4.099 C 12.947 2.330 15.345 1.594 17.588 2.211 C 18.026 2.331 18.128 2.873 17.807 3.195 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null

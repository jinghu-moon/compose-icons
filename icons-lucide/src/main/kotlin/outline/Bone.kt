package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = lucideOutlineIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 10.000 C 17.700 9.300 18.690 10.000 19.500 10.000 C 20.881 10.000 22.000 8.881 22.000 7.500 C 22.000 6.119 20.881 5.000 19.500 5.000 C 19.224 5.000 19.000 4.776 19.000 4.500 C 19.000 3.119 17.881 2.000 16.500 2.000 C 15.119 2.000 14.000 3.119 14.000 4.500 C 14.000 5.310 14.700 6.300 14.000 7.000 L 7.000 14.000 C 6.300 14.700 5.310 14.000 4.500 14.000 C 3.119 14.000 2.000 15.119 2.000 16.500 C 2.000 17.881 3.119 19.000 4.500 19.000 C 4.780 19.000 5.000 19.220 5.000 19.500 C 5.000 20.881 6.119 22.000 7.500 22.000 C 8.881 22.000 10.000 20.881 10.000 19.500 C 10.000 18.690 9.300 17.700 10.000 17.000 Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null

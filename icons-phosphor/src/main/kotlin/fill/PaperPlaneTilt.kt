package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorFillIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.400 44.340 C 231.400 44.340 231.400 44.440 231.400 44.490 L 173.200 236.430 C 171.396 242.814 165.813 247.405 159.200 247.940 Q 158.510 248.000 157.820 248.000 C 151.641 248.019 146.014 244.448 143.400 238.850 L 107.000 164.150 C 106.253 162.615 106.563 160.776 107.770 159.570 L 165.690 101.650 C 168.678 98.505 168.615 93.551 165.547 90.483 C 162.479 87.415 157.525 87.352 154.380 90.340 L 96.430 148.260 C 95.224 149.467 93.385 149.777 91.850 149.030 L 17.080 112.640 C 11.094 109.768 7.504 103.498 8.056 96.882 C 8.609 90.266 13.190 84.679 19.570 82.840 L 211.510 24.640 L 211.660 24.640 C 217.224 23.077 223.199 24.636 227.290 28.718 C 231.381 32.801 232.952 38.773 231.400 44.340 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null

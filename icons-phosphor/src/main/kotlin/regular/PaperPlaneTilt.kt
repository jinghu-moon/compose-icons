package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorRegularIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.320 28.680 C 223.223 24.586 217.234 23.025 211.660 24.600 L 211.510 24.600 L 19.570 82.840 C 13.190 84.679 8.609 90.266 8.056 96.882 C 7.504 103.498 11.094 109.768 17.080 112.640 L 102.000 154.000 L 143.300 238.870 C 145.923 244.467 151.559 248.031 157.740 248.000 Q 158.430 248.000 159.120 247.940 C 165.733 247.405 171.316 242.814 173.120 236.430 L 231.320 44.490 C 231.320 44.440 231.320 44.390 231.320 44.340 C 232.915 38.781 231.386 32.793 227.320 28.680 ZM 157.830 231.850 L 157.780 231.990 L 157.780 231.920 L 117.720 149.620 L 165.720 101.620 C 168.708 98.475 168.645 93.521 165.577 90.453 C 162.509 87.385 157.555 87.322 154.410 90.310 L 106.410 138.310 L 24.080 98.250 L 24.010 98.250 L 24.150 98.250 L 216.000 40.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null

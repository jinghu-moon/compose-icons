package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorBoldIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 80.000 C 177.673 80.000 192.000 65.673 192.000 48.000 C 192.000 30.327 177.673 16.000 160.000 16.000 C 142.327 16.000 128.000 30.327 128.000 48.000 C 128.000 65.673 142.327 80.000 160.000 80.000 ZM 160.000 40.000 C 164.418 40.000 168.000 43.582 168.000 48.000 C 168.000 52.418 164.418 56.000 160.000 56.000 C 155.582 56.000 152.000 52.418 152.000 48.000 C 152.000 43.582 155.582 40.000 160.000 40.000 ZM 254.320 193.880 L 199.760 101.800 C 196.179 95.700 189.623 91.967 182.550 92.000 L 182.550 92.000 C 175.480 91.967 168.926 95.701 165.350 101.800 L 146.650 133.350 L 109.230 69.850 C 105.634 63.750 99.081 60.005 92.000 60.005 C 84.919 60.005 78.366 63.750 74.770 69.850 L 1.660 193.910 C -0.525 197.620 -0.555 202.217 1.582 205.955 C 3.718 209.693 7.694 212.000 12.000 212.000 L 244.000 212.000 C 248.312 211.999 252.291 209.685 254.425 205.939 C 256.559 202.192 256.519 197.589 254.320 193.880 ZM 92.000 87.870 L 108.570 116.000 L 75.430 116.000 ZM 33.000 188.000 L 61.280 140.000 L 122.720 140.000 L 151.000 188.000 ZM 178.860 188.000 L 160.560 157.000 L 182.560 119.900 L 222.940 188.000 Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null

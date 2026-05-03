package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorDuotoneIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 171.680 167.880 L 134.150 213.120 C 132.630 214.947 130.377 216.004 128.000 216.004 C 125.623 216.004 123.370 214.947 121.850 213.120 L 84.320 167.880 C 109.589 146.701 146.411 146.701 171.680 167.880 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 247.890 80.910 C 247.384 76.619 245.158 72.717 241.720 70.100 C 209.036 45.237 169.066 31.846 128.000 32.000 C 86.934 31.846 46.964 45.237 14.280 70.100 C 10.842 72.717 8.616 76.619 8.110 80.910 C 7.602 85.192 8.882 89.494 11.650 92.800 L 115.650 218.230 C 118.694 221.906 123.227 224.024 128.000 224.000 L 128.000 224.000 C 132.759 224.012 137.275 221.896 140.310 218.230 L 140.310 218.230 L 244.310 92.800 C 247.092 89.500 248.387 85.197 247.890 80.910 ZM 128.000 208.000 L 95.900 169.300 C 115.500 156.888 140.500 156.888 160.100 169.300 ZM 170.370 156.920 C 144.754 139.681 111.246 139.681 85.630 156.920 L 24.090 82.740 C 53.971 60.061 90.488 47.852 128.000 48.000 C 165.512 47.852 202.029 60.061 231.910 82.740 Z"),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null

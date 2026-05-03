package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorDuotoneIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 206.630 94.630 L 182.630 118.630 C 128.000 128.000 40.000 216.000 40.000 216.000 C 40.000 216.000 128.000 128.000 137.370 73.370 L 161.370 49.370 C 173.868 36.872 194.132 36.872 206.630 49.370 C 219.128 61.868 219.128 82.132 206.630 94.630 Z"),
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
        pathData = parseSvgPathData("M 189.660 66.340 C 191.162 67.841 192.006 69.877 192.006 72.000 C 192.006 74.123 191.162 76.159 189.660 77.660 L 173.660 93.660 C 170.534 96.786 165.466 96.786 162.340 93.660 C 159.214 90.534 159.214 85.466 162.340 82.340 L 178.340 66.340 C 179.841 64.838 181.877 63.994 184.000 63.994 C 186.123 63.994 188.159 64.838 189.660 66.340 ZM 224.000 72.000 C 224.030 82.614 219.809 92.799 212.280 100.280 L 188.280 124.280 C 187.112 125.450 185.609 126.229 183.980 126.510 C 132.490 135.350 46.520 220.790 45.660 221.660 L 45.660 221.660 C 42.534 224.783 37.468 224.781 34.345 221.655 C 31.222 218.529 31.224 213.463 34.350 210.340 L 34.350 210.340 C 36.000 208.730 120.690 123.280 129.490 72.000 C 129.771 70.371 130.550 68.868 131.720 67.700 L 155.720 43.700 C 167.162 32.261 184.369 28.842 199.315 35.037 C 214.262 41.232 224.005 55.821 224.000 72.000 ZM 208.000 72.000 C 208.024 62.275 202.176 53.496 193.192 49.771 C 184.209 46.046 173.865 48.111 167.000 55.000 L 144.770 77.290 C 140.360 98.440 125.870 123.480 109.280 146.720 C 132.520 130.130 157.560 115.640 178.710 111.230 L 201.000 89.000 C 205.511 84.496 208.032 78.374 208.000 72.000 Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null

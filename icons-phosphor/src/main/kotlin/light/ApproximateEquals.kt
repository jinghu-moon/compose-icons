package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorLightIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.620 154.570 C 221.636 155.795 222.124 157.374 221.976 158.959 C 221.827 160.543 221.056 162.004 219.830 163.020 C 202.960 177.020 187.830 182.020 174.080 182.020 C 155.890 182.020 139.950 173.360 125.140 165.310 C 99.140 151.190 76.700 139.000 43.830 166.310 C 41.259 168.425 37.460 168.056 35.345 165.485 C 33.230 162.914 33.599 159.115 36.170 157.000 C 75.300 124.540 104.820 140.580 130.860 154.730 C 156.900 168.880 179.300 181.040 212.170 153.730 C 213.401 152.720 214.984 152.241 216.569 152.398 C 218.154 152.556 219.612 153.337 220.620 154.570 ZM 43.830 102.220 C 76.700 74.950 99.150 87.140 125.140 101.220 C 139.950 109.220 155.890 117.930 174.080 117.930 C 187.870 117.930 202.960 112.930 219.830 98.930 C 222.382 96.815 222.735 93.032 220.620 90.480 C 218.505 87.928 214.722 87.575 212.170 89.690 C 179.300 116.960 156.850 104.770 130.860 90.690 C 104.870 76.610 75.300 60.520 36.170 93.000 C 33.618 95.115 33.265 98.898 35.380 101.450 C 37.495 104.002 41.278 104.355 43.830 102.240 Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null

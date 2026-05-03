package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorLightIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.680 129.340 C 206.510 146.960 192.620 156.260 178.220 157.780 C 176.818 157.926 175.410 158.000 174.000 158.000 C 155.360 158.000 139.560 145.130 124.240 132.650 C 108.920 120.170 94.570 108.510 79.000 110.160 C 67.940 111.320 56.700 119.160 44.640 134.160 C 42.563 136.745 38.785 137.157 36.200 135.080 C 33.615 133.003 33.203 129.225 35.280 126.640 C 49.450 109.030 63.340 99.720 77.740 98.210 C 98.260 96.030 115.280 109.910 131.740 123.330 C 147.000 135.760 161.420 147.480 177.000 145.840 C 188.060 144.680 199.300 136.840 211.360 121.840 C 213.437 119.255 217.215 118.843 219.800 120.920 C 222.385 122.997 222.797 126.775 220.720 129.360 Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null

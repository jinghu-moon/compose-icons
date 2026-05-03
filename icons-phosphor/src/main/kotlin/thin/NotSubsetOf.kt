package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorThinIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.690 37.000 C 209.055 35.515 206.526 35.635 205.040 37.270 L 199.000 44.000 L 128.000 44.000 C 94.046 44.026 63.447 64.490 50.456 95.860 C 37.464 127.230 44.636 163.336 68.630 187.360 L 45.000 213.310 C 43.514 214.967 43.653 217.514 45.310 219.000 C 46.967 220.486 49.514 220.347 51.000 218.690 L 74.580 192.750 C 89.597 205.200 108.493 212.009 128.000 212.000 L 200.000 212.000 C 202.209 212.000 204.000 210.209 204.000 208.000 C 204.000 205.791 202.209 204.000 200.000 204.000 L 128.000 204.000 C 110.470 204.015 93.479 197.942 79.930 186.820 L 211.000 42.690 C 211.721 41.898 212.094 40.850 212.036 39.780 C 211.977 38.711 211.493 37.709 210.690 37.000 ZM 52.000 128.000 C 52.044 86.045 86.045 52.044 128.000 52.000 L 191.690 52.000 L 74.000 181.430 C 59.895 167.226 51.986 148.017 52.000 128.000 Z"),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null

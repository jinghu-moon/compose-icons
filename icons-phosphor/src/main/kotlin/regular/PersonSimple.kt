package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorRegularIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 80.000 C 145.673 80.000 160.000 65.673 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 C 96.000 65.673 110.327 80.000 128.000 80.000 ZM 128.000 32.000 C 136.837 32.000 144.000 39.163 144.000 48.000 C 144.000 56.837 136.837 64.000 128.000 64.000 C 119.163 64.000 112.000 56.837 112.000 48.000 C 112.000 39.163 119.163 32.000 128.000 32.000 ZM 230.860 132.120 C 229.768 133.945 227.993 135.260 225.929 135.775 C 223.865 136.289 221.681 135.960 219.860 134.860 C 219.510 134.650 184.750 114.270 135.980 112.190 L 135.980 149.000 L 197.980 218.730 C 200.913 222.044 200.604 227.107 197.290 230.040 C 193.976 232.973 188.913 232.664 185.980 229.350 L 128.000 164.000 L 70.000 229.310 C 67.067 232.624 62.004 232.933 58.690 230.000 C 55.376 227.067 55.067 222.004 58.000 218.690 L 120.000 149.000 L 120.000 112.180 C 71.000 114.260 36.480 134.640 36.120 134.860 C 33.668 136.367 30.595 136.440 28.073 135.051 C 25.552 133.663 23.971 131.027 23.933 128.149 C 23.895 125.271 25.406 122.594 27.890 121.140 C 29.600 120.110 70.450 96.000 128.000 96.000 C 185.550 96.000 226.400 120.110 228.120 121.140 C 229.940 122.232 231.251 124.003 231.765 126.062 C 232.279 128.122 231.953 130.301 230.860 132.120 Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null

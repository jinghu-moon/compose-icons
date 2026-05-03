package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorFillIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 128.000 C 232.000 128.510 232.000 129.000 232.000 129.520 C 231.660 143.780 226.370 160.000 204.000 160.000 C 180.860 160.000 176.000 142.600 176.000 128.000 L 176.000 88.000 C 176.005 85.783 175.090 83.664 173.473 82.147 C 171.856 80.631 169.682 79.853 167.470 80.000 C 163.195 80.367 159.932 83.979 160.000 88.270 L 160.000 92.270 C 145.217 79.020 123.802 76.238 106.124 85.271 C 88.446 94.304 78.152 113.287 80.227 133.031 C 82.301 152.774 96.316 169.203 115.485 174.364 C 134.655 179.525 155.023 172.353 166.730 156.320 C 167.730 158.069 168.860 159.740 170.110 161.320 C 175.480 168.000 185.710 176.000 204.000 176.000 C 207.089 176.010 210.173 175.759 213.220 175.250 C 214.758 174.994 216.305 175.654 217.183 176.943 C 218.061 178.231 218.111 179.912 217.310 181.250 C 198.170 213.355 163.281 232.728 125.910 232.000 C 71.130 230.900 26.200 186.860 24.080 132.110 C 22.604 94.501 41.563 59.029 73.654 39.361 C 105.744 19.693 145.957 18.898 178.800 37.283 C 211.642 55.667 231.989 90.362 232.000 128.000 ZM 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null

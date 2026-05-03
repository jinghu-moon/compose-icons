package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorFillIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 124.000 192.000 C 110.706 192.022 98.120 186.012 89.780 175.660 C 87.071 172.221 87.630 167.243 91.035 164.490 C 94.439 161.737 99.423 162.232 102.220 165.600 C 110.261 175.547 124.020 178.781 135.651 173.457 C 147.281 168.133 153.824 155.604 151.549 143.017 C 149.274 130.431 138.758 120.986 126.000 120.070 C 123.006 119.857 120.383 117.987 119.207 115.225 C 118.031 112.464 118.499 109.276 120.420 106.970 L 142.900 79.970 L 96.000 79.970 C 91.582 79.970 88.000 76.388 88.000 71.970 C 88.000 67.552 91.582 63.970 96.000 63.970 L 160.000 63.970 C 163.104 63.969 165.929 65.764 167.247 68.575 C 168.564 71.385 168.137 74.705 166.150 77.090 L 140.920 107.360 C 160.313 115.407 171.318 136.036 167.203 156.625 C 163.087 177.214 144.997 192.027 124.000 192.000 Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null

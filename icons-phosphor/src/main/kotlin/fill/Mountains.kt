package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorFillIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 254.880 195.920 L 200.320 103.840 C 197.456 98.958 192.210 95.971 186.550 96.000 L 186.550 96.000 C 180.893 95.970 175.649 98.958 172.790 103.840 L 157.150 130.230 C 156.408 131.485 156.408 133.045 157.150 134.300 L 183.950 179.770 C 186.055 183.263 185.247 187.775 182.060 190.320 C 180.243 191.730 177.908 192.291 175.649 191.858 C 173.390 191.426 171.427 190.042 170.260 188.060 L 101.790 71.880 C 98.915 66.994 93.669 63.994 88.000 63.994 C 82.331 63.994 77.085 66.994 74.210 71.880 L 1.110 195.940 C -0.701 198.985 -0.295 202.858 2.110 205.460 C 3.704 207.127 5.924 208.048 8.230 208.000 L 247.770 208.000 C 250.066 208.030 252.271 207.107 253.860 205.450 C 256.276 202.851 256.691 198.971 254.880 195.920 ZM 64.430 120.000 L 88.000 80.000 L 111.570 120.000 ZM 140.000 52.000 C 140.000 38.745 150.745 28.000 164.000 28.000 C 177.255 28.000 188.000 38.745 188.000 52.000 C 188.000 65.255 177.255 76.000 164.000 76.000 C 150.745 76.000 140.000 65.255 140.000 52.000 Z"),
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

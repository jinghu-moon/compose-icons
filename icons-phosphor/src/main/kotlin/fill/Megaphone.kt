package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorFillIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 72.000 L 160.200 72.000 C 157.290 71.830 106.580 68.260 58.290 27.760 C 53.529 23.762 46.883 22.883 41.247 25.507 C 35.611 28.131 32.005 33.783 32.000 40.000 L 32.000 200.000 C 32.001 206.219 35.605 211.874 41.242 214.501 C 46.879 217.127 53.528 216.250 58.290 212.250 C 96.060 180.570 135.290 171.490 152.000 168.950 L 152.000 200.670 C 151.993 206.025 154.666 211.028 159.120 214.000 L 170.120 221.330 C 174.434 224.210 179.877 224.819 184.721 222.965 C 189.565 221.111 193.210 217.024 194.500 212.000 L 206.270 167.640 C 231.532 164.536 249.979 142.255 248.314 116.858 C 246.649 91.461 225.451 71.779 200.000 72.000 ZM 179.000 207.890 L 179.000 208.000 L 168.000 200.670 L 168.000 168.000 L 189.600 168.000 ZM 200.000 152.000 L 168.000 152.000 L 168.000 88.000 L 200.000 88.000 C 217.673 88.000 232.000 102.327 232.000 120.000 C 232.000 137.673 217.673 152.000 200.000 152.000 Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null

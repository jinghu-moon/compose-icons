package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorRegularIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 120.000 C 247.972 93.502 226.498 72.028 200.000 72.000 L 160.200 72.000 C 157.290 71.830 106.580 68.260 58.290 27.760 C 53.529 23.762 46.883 22.883 41.247 25.507 C 35.611 28.131 32.005 33.783 32.000 40.000 L 32.000 200.000 C 32.001 206.219 35.605 211.874 41.242 214.501 C 46.879 217.127 53.528 216.250 58.290 212.250 C 96.060 180.570 135.290 171.490 152.000 168.950 L 152.000 200.670 C 151.993 206.025 154.666 211.028 159.120 214.000 L 170.120 221.330 C 174.434 224.210 179.877 224.819 184.721 222.965 C 189.565 221.111 193.210 217.024 194.500 212.000 L 206.270 167.640 C 230.154 164.462 247.995 144.094 248.000 120.000 ZM 48.000 199.930 L 48.000 40.000 L 48.000 40.000 C 90.810 75.910 134.630 85.000 152.000 87.240 L 152.000 152.720 C 134.650 155.000 90.840 164.070 48.000 199.930 ZM 179.000 207.930 L 179.000 208.040 L 168.000 200.710 L 168.000 168.000 L 189.600 168.000 ZM 200.000 152.000 L 168.000 152.000 L 168.000 88.000 L 200.000 88.000 C 217.673 88.000 232.000 102.327 232.000 120.000 C 232.000 137.673 217.673 152.000 200.000 152.000 Z"),
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

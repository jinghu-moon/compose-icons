package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorFillIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 88.000 L 136.000 88.000 L 136.000 79.000 C 150.122 75.332 159.986 62.591 160.000 48.000 C 160.000 20.000 133.560 2.090 132.440 1.340 C 129.752 -0.454 126.248 -0.454 123.560 1.340 C 122.440 2.090 96.000 20.000 96.000 48.000 C 96.014 62.591 105.878 75.332 120.000 79.000 L 120.000 88.000 L 48.000 88.000 C 34.745 88.000 24.000 98.745 24.000 112.000 L 24.000 135.330 C 24.008 144.057 26.812 152.552 32.000 159.570 L 32.000 200.000 C 32.000 213.255 42.745 224.000 56.000 224.000 L 200.000 224.000 C 213.255 224.000 224.000 213.255 224.000 200.000 L 224.000 159.570 C 229.188 152.552 231.992 144.057 232.000 135.330 L 232.000 112.000 C 232.000 98.745 221.255 88.000 208.000 88.000 ZM 112.000 48.000 C 112.000 34.430 122.000 23.540 128.000 18.210 C 134.000 23.540 144.000 34.430 144.000 48.000 C 144.000 56.837 136.837 64.000 128.000 64.000 C 119.163 64.000 112.000 56.837 112.000 48.000 ZM 216.000 135.330 C 216.000 148.580 205.540 159.640 192.680 159.990 C 186.200 160.174 179.920 157.728 175.272 153.209 C 170.623 148.690 168.000 142.483 168.000 136.000 C 168.000 131.582 164.418 128.000 160.000 128.000 C 155.582 128.000 152.000 131.582 152.000 136.000 C 152.000 149.255 141.255 160.000 128.000 160.000 C 114.745 160.000 104.000 149.255 104.000 136.000 C 104.000 131.582 100.418 128.000 96.000 128.000 C 91.582 128.000 88.000 131.582 88.000 136.000 C 88.003 142.485 85.381 148.695 80.732 153.216 C 76.083 157.737 69.802 160.184 63.320 160.000 C 50.460 159.640 40.000 148.580 40.000 135.330 L 40.000 112.000 C 40.000 107.582 43.582 104.000 48.000 104.000 L 208.000 104.000 C 212.418 104.000 216.000 107.582 216.000 112.000 Z"),
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
        return _cake!!
    }

private var _cake: ImageVector? = null

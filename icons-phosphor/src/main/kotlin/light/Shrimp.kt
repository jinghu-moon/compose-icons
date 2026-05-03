package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorLightIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 138.000 116.000 C 138.000 110.477 142.477 106.000 148.000 106.000 C 153.523 106.000 158.000 110.477 158.000 116.000 C 158.000 121.523 153.523 126.000 148.000 126.000 C 142.477 126.000 138.000 121.523 138.000 116.000 ZM 221.900 84.000 C 219.721 125.447 185.504 157.951 144.000 158.000 L 112.000 158.000 C 104.268 158.000 98.000 164.268 98.000 172.000 C 98.000 179.732 104.268 186.000 112.000 186.000 L 168.000 186.000 C 171.314 186.000 174.000 188.686 174.000 192.000 C 174.000 195.314 171.314 198.000 168.000 198.000 L 118.000 198.000 L 118.000 218.000 L 152.000 218.000 C 155.314 218.000 158.000 220.686 158.000 224.000 C 158.000 227.314 155.314 230.000 152.000 230.000 L 96.000 230.000 C 52.922 230.000 18.000 195.078 18.000 152.000 C 18.000 108.922 52.922 74.000 96.000 74.000 L 212.000 74.000 C 219.732 74.000 226.000 67.732 226.000 60.000 C 226.000 52.268 219.732 46.000 212.000 46.000 L 128.000 46.000 C 115.850 46.000 106.000 36.150 106.000 24.000 C 106.000 20.686 108.686 18.000 112.000 18.000 C 115.314 18.000 118.000 20.686 118.000 24.000 C 118.000 29.523 122.477 34.000 128.000 34.000 L 212.000 34.000 C 224.375 34.047 235.002 42.810 237.405 54.950 C 239.809 67.089 233.323 79.241 221.900 84.000 ZM 50.650 199.880 L 86.130 174.540 C 86.041 173.696 85.998 172.848 86.000 172.000 C 86.001 169.082 86.494 166.184 87.460 163.430 L 31.510 138.000 C 26.593 160.556 33.857 184.039 50.650 199.880 ZM 90.300 186.300 L 60.490 207.590 C 71.081 214.398 83.409 218.012 96.000 218.000 L 106.000 218.000 L 106.000 197.290 C 99.560 195.755 93.947 191.825 90.300 186.300 ZM 106.000 146.710 L 106.000 86.000 L 96.000 86.000 C 69.422 86.028 45.446 101.971 35.140 126.470 L 94.000 153.240 C 97.342 150.027 101.487 147.772 106.000 146.710 ZM 209.730 86.000 L 118.000 86.000 L 118.000 146.000 L 144.000 146.000 C 178.111 145.959 206.587 119.966 209.730 86.000 Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null

package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorThinIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.000 176.000 C 112.000 178.209 110.209 180.000 108.000 180.000 L 80.000 180.000 C 77.791 180.000 76.000 178.209 76.000 176.000 C 76.000 173.791 77.791 172.000 80.000 172.000 L 108.000 172.000 C 110.209 172.000 112.000 173.791 112.000 176.000 ZM 176.000 172.000 L 148.000 172.000 C 145.791 172.000 144.000 173.791 144.000 176.000 C 144.000 178.209 145.791 180.000 148.000 180.000 L 176.000 180.000 C 178.209 180.000 180.000 178.209 180.000 176.000 C 180.000 173.791 178.209 172.000 176.000 172.000 ZM 236.000 216.000 C 236.000 218.209 234.209 220.000 232.000 220.000 L 24.000 220.000 C 21.791 220.000 20.000 218.209 20.000 216.000 C 20.000 213.791 21.791 212.000 24.000 212.000 L 36.000 212.000 L 36.000 88.000 C 36.000 86.485 36.856 85.100 38.211 84.422 C 39.566 83.745 41.188 83.891 42.400 84.800 L 100.000 128.000 L 100.000 88.000 C 100.000 86.485 100.856 85.100 102.211 84.422 C 103.566 83.745 105.188 83.891 106.400 84.800 L 150.540 117.910 L 163.060 30.300 C 163.930 24.402 168.979 20.025 174.940 20.000 L 193.060 20.000 C 199.021 20.025 204.070 24.402 204.940 30.300 L 219.940 135.430 C 219.955 135.620 219.955 135.810 219.940 136.000 L 219.940 212.000 L 231.940 212.000 C 233.011 211.984 234.044 212.398 234.807 213.150 C 235.570 213.902 236.000 214.929 236.000 216.000 ZM 157.840 123.380 L 169.330 132.000 L 211.390 132.000 L 197.000 31.430 C 196.714 29.446 195.004 27.980 193.000 28.000 L 174.940 28.000 C 172.936 27.980 171.226 29.446 170.940 31.430 ZM 44.000 212.000 L 212.000 212.000 L 212.000 140.000 L 168.000 140.000 C 167.135 140.000 166.292 139.719 165.600 139.200 L 108.000 96.000 L 108.000 136.000 C 108.000 137.515 107.144 138.900 105.789 139.578 C 104.434 140.255 102.812 140.109 101.600 139.200 L 44.000 96.000 Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null

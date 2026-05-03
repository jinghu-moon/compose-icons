package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorThinIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.880 92.470 L 129.880 28.470 C 128.705 27.844 127.295 27.844 126.120 28.470 L 6.120 92.470 C 4.816 93.165 4.001 94.522 4.001 96.000 C 4.001 97.478 4.816 98.835 6.120 99.530 L 36.000 115.470 L 36.000 166.290 C 35.977 169.236 37.046 172.086 39.000 174.290 C 51.650 188.380 80.000 212.020 128.000 212.020 C 149.000 212.020 166.200 207.500 180.000 201.230 L 180.000 240.000 C 180.000 242.209 181.791 244.000 184.000 244.000 C 186.209 244.000 188.000 242.209 188.000 240.000 L 188.000 197.180 C 198.872 191.208 208.673 183.465 217.000 174.270 C 218.953 172.065 220.021 169.215 220.000 166.270 L 220.000 115.470 L 249.880 99.530 C 251.184 98.835 251.999 97.478 251.999 96.000 C 251.999 94.522 251.184 93.165 249.880 92.470 ZM 128.000 204.000 C 83.170 204.000 56.750 182.000 45.000 168.920 C 44.353 168.197 43.996 167.260 44.000 166.290 L 44.000 119.730 L 126.120 163.530 C 127.295 164.156 128.705 164.156 129.880 163.530 L 180.000 136.800 L 180.000 192.330 C 166.580 199.000 149.390 204.000 128.000 204.000 ZM 212.000 166.290 C 211.999 167.262 211.643 168.201 211.000 168.930 C 204.293 176.343 196.545 182.743 188.000 187.930 L 188.000 132.530 L 212.000 119.730 ZM 187.410 123.780 C 187.037 123.172 186.509 122.675 185.880 122.340 L 129.880 92.470 C 127.936 91.477 125.556 92.226 124.530 94.152 C 123.504 96.078 124.212 98.471 126.120 99.530 L 179.500 128.000 L 128.000 155.470 L 16.500 96.000 L 128.000 36.530 L 239.500 96.000 Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null

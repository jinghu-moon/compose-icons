package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorFillIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 79.550 136.000 L 96.000 113.000 L 96.000 136.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 124.000 144.000 C 124.000 139.582 120.418 136.000 116.000 136.000 L 112.000 136.000 L 112.000 88.000 C 112.000 84.522 109.753 81.443 106.441 80.381 C 103.130 79.320 99.511 80.520 97.490 83.350 L 57.490 139.350 C 55.748 141.789 55.515 144.996 56.886 147.661 C 58.258 150.325 61.003 152.000 64.000 152.000 L 96.000 152.000 L 96.000 168.000 C 96.000 172.418 99.582 176.000 104.000 176.000 C 108.418 176.000 112.000 172.418 112.000 168.000 L 112.000 152.000 L 116.000 152.000 C 120.418 152.000 124.000 148.418 124.000 144.000 ZM 173.590 121.770 L 198.070 93.210 C 200.877 89.851 200.464 84.860 197.142 82.009 C 193.821 79.158 188.824 79.506 185.930 82.790 L 157.800 115.600 C 157.800 115.600 157.800 115.600 157.800 115.600 L 152.000 122.370 L 152.000 88.000 C 152.000 83.582 148.418 80.000 144.000 80.000 C 139.582 80.000 136.000 83.582 136.000 88.000 L 136.000 168.000 C 136.000 172.418 139.582 176.000 144.000 176.000 C 148.418 176.000 152.000 172.418 152.000 168.000 L 152.000 147.000 L 162.620 134.610 L 185.140 172.160 C 187.415 175.949 192.331 177.175 196.120 174.900 C 199.909 172.625 201.135 167.709 198.860 163.920 Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorFillIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 129.890 L 175.060 160.000 L 144.940 160.000 L 151.300 147.300 L 151.300 147.300 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 207.160 188.420 L 167.160 108.420 C 165.807 105.705 163.034 103.989 160.000 103.989 C 156.966 103.989 154.193 105.705 152.840 108.420 L 139.660 134.800 C 131.182 133.139 123.142 129.734 116.050 124.800 C 127.103 112.286 133.942 96.614 135.600 80.000 L 152.000 80.000 C 156.418 80.000 160.000 76.418 160.000 72.000 C 160.000 67.582 156.418 64.000 152.000 64.000 L 112.000 64.000 L 112.000 56.000 C 112.000 51.582 108.418 48.000 104.000 48.000 C 99.582 48.000 96.000 51.582 96.000 56.000 L 96.000 64.000 L 56.000 64.000 C 51.582 64.000 48.000 67.582 48.000 72.000 C 48.000 76.418 51.582 80.000 56.000 80.000 L 119.480 80.000 C 117.893 92.623 112.564 104.482 104.180 114.050 C 100.628 109.903 97.605 105.332 95.180 100.440 C 93.137 96.631 88.438 95.133 84.568 97.057 C 80.698 98.982 79.056 103.632 80.860 107.560 C 83.922 113.734 87.752 119.497 92.260 124.710 C 81.605 132.077 68.954 136.016 56.000 136.000 C 51.582 136.000 48.000 139.582 48.000 144.000 C 48.000 148.418 51.582 152.000 56.000 152.000 C 73.367 152.018 90.264 146.354 104.110 135.870 C 112.488 142.274 122.073 146.920 132.290 149.530 L 112.840 188.420 C 110.863 192.374 112.466 197.183 116.420 199.160 C 120.374 201.137 125.183 199.534 127.160 195.580 L 136.940 176.000 L 183.060 176.000 L 192.840 195.580 C 194.817 199.534 199.626 201.137 203.580 199.160 C 207.534 197.183 209.137 192.374 207.160 188.420 Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null

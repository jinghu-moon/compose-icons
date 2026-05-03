package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorThinIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 97.530 132.300 C 96.034 131.681 94.313 132.025 93.170 133.170 L 70.340 156.000 L 48.000 156.000 C 45.791 156.000 44.000 157.791 44.000 160.000 L 44.000 200.000 C 44.000 202.209 45.791 204.000 48.000 204.000 L 70.340 204.000 L 93.170 226.830 C 94.314 227.975 96.036 228.318 97.531 227.698 C 99.027 227.079 100.001 225.619 100.000 224.000 L 100.000 136.000 C 100.002 134.380 99.026 132.920 97.530 132.300 ZM 92.000 214.300 L 74.830 197.170 C 74.079 196.420 73.061 195.999 72.000 196.000 L 52.000 196.000 L 52.000 164.000 L 72.000 164.000 C 73.061 164.001 74.079 163.580 74.830 162.830 L 92.000 145.660 ZM 148.000 180.000 C 147.991 192.931 141.145 204.893 130.000 211.450 C 128.117 212.353 125.857 211.656 124.810 209.850 C 123.762 208.043 124.281 205.735 126.000 204.550 C 134.690 199.426 140.024 190.089 140.024 180.000 C 140.024 169.911 134.690 160.574 126.000 155.450 C 124.281 154.265 123.762 151.957 124.810 150.150 C 125.857 148.344 128.117 147.647 130.000 148.550 C 141.145 155.107 147.991 167.069 148.000 180.000 ZM 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 120.000 C 44.000 122.209 45.791 124.000 48.000 124.000 C 50.209 124.000 52.000 122.209 52.000 120.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 168.000 220.000 C 165.791 220.000 164.000 221.791 164.000 224.000 C 164.000 226.209 165.791 228.000 168.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 Z"),
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
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null

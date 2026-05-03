package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorThinIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 128.000 C 44.000 130.209 45.791 132.000 48.000 132.000 C 50.209 132.000 52.000 130.209 52.000 128.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 176.000 220.000 C 173.791 220.000 172.000 221.791 172.000 224.000 C 172.000 226.209 173.791 228.000 176.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 108.000 132.000 C 87.615 131.896 69.415 144.753 62.700 164.000 L 60.000 164.000 C 42.327 164.000 28.000 178.327 28.000 196.000 C 28.000 213.673 42.327 228.000 60.000 228.000 L 108.000 228.000 C 134.510 228.000 156.000 206.510 156.000 180.000 C 156.000 153.490 134.510 132.000 108.000 132.000 ZM 108.000 220.000 L 60.000 220.000 C 46.745 220.000 36.000 209.255 36.000 196.000 C 36.000 182.745 46.745 172.000 60.000 172.000 L 60.660 172.000 C 60.460 173.200 60.310 174.410 60.200 175.640 C 60.001 177.849 61.631 179.801 63.840 180.000 C 66.049 180.199 68.001 178.569 68.200 176.360 C 68.412 174.023 68.824 171.707 69.430 169.440 C 69.520 169.203 69.590 168.959 69.640 168.710 C 75.459 148.931 95.359 136.815 115.602 140.726 C 135.845 144.638 149.799 163.295 147.831 183.818 C 145.863 204.342 128.618 220.007 108.000 220.000 Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null

package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorThinIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 107.330 149.780 C 106.588 148.666 105.339 147.996 104.000 147.996 C 102.661 147.996 101.412 148.666 100.670 149.780 L 76.420 186.150 L 63.360 165.840 C 62.623 164.699 61.358 164.010 60.000 164.010 C 58.642 164.010 57.377 164.699 56.640 165.840 L 20.640 221.840 C 19.851 223.070 19.795 224.632 20.495 225.915 C 21.195 227.198 22.539 227.998 24.000 228.000 L 152.000 228.000 C 153.476 228.001 154.832 227.189 155.529 225.888 C 156.226 224.587 156.149 223.008 155.330 221.780 ZM 31.330 220.000 L 60.000 175.400 L 73.000 195.620 C 73.731 196.752 74.983 197.440 76.330 197.450 C 77.682 197.474 78.951 196.802 79.690 195.670 L 104.000 159.210 L 144.530 220.000 ZM 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 128.000 C 44.000 130.209 45.791 132.000 48.000 132.000 C 50.209 132.000 52.000 130.209 52.000 128.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 192.000 220.000 C 189.791 220.000 188.000 221.791 188.000 224.000 C 188.000 226.209 189.791 228.000 192.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorFillIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 180.000 C 151.983 194.357 144.377 207.634 132.000 214.910 C 128.219 216.792 123.627 215.412 121.511 211.756 C 119.395 208.101 120.485 203.431 124.000 201.090 C 131.462 196.685 136.041 188.665 136.041 180.000 C 136.041 171.335 131.462 163.315 124.000 158.910 C 120.485 156.569 119.395 151.899 121.511 148.244 C 123.627 144.588 128.219 143.208 132.000 145.090 C 144.377 152.366 151.983 165.643 152.000 180.000 ZM 99.060 128.610 C 96.071 127.370 92.629 128.053 90.340 130.340 L 68.690 152.000 L 48.000 152.000 C 43.582 152.000 40.000 155.582 40.000 160.000 L 40.000 200.000 C 40.000 204.418 43.582 208.000 48.000 208.000 L 68.690 208.000 L 90.340 229.660 C 92.628 231.951 96.071 232.636 99.062 231.397 C 102.053 230.158 104.003 227.238 104.000 224.000 L 104.000 136.000 C 103.999 132.764 102.050 129.848 99.060 128.610 ZM 216.000 88.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 168.000 232.000 C 163.582 232.000 160.000 228.418 160.000 224.000 C 160.000 219.582 163.582 216.000 168.000 216.000 L 200.000 216.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 120.000 C 56.000 124.418 52.418 128.000 48.000 128.000 C 43.582 128.000 40.000 124.418 40.000 120.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 Z"),
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
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null

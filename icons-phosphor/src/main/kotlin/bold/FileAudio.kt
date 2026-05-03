package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorBoldIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 96.590 124.910 C 92.105 123.051 86.943 124.077 83.510 127.510 L 63.000 148.000 L 44.000 148.000 C 37.373 148.000 32.000 153.373 32.000 160.000 L 32.000 200.000 C 32.000 206.627 37.373 212.000 44.000 212.000 L 63.000 212.000 L 83.480 232.480 C 86.908 235.936 92.084 236.979 96.583 235.120 C 101.082 233.261 104.012 228.868 104.000 224.000 L 104.000 136.000 C 104.001 131.145 101.076 126.767 96.590 124.910 ZM 80.000 195.000 L 76.490 191.480 C 74.233 189.241 71.179 187.990 68.000 188.000 L 56.000 188.000 L 56.000 172.000 L 68.000 172.000 C 71.184 172.003 74.238 170.740 76.490 168.490 L 80.000 165.000 ZM 160.000 180.000 C 159.989 195.770 151.641 210.360 138.050 218.360 C 134.336 220.780 129.591 220.955 125.709 218.816 C 121.827 216.677 119.440 212.573 119.500 208.141 C 119.561 203.709 122.060 199.671 126.000 197.640 C 132.228 193.946 136.046 187.241 136.046 180.000 C 136.046 172.759 132.228 166.054 126.000 162.360 C 122.197 160.249 119.835 156.245 119.825 151.896 C 119.815 147.547 122.159 143.532 125.952 141.404 C 129.745 139.275 134.393 139.366 138.100 141.640 C 151.671 149.653 159.999 164.240 160.000 180.000 ZM 216.490 79.510 L 160.490 23.510 C 158.238 21.260 155.184 19.997 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 112.000 C 36.000 118.627 41.373 124.000 48.000 124.000 C 54.627 124.000 60.000 118.627 60.000 112.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 L 180.000 212.000 C 173.373 212.000 168.000 217.373 168.000 224.000 C 168.000 230.627 173.373 236.000 180.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.003 84.816 218.740 81.762 216.490 79.510 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 Z"),
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

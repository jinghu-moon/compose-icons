package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorLightIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 98.300 130.460 C 96.058 129.531 93.476 130.044 91.760 131.760 L 69.510 154.000 L 48.000 154.000 C 44.686 154.000 42.000 156.686 42.000 160.000 L 42.000 200.000 C 42.000 203.314 44.686 206.000 48.000 206.000 L 69.510 206.000 L 91.760 228.240 C 93.476 229.954 96.055 230.466 98.295 229.538 C 100.536 228.611 101.998 226.425 102.000 224.000 L 102.000 136.000 C 101.999 133.575 100.539 131.389 98.300 130.460 ZM 90.000 209.460 L 76.240 195.760 C 75.116 194.634 73.591 194.001 72.000 194.000 L 54.000 194.000 L 54.000 166.000 L 72.000 166.000 C 73.591 165.999 75.116 165.366 76.240 164.240 L 90.000 150.490 ZM 150.000 180.000 C 149.988 193.644 142.761 206.264 131.000 213.180 C 128.168 214.571 124.743 213.532 123.162 210.802 C 121.581 208.072 122.384 204.584 125.000 202.820 C 133.074 198.054 138.028 189.376 138.028 180.000 C 138.028 170.624 133.074 161.946 125.000 157.180 C 122.384 155.416 121.581 151.928 123.162 149.198 C 124.743 146.468 128.168 145.429 131.000 146.820 C 142.761 153.736 149.988 166.356 150.000 180.000 ZM 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 120.000 C 42.000 123.314 44.686 126.000 48.000 126.000 C 51.314 126.000 54.000 123.314 54.000 120.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 168.000 218.000 C 164.686 218.000 162.000 220.686 162.000 224.000 C 162.000 227.314 164.686 230.000 168.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 Z"),
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

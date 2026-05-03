package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorLightIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 ZM 156.240 123.760 C 158.580 126.103 158.580 129.897 156.240 132.240 L 136.490 152.000 L 156.240 171.760 C 157.845 173.256 158.506 175.508 157.963 177.634 C 157.420 179.760 155.760 181.420 153.634 181.963 C 151.508 182.506 149.256 181.845 147.760 180.240 L 128.000 160.490 L 108.240 180.240 C 105.876 182.443 102.192 182.378 99.907 180.093 C 97.622 177.808 97.557 174.124 99.760 171.760 L 119.510 152.000 L 99.760 132.240 C 98.155 130.744 97.494 128.492 98.037 126.366 C 98.580 124.240 100.240 122.580 102.366 122.037 C 104.492 121.494 106.744 122.155 108.240 123.760 L 128.000 143.510 L 147.760 123.760 C 150.103 121.420 153.897 121.420 156.240 123.760 Z"),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null

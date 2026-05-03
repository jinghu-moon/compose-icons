package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) return _fileArrowUp!!
        _fileArrowUp = phosphorLightIcon(
            name = "FileArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 ZM 156.240 139.760 C 157.845 141.256 158.506 143.508 157.963 145.634 C 157.420 147.760 155.760 149.420 153.634 149.963 C 151.508 150.506 149.256 149.845 147.760 148.240 L 134.000 134.490 L 134.000 184.000 C 134.000 187.314 131.314 190.000 128.000 190.000 C 124.686 190.000 122.000 187.314 122.000 184.000 L 122.000 134.490 L 108.240 148.240 C 105.876 150.443 102.192 150.378 99.907 148.093 C 97.622 145.808 97.557 142.124 99.760 139.760 L 123.760 115.760 C 126.103 113.420 129.897 113.420 132.240 115.760 Z"),
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
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null

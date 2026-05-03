package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorLightIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.240 147.760 C 182.580 150.103 182.580 153.897 180.240 156.240 L 156.240 180.240 C 153.876 182.443 150.192 182.378 147.907 180.093 C 145.622 177.808 145.557 174.124 147.760 171.760 L 167.510 152.000 L 147.760 132.240 C 146.155 130.744 145.494 128.492 146.037 126.366 C 146.580 124.240 148.240 122.580 150.366 122.037 C 152.492 121.494 154.744 122.155 156.240 123.760 ZM 108.240 123.760 C 105.897 121.420 102.103 121.420 99.760 123.760 L 75.760 147.760 C 73.420 150.103 73.420 153.897 75.760 156.240 L 99.760 180.240 C 101.256 181.845 103.508 182.506 105.634 181.963 C 107.760 181.420 109.420 179.760 109.963 177.634 C 110.506 175.508 109.845 173.256 108.240 171.760 L 88.490 152.000 L 108.240 132.240 C 110.580 129.897 110.580 126.103 108.240 123.760 ZM 214.000 88.000 L 214.000 216.000 C 214.000 223.732 207.732 230.000 200.000 230.000 L 56.000 230.000 C 48.268 230.000 42.000 223.732 42.000 216.000 L 42.000 40.000 C 42.000 32.268 48.268 26.000 56.000 26.000 L 152.000 26.000 C 153.594 25.999 155.123 26.632 156.250 27.760 L 212.250 83.760 C 213.372 84.886 214.001 86.411 214.000 88.000 ZM 158.000 82.000 L 193.520 82.000 L 158.000 46.480 ZM 202.000 216.000 L 202.000 94.000 L 152.000 94.000 C 148.686 94.000 146.000 91.314 146.000 88.000 L 146.000 38.000 L 56.000 38.000 C 54.895 38.000 54.000 38.895 54.000 40.000 L 54.000 216.000 C 54.000 217.105 54.895 218.000 56.000 218.000 L 200.000 218.000 C 201.105 218.000 202.000 217.105 202.000 216.000 Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null

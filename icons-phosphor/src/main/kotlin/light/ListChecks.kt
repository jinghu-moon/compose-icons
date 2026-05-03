package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorLightIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 128.000 134.000 C 124.686 134.000 122.000 131.314 122.000 128.000 C 122.000 124.686 124.686 122.000 128.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 128.000 70.000 L 216.000 70.000 C 219.314 70.000 222.000 67.314 222.000 64.000 C 222.000 60.686 219.314 58.000 216.000 58.000 L 128.000 58.000 C 124.686 58.000 122.000 60.686 122.000 64.000 C 122.000 67.314 124.686 70.000 128.000 70.000 ZM 216.000 186.000 L 128.000 186.000 C 124.686 186.000 122.000 188.686 122.000 192.000 C 122.000 195.314 124.686 198.000 128.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 ZM 83.760 43.760 L 56.000 71.510 L 44.240 59.760 C 41.876 57.557 38.192 57.622 35.907 59.907 C 33.622 62.192 33.557 65.876 35.760 68.240 L 51.760 84.240 C 54.103 86.580 57.897 86.580 60.240 84.240 L 92.240 52.240 C 94.443 49.876 94.378 46.192 92.093 43.907 C 89.808 41.622 86.124 41.557 83.760 43.760 ZM 83.760 107.760 L 56.000 135.510 L 44.240 123.760 C 42.744 122.155 40.492 121.494 38.366 122.037 C 36.240 122.580 34.580 124.240 34.037 126.366 C 33.494 128.492 34.155 130.744 35.760 132.240 L 51.760 148.240 C 54.103 150.580 57.897 150.580 60.240 148.240 L 92.240 116.240 C 94.443 113.876 94.378 110.192 92.093 107.907 C 89.808 105.622 86.124 105.557 83.760 107.760 ZM 83.760 171.760 L 56.000 199.510 L 44.240 187.760 C 41.876 185.557 38.192 185.622 35.907 187.907 C 33.622 190.192 33.557 193.876 35.760 196.240 L 51.760 212.240 C 54.103 214.580 57.897 214.580 60.240 212.240 L 92.240 180.240 C 94.443 177.876 94.378 174.192 92.093 171.907 C 89.808 169.622 86.124 169.557 83.760 171.760 Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null

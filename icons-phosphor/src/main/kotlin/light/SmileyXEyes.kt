package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorLightIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 188.240 100.240 L 176.490 112.000 L 188.240 123.760 C 189.845 125.256 190.506 127.508 189.963 129.634 C 189.420 131.760 187.760 133.420 185.634 133.963 C 183.508 134.506 181.256 133.845 179.760 132.240 L 168.000 120.490 L 156.240 132.240 C 153.876 134.443 150.192 134.378 147.907 132.093 C 145.622 129.808 145.557 126.124 147.760 123.760 L 159.510 112.000 L 147.760 100.240 C 145.557 97.876 145.622 94.192 147.907 91.907 C 150.192 89.622 153.876 89.557 156.240 91.760 L 168.000 103.510 L 179.760 91.760 C 182.124 89.557 185.808 89.622 188.093 91.907 C 190.378 94.192 190.443 97.876 188.240 100.240 ZM 108.240 100.240 L 96.490 112.000 L 108.240 123.760 C 109.845 125.256 110.506 127.508 109.963 129.634 C 109.420 131.760 107.760 133.420 105.634 133.963 C 103.508 134.506 101.256 133.845 99.760 132.240 L 88.000 120.490 L 76.240 132.240 C 73.876 134.443 70.192 134.378 67.907 132.093 C 65.622 129.808 65.557 126.124 67.760 123.760 L 79.510 112.000 L 67.760 100.240 C 65.557 97.876 65.622 94.192 67.907 91.907 C 70.192 89.622 73.876 89.557 76.240 91.760 L 88.000 103.510 L 99.760 91.760 C 102.124 89.557 105.808 89.622 108.093 91.907 C 110.378 94.192 110.443 97.876 108.240 100.240 ZM 138.000 180.000 C 138.000 185.523 133.523 190.000 128.000 190.000 C 122.477 190.000 118.000 185.523 118.000 180.000 C 118.000 174.477 122.477 170.000 128.000 170.000 C 133.523 170.000 138.000 174.477 138.000 180.000 Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null

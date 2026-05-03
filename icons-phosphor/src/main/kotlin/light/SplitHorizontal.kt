package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorLightIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 110.000 48.000 L 110.000 208.000 C 110.000 211.314 107.314 214.000 104.000 214.000 C 100.686 214.000 98.000 211.314 98.000 208.000 L 98.000 134.000 L 38.490 134.000 L 60.240 155.760 C 61.845 157.256 62.506 159.508 61.963 161.634 C 61.420 163.760 59.760 165.420 57.634 165.963 C 55.508 166.506 53.256 165.845 51.760 164.240 L 19.760 132.240 C 17.420 129.897 17.420 126.103 19.760 123.760 L 51.760 91.760 C 54.124 89.557 57.808 89.622 60.093 91.907 C 62.378 94.192 62.443 97.876 60.240 100.240 L 38.490 122.000 L 98.000 122.000 L 98.000 48.000 C 98.000 44.686 100.686 42.000 104.000 42.000 C 107.314 42.000 110.000 44.686 110.000 48.000 ZM 236.240 123.760 L 204.240 91.760 C 201.876 89.557 198.192 89.622 195.907 91.907 C 193.622 94.192 193.557 97.876 195.760 100.240 L 217.510 122.000 L 158.000 122.000 L 158.000 48.000 C 158.000 44.686 155.314 42.000 152.000 42.000 C 148.686 42.000 146.000 44.686 146.000 48.000 L 146.000 208.000 C 146.000 211.314 148.686 214.000 152.000 214.000 C 155.314 214.000 158.000 211.314 158.000 208.000 L 158.000 134.000 L 217.510 134.000 L 195.760 155.760 C 194.155 157.256 193.494 159.508 194.037 161.634 C 194.580 163.760 196.240 165.420 198.366 165.963 C 200.492 166.506 202.744 165.845 204.240 164.240 L 236.240 132.240 C 238.580 129.897 238.580 126.103 236.240 123.760 Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null

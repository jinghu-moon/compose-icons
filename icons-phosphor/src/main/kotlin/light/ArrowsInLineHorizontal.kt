package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorLightIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.000 40.000 L 134.000 216.000 C 134.000 219.314 131.314 222.000 128.000 222.000 C 124.686 222.000 122.000 219.314 122.000 216.000 L 122.000 40.000 C 122.000 36.686 124.686 34.000 128.000 34.000 C 131.314 34.000 134.000 36.686 134.000 40.000 ZM 68.240 91.760 C 65.876 89.557 62.192 89.622 59.907 91.907 C 57.622 94.192 57.557 97.876 59.760 100.240 L 81.510 122.000 L 16.000 122.000 C 12.686 122.000 10.000 124.686 10.000 128.000 C 10.000 131.314 12.686 134.000 16.000 134.000 L 81.510 134.000 L 59.760 155.760 C 58.155 157.256 57.494 159.508 58.037 161.634 C 58.580 163.760 60.240 165.420 62.366 165.963 C 64.492 166.506 66.744 165.845 68.240 164.240 L 100.240 132.240 C 102.580 129.897 102.580 126.103 100.240 123.760 ZM 240.000 122.000 L 174.490 122.000 L 196.240 100.240 C 198.443 97.876 198.378 94.192 196.093 91.907 C 193.808 89.622 190.124 89.557 187.760 91.760 L 155.760 123.760 C 153.420 126.103 153.420 129.897 155.760 132.240 L 187.760 164.240 C 190.124 166.443 193.808 166.378 196.093 164.093 C 198.378 161.808 198.443 158.124 196.240 155.760 L 174.490 134.000 L 240.000 134.000 C 243.314 134.000 246.000 131.314 246.000 128.000 C 246.000 124.686 243.314 122.000 240.000 122.000 Z"),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorLightIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 164.240 99.760 C 165.845 101.256 166.506 103.508 165.963 105.634 C 165.420 107.760 163.760 109.420 161.634 109.963 C 159.508 110.506 157.256 109.845 155.760 108.240 L 128.000 80.490 L 100.240 108.240 C 97.876 110.443 94.192 110.378 91.907 108.093 C 89.622 105.808 89.557 102.124 91.760 99.760 L 123.760 67.760 C 126.103 65.420 129.897 65.420 132.240 67.760 ZM 164.240 147.760 C 166.580 150.103 166.580 153.897 164.240 156.240 L 132.240 188.240 C 129.897 190.580 126.103 190.580 123.760 188.240 L 91.760 156.240 C 89.557 153.876 89.622 150.192 91.907 147.907 C 94.192 145.622 97.876 145.557 100.240 147.760 L 128.000 175.510 L 155.760 147.760 C 158.103 145.420 161.897 145.420 164.240 147.760 Z"),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null

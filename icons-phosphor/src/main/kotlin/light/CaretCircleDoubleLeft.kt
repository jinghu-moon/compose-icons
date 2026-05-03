package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorLightIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.120 55.870 C 160.286 16.036 95.704 16.036 55.870 55.870 C 16.036 95.704 16.036 160.286 55.870 200.120 C 95.704 239.954 160.286 239.954 200.120 200.120 C 239.954 160.286 239.954 95.704 200.120 55.870 ZM 191.640 191.640 C 156.493 226.787 99.508 226.787 64.361 191.639 C 29.214 156.492 29.214 99.508 64.361 64.361 C 99.508 29.213 156.493 29.213 191.640 64.360 C 226.733 99.530 226.733 156.470 191.640 191.640 ZM 172.240 100.240 L 144.490 128.000 L 172.240 155.760 C 173.845 157.256 174.506 159.508 173.963 161.634 C 173.420 163.760 171.760 165.420 169.634 165.963 C 167.508 166.506 165.256 165.845 163.760 164.240 L 131.760 132.240 C 129.420 129.897 129.420 126.103 131.760 123.760 L 163.760 91.760 C 166.124 89.557 169.808 89.622 172.093 91.907 C 174.378 94.192 174.443 97.876 172.240 100.240 ZM 116.240 100.240 L 88.490 128.000 L 116.240 155.760 C 117.845 157.256 118.506 159.508 117.963 161.634 C 117.420 163.760 115.760 165.420 113.634 165.963 C 111.508 166.506 109.256 165.845 107.760 164.240 L 75.760 132.240 C 73.420 129.897 73.420 126.103 75.760 123.760 L 107.760 91.760 C 110.124 89.557 113.808 89.622 116.093 91.907 C 118.378 94.192 118.443 97.876 116.240 100.240 Z"),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null

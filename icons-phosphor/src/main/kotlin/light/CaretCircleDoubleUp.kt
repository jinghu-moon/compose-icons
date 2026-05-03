package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorLightIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.120 55.870 C 160.286 16.036 95.704 16.036 55.870 55.870 C 16.036 95.704 16.036 160.286 55.870 200.120 C 95.704 239.954 160.286 239.954 200.120 200.120 C 239.954 160.286 239.954 95.704 200.120 55.870 ZM 191.640 191.640 C 156.493 226.787 99.508 226.787 64.361 191.639 C 29.214 156.492 29.214 99.508 64.361 64.361 C 99.508 29.213 156.493 29.213 191.640 64.360 C 226.733 99.530 226.733 156.470 191.640 191.640 ZM 164.240 163.760 C 165.845 165.256 166.506 167.508 165.963 169.634 C 165.420 171.760 163.760 173.420 161.634 173.963 C 159.508 174.506 157.256 173.845 155.760 172.240 L 128.000 144.490 L 100.240 172.240 C 97.876 174.443 94.192 174.378 91.907 172.093 C 89.622 169.808 89.557 166.124 91.760 163.760 L 123.760 131.760 C 126.103 129.420 129.897 129.420 132.240 131.760 ZM 164.240 107.760 C 165.845 109.256 166.506 111.508 165.963 113.634 C 165.420 115.760 163.760 117.420 161.634 117.963 C 159.508 118.506 157.256 117.845 155.760 116.240 L 128.000 88.490 L 100.240 116.240 C 97.876 118.443 94.192 118.378 91.907 116.093 C 89.622 113.808 89.557 110.124 91.760 107.760 L 123.760 75.760 C 126.103 73.420 129.897 73.420 132.240 75.760 Z"),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null

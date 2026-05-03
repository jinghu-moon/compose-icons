package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorLightIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.120 55.870 C 160.286 16.036 95.704 16.036 55.870 55.870 C 16.036 95.704 16.036 160.286 55.870 200.120 C 95.704 239.954 160.286 239.954 200.120 200.120 C 239.954 160.286 239.954 95.704 200.120 55.870 ZM 191.640 191.640 C 156.493 226.787 99.508 226.787 64.361 191.639 C 29.214 156.492 29.214 99.508 64.361 64.361 C 99.508 29.213 156.493 29.213 191.640 64.360 C 226.733 99.530 226.733 156.470 191.640 191.640 ZM 124.240 123.760 C 126.580 126.103 126.580 129.897 124.240 132.240 L 92.240 164.240 C 89.876 166.443 86.192 166.378 83.907 164.093 C 81.622 161.808 81.557 158.124 83.760 155.760 L 111.510 128.000 L 83.760 100.240 C 81.557 97.876 81.622 94.192 83.907 91.907 C 86.192 89.622 89.876 89.557 92.240 91.760 ZM 180.240 123.760 C 182.580 126.103 182.580 129.897 180.240 132.240 L 148.240 164.240 C 145.876 166.443 142.192 166.378 139.907 164.093 C 137.622 161.808 137.557 158.124 139.760 155.760 L 167.510 128.000 L 139.760 100.240 C 137.557 97.876 137.622 94.192 139.907 91.907 C 142.192 89.622 145.876 89.557 148.240 91.760 Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null

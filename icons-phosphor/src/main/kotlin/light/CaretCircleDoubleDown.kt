package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorLightIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.120 55.870 C 160.286 16.036 95.704 16.036 55.870 55.870 C 16.036 95.704 16.036 160.286 55.870 200.120 C 95.704 239.954 160.286 239.954 200.120 200.120 C 239.954 160.286 239.954 95.704 200.120 55.870 ZM 191.640 191.640 C 156.493 226.787 99.508 226.787 64.361 191.639 C 29.214 156.492 29.214 99.508 64.361 64.361 C 99.508 29.213 156.493 29.213 191.640 64.360 C 226.733 99.530 226.733 156.470 191.640 191.640 ZM 164.240 83.760 C 166.580 86.103 166.580 89.897 164.240 92.240 L 132.240 124.240 C 129.897 126.580 126.103 126.580 123.760 124.240 L 91.760 92.240 C 89.557 89.876 89.622 86.192 91.907 83.907 C 94.192 81.622 97.876 81.557 100.240 83.760 L 128.000 111.510 L 155.760 83.760 C 158.103 81.420 161.897 81.420 164.240 83.760 ZM 164.240 139.760 C 166.580 142.103 166.580 145.897 164.240 148.240 L 132.240 180.240 C 129.897 182.580 126.103 182.580 123.760 180.240 L 91.760 148.240 C 89.557 145.876 89.622 142.192 91.907 139.907 C 94.192 137.622 97.876 137.557 100.240 139.760 L 128.000 167.510 L 155.760 139.760 C 158.103 137.420 161.897 137.420 164.240 139.760 Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorLightIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 160.000 146.000 L 150.000 146.000 L 150.000 80.000 C 150.001 77.435 148.371 75.154 145.945 74.323 C 143.519 73.491 140.832 74.294 139.260 76.320 L 83.260 148.320 C 81.855 150.129 81.603 152.581 82.610 154.639 C 83.618 156.696 85.709 158.000 88.000 158.000 L 138.000 158.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 L 150.000 158.000 L 160.000 158.000 C 163.314 158.000 166.000 155.314 166.000 152.000 C 166.000 148.686 163.314 146.000 160.000 146.000 ZM 138.000 146.000 L 100.270 146.000 L 138.000 97.490 Z"),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null

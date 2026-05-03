package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AllSides: ImageVector
    get() {
        if (_allSides != null) return _allSides!!
        _allSides = radixIcon(
            name = "AllSides",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 14.250 L 5.250 12.000 L 9.750 12.000 L 7.500 14.250 ZM 3.000 9.750 L 0.750 7.500 L 3.000 5.250 L 3.000 9.750 ZM 14.250 7.500 L 12.000 9.750 L 12.000 5.250 L 14.250 7.500 ZM 9.750 3.000 L 5.250 3.000 L 7.500 0.750 L 9.750 3.000 Z"),
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
        return _allSides!!
    }

private var _allSides: ImageVector? = null

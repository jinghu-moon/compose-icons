package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Dash: ImageVector
    get() {
        if (_dash != null) return _dash!!
        _dash = radixIcon(
            name = "Dash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.601 7.010 C 9.829 7.056 10.000 7.258 10.000 7.500 C 10.000 7.742 9.829 7.944 9.601 7.990 L 9.500 8.000 L 5.500 8.000 C 5.224 8.000 5.000 7.776 5.000 7.500 C 5.000 7.224 5.224 7.000 5.500 7.000 L 9.500 7.000 L 9.601 7.010 Z"),
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
        return _dash!!
    }

private var _dash: ImageVector? = null

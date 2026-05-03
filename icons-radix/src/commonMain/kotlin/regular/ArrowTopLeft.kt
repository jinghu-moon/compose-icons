package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowTopLeft: ImageVector
    get() {
        if (_arrowTopLeft != null) return _arrowTopLeft!!
        _arrowTopLeft = radixIcon(
            name = "ArrowTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.500 3.000 C 3.368 3.000 3.240 3.053 3.147 3.146 C 3.053 3.240 3.000 3.368 3.000 3.500 L 3.000 9.000 L 3.010 9.102 C 3.057 9.329 3.259 9.500 3.500 9.500 C 3.742 9.500 3.944 9.328 3.990 9.101 L 4.000 9.000 L 4.000 4.707 L 10.647 11.354 C 10.842 11.549 11.158 11.549 11.354 11.354 C 11.549 11.158 11.549 10.842 11.354 10.646 L 4.707 4.000 L 9.000 4.000 C 9.276 4.000 9.500 3.776 9.500 3.500 C 9.500 3.224 9.276 3.000 9.000 3.000 L 3.500 3.000 Z"),
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
        return _arrowTopLeft!!
    }

private var _arrowTopLeft: ImageVector? = null

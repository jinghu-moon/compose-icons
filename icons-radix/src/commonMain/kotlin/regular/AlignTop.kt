package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = radixIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.500 0.000 C 13.776 0.000 14.000 0.224 14.000 0.500 C 14.000 0.776 13.776 1.000 13.500 1.000 L 9.000 1.000 L 9.000 12.000 C 9.000 12.552 8.552 13.000 8.000 13.000 L 7.000 13.000 C 6.448 13.000 6.000 12.552 6.000 12.000 L 6.000 1.000 L 1.500 1.000 C 1.224 1.000 1.000 0.776 1.000 0.500 C 1.000 0.224 1.224 0.000 1.500 0.000 L 13.500 0.000 Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null

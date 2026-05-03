package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignCenterHorizontally: ImageVector
    get() {
        if (_alignCenterHorizontally != null) return _alignCenterHorizontally!!
        _alignCenterHorizontally = radixIcon(
            name = "AlignCenterHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 8.000 C 14.000 8.552 13.552 9.000 13.000 9.000 L 8.000 9.000 L 8.000 13.500 C 8.000 13.776 7.776 14.000 7.500 14.000 C 7.224 14.000 7.000 13.776 7.000 13.500 L 7.000 9.000 L 2.000 9.000 C 1.448 9.000 1.000 8.552 1.000 8.000 L 1.000 7.000 C 1.000 6.448 1.448 6.000 2.000 6.000 L 7.000 6.000 L 7.000 1.500 C 7.000 1.224 7.224 1.000 7.500 1.000 C 7.776 1.000 8.000 1.224 8.000 1.500 L 8.000 6.000 L 13.000 6.000 C 13.552 6.000 14.000 6.448 14.000 7.000 L 14.000 8.000 Z"),
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
        return _alignCenterHorizontally!!
    }

private var _alignCenterHorizontally: ImageVector? = null

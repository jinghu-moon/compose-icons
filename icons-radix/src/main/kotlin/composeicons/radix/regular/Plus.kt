package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = radixIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 2.25c.276 0 .5 .224 .5 .5v4.25h4.25c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-4.25v4.25c0 .276-.224 .5-.5 .5C7.224 12.75 7 12.526 7 12.25v-4.25h-4.25C2.474 8 2.25 7.776 2.25 7.5 2.25 7.224 2.474 7 2.75 7h4.25v-4.25c0-.276 .224-.5 .5-.5Z"),
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
        return _plus!!
    }

private var _plus: ImageVector? = null

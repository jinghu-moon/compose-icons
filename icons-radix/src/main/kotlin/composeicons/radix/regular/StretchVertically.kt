package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StretchVertically: ImageVector
    get() {
        if (_stretchVertically != null) return _stretchVertically!!
        _stretchVertically = radixIcon(
            name = "StretchVertically",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 14c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-12c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h4.5v-13h-4.5C1.224 1 1 .776 1 .5c0-.276 .224-.5 .5-.5h12c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-4.5v13h4.5Z"),
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
        return _stretchVertically!!
    }

private var _stretchVertically: ImageVector? = null

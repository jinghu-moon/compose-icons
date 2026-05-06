package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = radixIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 2c.552 0 1 .448 1 1v11h4.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-12C1.224 15 1 14.776 1 14.5 1 14.224 1.224 14 1.5 14h4.5v-11C6 2.448 6.448 2 7 2h1Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null

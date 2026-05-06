package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignCenterVertically: ImageVector
    get() {
        if (_alignCenterVertically != null) return _alignCenterVertically!!
        _alignCenterVertically = radixIcon(
            name = "AlignCenterVertically",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 1c.552 0 1 .448 1 1v5h4.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-4.5v5c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-5h-4.5c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h4.5v-5c0-.552 .448-1 1-1h1Z"),
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
        return _alignCenterVertically!!
    }

private var _alignCenterVertically: ImageVector? = null

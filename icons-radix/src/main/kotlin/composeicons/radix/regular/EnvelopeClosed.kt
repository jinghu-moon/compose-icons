package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EnvelopeClosed: ImageVector
    get() {
        if (_envelopeClosed != null) return _envelopeClosed!!
        _envelopeClosed = radixIcon(
            name = "EnvelopeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c.552 0 1 .448 1 1v9c0 .552-.448 1-1 1h-13C.448 13 0 12.552 0 12v-9C0 2.448 .448 2 1 2h13ZM7.741 8.88c-.129 .082-.289 .092-.426 .03L7.259 8.88 1 4.907v7.093h13v-7.093L7.741 8.88ZM1 3.925c.054-0 .107 .01 .159 .029l.082 .041L7.5 7.967 13.759 3.995c.075-.048 .159-.07 .241-.07v-.925h-13v.925Z"),
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
        return _envelopeClosed!!
    }

private var _envelopeClosed: ImageVector? = null

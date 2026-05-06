package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = radixIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.601 3.908c.189-.289 .576-.37 .865-.182 .289 .189 .37 .576 .182 .865L7.398 11.092c-.1 .153-.263 .255-.444 .278-.182 .023-.365-.034-.5-.157L3.704 8.713 3.62 8.618c-.171-.235-.161-.566 .042-.789 .203-.223 .531-.265 .781-.117l.103 .075L6.753 9.793 10.601 3.908Z"),
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
        return _check!!
    }

private var _check: ImageVector? = null

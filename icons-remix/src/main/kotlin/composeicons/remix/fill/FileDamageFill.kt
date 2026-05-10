package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileDamageFill: ImageVector
    get() {
        if (_fileDamageFill != null) return _fileDamageFill!!
        _fileDamageFill = remixIcon(
            name = "FileDamageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 14l4 2.5L10 13l3 4 2-2.5L18 15 15 12l-2 2.5-3-5L6.5 13.25 3 10v-7.008C3 2.455 3.447 2 3.998 2h10.002v6c0 .552 .448 1 1 1h6v11.993c0 .559-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.556 3 21.008v-7.008ZM21 7h-5v-4.997L21 7Z"),
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
        return _fileDamageFill!!
    }

private var _fileDamageFill: ImageVector? = null

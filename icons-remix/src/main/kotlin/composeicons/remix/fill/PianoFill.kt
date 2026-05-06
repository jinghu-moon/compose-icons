package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PianoFill: ImageVector
    get() {
        if (_pianoFill != null) return _pianoFill!!
        _pianoFill = remixIcon(
            name = "PianoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 14v3h2v-3h2v3h2v-3h2v3h2v-3h2v3h2v-3h3v6c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-6h3ZM21 3c.552 0 1 .448 1 1v8h-20v-8C2 3.448 2.448 3 3 3h18Z"),
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
        return _pianoFill!!
    }

private var _pianoFill: ImageVector? = null

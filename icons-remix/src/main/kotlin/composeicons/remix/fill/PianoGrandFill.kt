package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PianoGrandFill: ImageVector
    get() {
        if (_pianoGrandFill != null) return _pianoGrandFill!!
        _pianoGrandFill = remixIcon(
            name = "PianoGrandFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 14v3h2v-3h2v3h2v-3h2v3h2v-3h2v3h2v-3h3v6c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-6h3ZM9 2c2.429 0 4.569 1.239 5.823 3.114 .346 .518 .916 .899 1.532 1.024 2.845 .58 5.139 2.93 5.57 5.861h-19.926v-3C2 5.134 5.134 2 9 2Z"),
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
        return _pianoGrandFill!!
    }

private var _pianoGrandFill: ImageVector? = null

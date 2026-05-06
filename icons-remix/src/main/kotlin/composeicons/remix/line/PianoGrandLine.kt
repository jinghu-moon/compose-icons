package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PianoGrandLine: ImageVector
    get() {
        if (_pianoGrandLine != null) return _pianoGrandLine!!
        _pianoGrandLine = remixIcon(
            name = "PianoGrandLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 2c2.429 0 4.569 1.239 5.823 3.114 .346 .518 .916 .899 1.532 1.024C19.517 6.783 22 9.614 22 13v7c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-11C2 5.134 5.134 2 9 2ZM4 19h16v-5h-1v3h-2v-3h-2v3h-2v-3h-2v3h-2v-3h-2v3h-2v-3h-1v5ZM9 4C6.239 4 4 6.239 4 9v3h15.895C19.483 10.056 17.904 8.496 15.956 8.099 14.829 7.869 13.803 7.187 13.16 6.226 12.262 4.882 10.734 4 9 4Z"),
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
        return _pianoGrandLine!!
    }

private var _pianoGrandLine: ImageVector? = null

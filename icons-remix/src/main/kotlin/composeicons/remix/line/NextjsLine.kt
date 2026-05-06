package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NextjsLine: ImageVector
    get() {
        if (_nextjsLine != null) return _nextjsLine!!
        _nextjsLine = remixIcon(
            name = "NextjsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.664 17.649 10.26 8h-2.26v8h2v-5.054l6.087 7.933C14.891 19.591 13.493 20 12 20 7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 2.205-.892 4.202-2.336 5.649ZM12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10ZM14 12v-4h2v4h-2Z"),
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
        return _nextjsLine!!
    }

private var _nextjsLine: ImageVector? = null

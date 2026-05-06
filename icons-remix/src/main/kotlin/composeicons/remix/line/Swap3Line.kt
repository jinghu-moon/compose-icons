package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Swap3Line: ImageVector
    get() {
        if (_swap3Line != null) return _swap3Line!!
        _swap3Line = remixIcon(
            name = "Swap3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 5.914 3.707 8.207 2.293 6.793 7 2.086l4.707 4.707L10.293 8.207 8 5.914 8 11h-2v-5.086ZM17 9.5c1.381 0 2.5-1.119 2.5-2.5 0-1.381-1.119-2.5-2.5-2.5-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5ZM17 11.5c-2.485 0-4.5-2.015-4.5-4.5 0-2.485 2.015-4.5 4.5-4.5 2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM21.707 17.207 20.293 15.793l-2.293 2.293v-5.086h-2v5.086L13.707 15.793l-1.414 1.414 4.707 4.707 4.707-4.707ZM5 19h4l0-4h-4v4ZM10 13c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h6Z"),
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
        return _swap3Line!!
    }

private var _swap3Line: ImageVector? = null

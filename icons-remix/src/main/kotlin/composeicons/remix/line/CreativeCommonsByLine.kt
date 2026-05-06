package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsByLine: ImageVector
    get() {
        if (_creativeCommonsByLine != null) return _creativeCommonsByLine!!
        _creativeCommonsByLine = remixIcon(
            name = "CreativeCommonsByLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 7c0 1.105-.895 2-2 2C10.895 9 10 8.105 10 7c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2ZM15 11c0-.552-.448-1-1-1h-4c-.552 0-1 .448-1 1v4h1.5v4h3v-4h1.5v-4ZM12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2ZM4 12C4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12Z"),
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
        return _creativeCommonsByLine!!
    }

private var _creativeCommonsByLine: ImageVector? = null

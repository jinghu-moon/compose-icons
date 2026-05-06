package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppsLine: ImageVector
    get() {
        if (_appsLine != null) return _appsLine!!
        _appsLine = remixIcon(
            name = "AppsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.75 2.5C9.097 2.5 11 4.403 11 6.75v4.25h-4.25C4.403 11 2.5 9.097 2.5 6.75 2.5 4.403 4.403 2.5 6.75 2.5ZM9 9v-2.25C9 5.507 7.993 4.5 6.75 4.5 5.507 4.5 4.5 5.507 4.5 6.75 4.5 7.993 5.507 9 6.75 9h2.25ZM6.75 13h4.25v4.25c0 2.347-1.903 4.25-4.25 4.25-2.347 0-4.25-1.903-4.25-4.25C2.5 14.903 4.403 13 6.75 13ZM6.75 15C5.507 15 4.5 16.007 4.5 17.25c0 1.243 1.007 2.25 2.25 2.25C7.993 19.5 9 18.493 9 17.25v-2.25h-2.25ZM17.25 2.5c2.347 0 4.25 1.903 4.25 4.25C21.5 9.097 19.597 11 17.25 11h-4.25v-4.25C13 4.403 14.903 2.5 17.25 2.5ZM17.25 9c1.243 0 2.25-1.007 2.25-2.25 0-1.243-1.007-2.25-2.25-2.25C16.007 4.5 15 5.507 15 6.75v2.25h2.25ZM13 13h4.25c2.347 0 4.25 1.903 4.25 4.25 0 2.347-1.903 4.25-4.25 4.25C14.903 21.5 13 19.597 13 17.25v-4.25ZM15 15v2.25c0 1.243 1.007 2.25 2.25 2.25 1.243 0 2.25-1.007 2.25-2.25C19.5 16.007 18.493 15 17.25 15h-2.25Z"),
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
        return _appsLine!!
    }

private var _appsLine: ImageVector? = null

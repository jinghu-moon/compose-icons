package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppsAiLine: ImageVector
    get() {
        if (_appsAiLine != null) return _appsAiLine!!
        _appsAiLine = remixIcon(
            name = "AppsAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 17.25c0 2.347-1.903 4.25-4.25 4.25-2.347 0-4.25-1.903-4.25-4.25 0-2.347 1.903-4.25 4.25-4.25h4.25v4.25ZM17.25 13c2.347 0 4.25 1.903 4.25 4.25 0 2.347-1.903 4.25-4.25 4.25C14.903 21.5 13 19.597 13 17.25v-4.25h4.25ZM6.75 15c-1.243 0-2.25 1.007-2.25 2.25 0 1.243 1.007 2.25 2.25 2.25C7.993 19.5 9 18.493 9 17.25v-2.25h-2.25ZM15 17.25c0 1.243 1.007 2.25 2.25 2.25 1.243 0 2.25-1.007 2.25-2.25-0-1.243-1.007-2.25-2.25-2.25h-2.25v2.25ZM6.75 2.5c2.347 0 4.25 1.903 4.25 4.25v4.25h-4.25C4.403 11 2.5 9.097 2.5 6.75 2.5 4.403 4.403 2.5 6.75 2.5ZM16.75 2.84c.188-.452 .813-.452 1 0l.27 .648c.459 1.107 1.315 1.992 2.392 2.471l.762 .339c.436 .194 .436 .828 0 1.022l-.808 .358c-1.049 .467-1.89 1.32-2.357 2.391l-.262 .601c-.192 .44-.8 .44-.992 0l-.262-.601C16.025 8.998 15.184 8.145 14.135 7.679l-.808-.358c-.436-.194-.436-.828 0-1.022l.762-.339c1.076-.479 1.933-1.363 2.392-2.471l.27-.648ZM6.75 4.5C5.507 4.5 4.5 5.507 4.5 6.75c0 1.243 1.007 2.25 2.25 2.25h2.25v-2.25C9 5.507 7.993 4.5 6.75 4.5Z"),
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
        return _appsAiLine!!
    }

private var _appsAiLine: ImageVector? = null

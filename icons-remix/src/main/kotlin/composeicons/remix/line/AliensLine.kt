package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AliensLine: ImageVector
    get() {
        if (_aliensLine != null) return _aliensLine!!
        _aliensLine = remixIcon(
            name = "AliensLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.694 0 8.5 3.806 8.5 8.5 0 6.5-5.5 12-8.5 12C9 22.5 3.5 17 3.5 10.5 3.5 5.806 7.306 2 12 2ZM12 4C8.41 4 5.5 6.91 5.5 10.5c0 4.794 4.165 10 6.5 10 2.335 0 6.5-5.206 6.5-10C18.5 6.91 15.59 4 12 4ZM17.5 11c.16 0 .319 .008 .475 .025 .017 .156 .025 .315 .025 .475C18 13.985 15.985 16 13.5 16c-.16 0-.319-.008-.475-.025C13.008 15.819 13 15.66 13 15.5 13 13.015 15.015 11 17.5 11ZM6.5 11C8.985 11 11 13.015 11 15.5c0 .16-.008 .319-.025 .475-.157 .017-.315 .025-.475 .025C8.015 16 6 13.985 6 11.5c0-.16 .008-.319 .025-.475C6.181 11.008 6.34 11 6.5 11Z"),
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
        return _aliensLine!!
    }

private var _aliensLine: ImageVector? = null

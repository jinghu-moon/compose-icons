package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScreenshotLine: ImageVector
    get() {
        if (_screenshotLine != null) return _screenshotLine!!
        _screenshotLine = remixIcon(
            name = "ScreenshotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.993 14.407l-1.552 1.552c.355 .598 .559 1.296 .559 2.041 0 2.209-1.791 4-4 4C4.791 22 3 20.209 3 18 3 15.791 4.791 14 7 14c.738 0 1.429 .2 2.023 .548l1.556-1.556L6.393 8.808 7.808 7.393l4.185 4.185L16.182 7.389l1.414 1.414-4.189 4.189 1.561 1.561C15.564 14.202 16.258 14 17 14c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-.742 .202-1.437 .554-2.032L11.993 14.407ZM7 20c1.105 0 2-.895 2-2C9 16.895 8.105 16 7 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM17 20c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM19 13v-8h-14v8h-2v-9C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v9h-2Z"),
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
        return _screenshotLine!!
    }

private var _screenshotLine: ImageVector? = null

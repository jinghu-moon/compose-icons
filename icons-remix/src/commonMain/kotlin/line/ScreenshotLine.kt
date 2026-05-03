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
                pathData = parseSvgPathData("M 11.993 14.407 L 10.441 15.959 C 10.796 16.556 11.000 17.254 11.000 18.000 C 11.000 20.209 9.209 22.000 7.000 22.000 C 4.791 22.000 3.000 20.209 3.000 18.000 C 3.000 15.791 4.791 14.000 7.000 14.000 C 7.738 14.000 8.429 14.200 9.023 14.548 L 10.578 12.993 L 6.393 8.808 L 7.808 7.393 L 11.993 11.578 L 16.182 7.389 L 17.596 8.803 L 13.407 12.993 L 14.968 14.554 C 15.564 14.202 16.258 14.000 17.000 14.000 C 19.209 14.000 21.000 15.791 21.000 18.000 C 21.000 20.209 19.209 22.000 17.000 22.000 C 14.791 22.000 13.000 20.209 13.000 18.000 C 13.000 17.258 13.202 16.563 13.554 15.968 L 11.993 14.407 ZM 7.000 20.000 C 8.105 20.000 9.000 19.105 9.000 18.000 C 9.000 16.895 8.105 16.000 7.000 16.000 C 5.895 16.000 5.000 16.895 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000 ZM 17.000 20.000 C 18.105 20.000 19.000 19.105 19.000 18.000 C 19.000 16.895 18.105 16.000 17.000 16.000 C 15.895 16.000 15.000 16.895 15.000 18.000 C 15.000 19.105 15.895 20.000 17.000 20.000 ZM 19.000 13.000 L 19.000 5.000 L 5.000 5.000 L 5.000 13.000 L 3.000 13.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 13.000 L 19.000 13.000 Z"),
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

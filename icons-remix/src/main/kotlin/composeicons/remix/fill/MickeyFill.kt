package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MickeyFill: ImageVector
    get() {
        if (_mickeyFill != null) return _mickeyFill!!
        _mickeyFill = remixIcon(
            name = "MickeyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.5 2C20.985 2 23 4.015 23 6.5c0 2.183-1.555 4.003-3.617 4.413 .397 .949 .617 1.992 .617 3.087 0 4.418-3.582 8-8 8C7.582 22 4 18.418 4 14c0-1.094 .22-2.138 .618-3.088C2.555 10.503 1 8.683 1 6.5 1 4.015 3.015 2 5.5 2 7.903 2 9.866 3.883 9.993 6.254 10.635 6.088 11.307 6 12 6c.693 0 1.365 .088 2.006 .254C14.134 3.883 16.097 2 18.5 2Z"),
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
        return _mickeyFill!!
    }

private var _mickeyFill: ImageVector? = null

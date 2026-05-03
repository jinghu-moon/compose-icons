package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MarkupFill: ImageVector
    get() {
        if (_markupFill != null) return _markupFill!!
        _markupFill = remixIcon(
            name = "MarkupFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 17.523 1.997 22.000 6.474 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 ZM 17.051 18.201 L 16.189 14.754 C 16.078 14.309 15.678 13.997 15.219 13.997 L 8.781 13.997 C 8.322 13.997 7.922 14.309 7.811 14.754 L 6.949 18.201 C 8.326 19.323 10.085 19.997 12.000 19.997 C 13.915 19.997 15.674 19.323 17.051 18.201 ZM 10.000 11.997 L 14.000 11.997 L 14.000 10.497 L 12.962 6.862 C 12.867 6.530 12.607 6.270 12.275 6.175 C 11.744 6.024 11.190 6.331 11.038 6.862 L 10.000 10.497 L 10.000 11.997 Z"),
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
        return _markupFill!!
    }

private var _markupFill: ImageVector? = null

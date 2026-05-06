package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FigmaLine: ImageVector
    get() {
        if (_figmaLine != null) return _figmaLine!!
        _figmaLine = remixIcon(
            name = "FigmaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 6C5 3.791 6.791 2 9 2h6c2.209 0 4 1.791 4 4 0 1.195-.524 2.267-1.354 3 .83 .733 1.354 1.805 1.354 3 0 2.209-1.791 4-4 4-.729 0-1.412-.195-2-.535v2.535c0 2.209-1.791 4-4 4C6.791 22 5 20.209 5 18c0-1.195 .524-2.267 1.354-3C5.524 14.267 5 13.195 5 12 5 10.805 5.524 9.733 6.354 9 5.524 8.267 5 7.195 5 6ZM11 10h-2c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2h2v-4ZM13 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2ZM15 8c1.105 0 2-.895 2-2C17 4.895 16.105 4 15 4h-2v4h2ZM9 4C7.895 4 7 4.895 7 6c0 1.105 .895 2 2 2h2v-4h-2ZM11 16h-2c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2Z"),
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
        return _figmaLine!!
    }

private var _figmaLine: ImageVector? = null

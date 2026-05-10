package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SafeFill: ImageVector
    get() {
        if (_safeFill != null) return _safeFill!!
        _safeFill = remixIcon(
            name = "SafeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.005 20h-12v2h-2v-2h-1c-.552 0-1-.448-1-1v-15c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v15c0 .552-.448 1-1 1h-1v2h-2v-2ZM11.005 13.874v3.126h2v-3.126c1.725-.444 3-2.01 3-3.874 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 1.864 1.275 3.43 3 3.874ZM12.005 12c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _safeFill!!
    }

private var _safeFill: ImageVector? = null

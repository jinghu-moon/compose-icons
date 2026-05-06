package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PolaroidFill: ImageVector
    get() {
        if (_polaroidFill != null) return _polaroidFill!!
        _polaroidFill = remixIcon(
            name = "PolaroidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.659 10C19.835 7.67 17.612 6 15 6 11.686 6 9 8.686 9 12c0 3.314 2.686 6 6 6 2.612 0 4.835-1.67 5.659-4h.341v6c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v6h-.341ZM5 6v3h2v-3h-2ZM15 16c-2.209 0-4-1.791-4-4C11 9.791 12.791 8 15 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM15 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _polaroidFill!!
    }

private var _polaroidFill: ImageVector? = null

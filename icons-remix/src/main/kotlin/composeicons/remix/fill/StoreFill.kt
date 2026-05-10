package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StoreFill: ImageVector
    get() {
        if (_storeFill != null) return _storeFill!!
        _storeFill = remixIcon(
            name = "StoreFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 11.646v9.354c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-9.354C2.378 10.941 2 10.014 2 9v-6C2 2.448 2.448 2 3 2h18c.552 0 1 .448 1 1v6c0 1.014-.378 1.941-1 2.646ZM14 9c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-5h-16v5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.448 8.448 8 9 8c.552 0 1 .448 1 1 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2Z"),
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
        return _storeFill!!
    }

private var _storeFill: ImageVector? = null

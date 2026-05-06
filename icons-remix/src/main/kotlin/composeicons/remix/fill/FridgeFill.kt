package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FridgeFill: ImageVector
    get() {
        if (_fridgeFill != null) return _fridgeFill!!
        _fridgeFill = remixIcon(
            name = "FridgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.998 12v10c0 .552-.448 1-1 1h-14C4.446 23 3.998 22.552 3.998 22v-10h16ZM8.998 14h-2v5h2v-5ZM18.998 1c.552 0 1 .448 1 1v8h-16v-8c0-.552 .448-1 1-1h14ZM8.998 4h-2v4h2v-4Z"),
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
        return _fridgeFill!!
    }

private var _fridgeFill: ImageVector? = null

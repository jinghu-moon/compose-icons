package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CollageFill: ImageVector
    get() {
        if (_collageFill != null) return _collageFill!!
        _collageFill = remixIcon(
            name = "CollageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.189 13.264l1.383 7.842-8.571 .001c-.552 0-1-.448-1-1L3 14.709l8.189-1.445ZM20 3.107c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1l-5.398-.001L11.429 3.106l8.572 .001ZM9.398 3.106l1.444 8.189L3 12.678 3 4.107c0-.552 .448-1 1-1L9.398 3.106Z"),
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
        return _collageFill!!
    }

private var _collageFill: ImageVector? = null

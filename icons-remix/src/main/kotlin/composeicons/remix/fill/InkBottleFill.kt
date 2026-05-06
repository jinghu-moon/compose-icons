package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InkBottleFill: ImageVector
    get() {
        if (_inkBottleFill != null) return _inkBottleFill!!
        _inkBottleFill = remixIcon(
            name = "InkBottleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 8.997l4.371 1.749c.38 .152 .629 .519 .629 .928v9.323c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-9.323c0-.409 .249-.777 .629-.928L8 8.997h8ZM20 13.997h-12v5h12v-5ZM16 2.997c.552 0 1 .448 1 1v4h-10v-4c0-.552 .448-1 1-1h8Z"),
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
        return _inkBottleFill!!
    }

private var _inkBottleFill: ImageVector? = null

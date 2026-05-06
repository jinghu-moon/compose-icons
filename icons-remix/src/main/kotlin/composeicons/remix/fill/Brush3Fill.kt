package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brush3Fill: ImageVector
    get() {
        if (_brush3Fill != null) return _brush3Fill!!
        _brush3Fill = remixIcon(
            name = "Brush3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 10.997v-3h-6v-4h-4v4h-6v3h16ZM21 12.997v8c0 .552-.448 1-1 1h-10v-6h-2v6h-4c-.552 0-1-.448-1-1v-8h-1v-6c0-.552 .448-1 1-1h5v-3c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3h5c.552 0 1 .448 1 1v6h-1Z"),
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
        return _brush3Fill!!
    }

private var _brush3Fill: ImageVector? = null

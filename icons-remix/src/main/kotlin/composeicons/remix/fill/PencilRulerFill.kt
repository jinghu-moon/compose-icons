package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilRulerFill: ImageVector
    get() {
        if (_pencilRulerFill != null) return _pencilRulerFill!!
        _pencilRulerFill = remixIcon(
            name = "PencilRulerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 18v2h4v-2h-4ZM3 7 7 2l4 5v15h-8v-15ZM21 8h-2v2h2v2h-3v2h3v2h-2v2h2v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3Z"),
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
        return _pencilRulerFill!!
    }

private var _pencilRulerFill: ImageVector? = null

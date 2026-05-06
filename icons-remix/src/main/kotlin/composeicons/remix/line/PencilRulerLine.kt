package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilRulerLine: ImageVector
    get() {
        if (_pencilRulerLine != null) return _pencilRulerLine!!
        _pencilRulerLine = remixIcon(
            name = "PencilRulerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 8v12h4v-12h-4ZM3 7 7 2l4 5v15h-8v-15ZM19 16v-2h-3v-2h3v-2h-2v-2h2v-2h-4v14h4v-2h-2v-2h2ZM14 4h6c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1Z"),
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
        return _pencilRulerLine!!
    }

private var _pencilRulerLine: ImageVector? = null

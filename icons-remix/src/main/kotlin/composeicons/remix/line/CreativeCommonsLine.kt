package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CreativeCommonsLine: ImageVector
    get() {
        if (_creativeCommonsLine != null) return _creativeCommonsLine!!
        _creativeCommonsLine = remixIcon(
            name = "CreativeCommonsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 8c1.104 0 2.105 .448 2.829 1.173l-1.414 1.414C10.053 10.224 9.553 10 9 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C11.104 15.552 10.104 16 9 16 6.792 16 5 14.208 5 12 5 9.792 6.792 8 9 8ZM18.829 9.173C18.105 8.448 17.104 8 16 8c-2.208 0-4 1.792-4 4 0 2.208 1.792 4 4 4 1.104 0 2.104-.448 2.828-1.172L17.414 13.414C17.052 13.776 16.552 14 16 14c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 .553 0 1.053 .224 1.415 .587L18.829 9.173ZM2 12C2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4Z"),
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
        return _creativeCommonsLine!!
    }

private var _creativeCommonsLine: ImageVector? = null

package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookShelfFill: ImageVector
    get() {
        if (_bookShelfFill != null) return _bookShelfFill!!
        _bookShelfFill = remixIcon(
            name = "BookShelfFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3C3.448 3 3 3.448 3 4v16c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1v-9.303l2.021 9.51c.115 .54 .646 .885 1.186 .77l2.934-.624c.54-.115 .885-.646 .77-1.186L19.001 5.474c-.115-.54-.646-.885-1.186-.77L15 5.302v-.302C15 4.448 14.552 4 14 4h-5C9 3.448 8.552 3 8 3h-4ZM9 6h4v8h-4v-8ZM13 16v3h-4v-3h4ZM7 17v2h-2v-2h2ZM18.77 18.814l-.416-1.956 .978-.208 .416 1.956-.978 .208Z"),
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
        return _bookShelfFill!!
    }

private var _bookShelfFill: ImageVector? = null

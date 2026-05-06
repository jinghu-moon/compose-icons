package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Suitcase3Line: ImageVector
    get() {
        if (_suitcase3Line != null) return _suitcase3Line!!
        _suitcase3Line = remixIcon(
            name = "Suitcase3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 1c.552 0 1 .448 1 1v5h1v-1h2v1h1c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-1v1h-2v-1h-10v1h-2v-1h-1C3.448 21 3 20.552 3 20v-12C3 7.448 3.448 7 4 7h1v-1h2v1h1v-5C8 1.448 8.448 1 9 1h6ZM19 9h-14v10h14v-10ZM9 10v8h-2v-8h2ZM13 10v8h-2v-8h2ZM17 10v8h-2v-8h2ZM14 3h-4v4h4v-4Z"),
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
        return _suitcase3Line!!
    }

private var _suitcase3Line: ImageVector? = null

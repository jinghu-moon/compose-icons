package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ruler2Line: ImageVector
    get() {
        if (_ruler2Line != null) return _ruler2Line!!
        _ruler2Line = remixIcon(
            name = "Ruler2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 19h2v-5h-9v-9h-5v2h2v2h-2v2h3v2h-3v2h2v2h-2v2h2v-2h2v2h2v-3h2v3h2v-2h2v2ZM12 12h8c.552 0 1 .448 1 1v7c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h7c.552 0 1 .448 1 1v8Z"),
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
        return _ruler2Line!!
    }

private var _ruler2Line: ImageVector? = null

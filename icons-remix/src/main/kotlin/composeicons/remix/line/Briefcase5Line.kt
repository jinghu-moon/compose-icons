package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Briefcase5Line: ImageVector
    get() {
        if (_briefcase5Line != null) return _briefcase5Line!!
        _briefcase5Line = remixIcon(
            name = "Briefcase5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 5v-3C7 1.448 7.448 1 8 1h8c.552 0 1 .448 1 1v3h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4ZM16 15h-3v1h-2v-1h-3v4h8v-4ZM8 7v6h3v-1h2v1h3v-6h-8ZM6 13v-6h-2v6h2ZM18 13h2v-6h-2v6ZM6 15h-2v4h2v-4ZM18 15v4h2v-4h-2ZM9 3v2h6v-2h-6Z"),
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
        return _briefcase5Line!!
    }

private var _briefcase5Line: ImageVector? = null

package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Briefcase2Line: ImageVector
    get() {
        if (_briefcase2Line != null) return _briefcase2Line!!
        _briefcase2Line = remixIcon(
            name = "Briefcase2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 5v-3C7 1.448 7.448 1 8 1h8c.552 0 1 .448 1 1v3h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4ZM20 13h-16v6h16v-6ZM20 7h-16v4h3v-2h2v2h6v-2h2v2h3v-4ZM9 3v2h6v-2h-6Z"),
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
        return _briefcase2Line!!
    }

private var _briefcase2Line: ImageVector? = null

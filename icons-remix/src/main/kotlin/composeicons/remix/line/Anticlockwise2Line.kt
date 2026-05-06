package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Anticlockwise2Line: ImageVector
    get() {
        if (_anticlockwise2Line != null) return _anticlockwise2Line!!
        _anticlockwise2Line = remixIcon(
            name = "Anticlockwise2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.414 6l1.828 1.828L13.828 9.243 9.586 5 13.828 .757l1.414 1.414L13.414 4h2.586c2.761 0 5 2.239 5 5v4h-2v-4c0-1.657-1.343-3-3-3h-2.586ZM15 11v10c0 .552-.448 1-1 1h-10C3.448 22 3 21.552 3 21v-10C3 10.448 3.448 10 4 10h10c.552 0 1 .448 1 1ZM13 12h-8v8h8v-8Z"),
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
        return _anticlockwise2Line!!
    }

private var _anticlockwise2Line: ImageVector? = null

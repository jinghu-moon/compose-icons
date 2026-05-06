package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Speaker2Line: ImageVector
    get() {
        if (_speaker2Line != null) return _speaker2Line!!
        _speaker2Line = remixIcon(
            name = "Speaker2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5v14h14v-14h-14ZM4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3ZM12 16c2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4ZM12 18C8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM12 13.5c-.828 0-1.5-.672-1.5-1.5 0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5Z"),
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
        return _speaker2Line!!
    }

private var _speaker2Line: ImageVector? = null

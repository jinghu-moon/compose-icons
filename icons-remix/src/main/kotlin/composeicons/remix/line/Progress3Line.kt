package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Progress3Line: ImageVector
    get() {
        if (_progress3Line != null) return _progress3Line!!
        _progress3Line = remixIcon(
            name = "Progress3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12ZM20 12c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8ZM18 12c0 1.657-.672 3.157-1.757 4.243L12 12v-6c3.314 0 6 2.686 6 6Z"),
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
        return _progress3Line!!
    }

private var _progress3Line: ImageVector? = null

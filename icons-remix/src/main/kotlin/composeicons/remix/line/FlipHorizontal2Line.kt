package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlipHorizontal2Line: ImageVector
    get() {
        if (_flipHorizontal2Line != null) return _flipHorizontal2Line!!
        _flipHorizontal2Line = remixIcon(
            name = "FlipHorizontal2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 19h14v-14h-14v14ZM3 4C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16ZM10 8v3h4v-3l4 4-4 4v-3h-4v3L6 12 10 8Z"),
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
        return _flipHorizontal2Line!!
    }

private var _flipHorizontal2Line: ImageVector? = null

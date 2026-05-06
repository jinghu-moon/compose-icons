package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FigmaFill: ImageVector
    get() {
        if (_figmaFill != null) return _figmaFill!!
        _figmaFill = remixIcon(
            name = "FigmaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.333 5.333C5.333 3.492 6.826 2 8.667 2h3.333 0 3.333c1.841 0 3.333 1.492 3.333 3.333 0 1.841-1.492 3.333-3.333 3.333h-3.333-0v3.333 3.333 3.333C12 20.508 10.507 22 8.666 22 6.825 22 5.333 20.508 5.333 18.667c0-1.841 1.492-3.333 3.333-3.333C6.825 15.333 5.333 13.841 5.333 12c0-1.841 1.492-3.333 3.333-3.333h0C6.826 8.667 5.333 7.174 5.333 5.333ZM12 12c0 1.841 1.492 3.333 3.333 3.333 1.841 0 3.333-1.492 3.333-3.333 0-1.841-1.492-3.333-3.333-3.333-1.841 0-3.333 1.492-3.333 3.333Z"),
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
        return _figmaFill!!
    }

private var _figmaFill: ImageVector? = null

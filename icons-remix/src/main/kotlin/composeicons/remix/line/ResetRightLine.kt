package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ResetRightLine: ImageVector
    get() {
        if (_resetRightLine != null) return _resetRightLine!!
        _resetRightLine = remixIcon(
            name = "ResetRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2v2c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 9.25 5.387 6.824 7.5 5.385L7.5 8h2v-6h-6v2L5.999 4C3.571 5.824 2 8.729 2 12Z"),
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
        return _resetRightLine!!
    }

private var _resetRightLine: ImageVector? = null

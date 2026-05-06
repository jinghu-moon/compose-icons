package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowTurnForwardLine: ImageVector
    get() {
        if (_arrowTurnForwardLine != null) return _arrowTurnForwardLine!!
        _arrowTurnForwardLine = remixIcon(
            name = "ArrowTurnForwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 5.828v7.172c0 3.314-2.686 6-6 6C7.687 19 5 16.314 5 13v-9h-2v9c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-7.172l2.536 2.536L22.95 6.95 18 2 13.051 6.95l1.414 1.414L17 5.828Z"),
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
        return _arrowTurnForwardLine!!
    }

private var _arrowTurnForwardLine: ImageVector? = null

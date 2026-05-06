package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowTurnBackFill: ImageVector
    get() {
        if (_arrowTurnBackFill != null) return _arrowTurnBackFill!!
        _arrowTurnBackFill = remixIcon(
            name = "ArrowTurnBackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 16h-4l5 6 5-6h-4v-5C19 6.582 15.418 3 11 3 6.582 3 3 6.582 3 11v9h2v-9C5 7.686 7.686 5 11 5c3.314 0 6 2.686 6 6v5Z"),
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
        return _arrowTurnBackFill!!
    }

private var _arrowTurnBackFill: ImageVector? = null

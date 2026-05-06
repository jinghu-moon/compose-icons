package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowTurnBackLine: ImageVector
    get() {
        if (_arrowTurnBackLine != null) return _arrowTurnBackLine!!
        _arrowTurnBackLine = remixIcon(
            name = "ArrowTurnBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 18.172 14.465 15.636l-1.414 1.414L18 22l4.95-4.95L21.536 15.636l-2.536 2.536v-7.172c0-4.418-3.582-8-8-8C6.582 3 3 6.582 3 11v9h2v-9c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v7.172Z"),
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
        return _arrowTurnBackLine!!
    }

private var _arrowTurnBackLine: ImageVector? = null

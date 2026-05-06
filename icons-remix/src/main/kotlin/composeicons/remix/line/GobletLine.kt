package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GobletLine: ImageVector
    get() {
        if (_gobletLine != null) return _gobletLine!!
        _gobletLine = remixIcon(
            name = "GobletLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 19v-5.111L3 5v-2h18v2l-8 8.889v5.111h5v2h-12v-2h5ZM7.491 7h9.019L18.309 5h-12.619L7.491 7ZM9.291 9 12 12.01 14.709 9h-5.419Z"),
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
        return _gobletLine!!
    }

private var _gobletLine: ImageVector? = null

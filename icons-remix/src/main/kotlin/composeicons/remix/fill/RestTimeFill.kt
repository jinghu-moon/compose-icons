package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RestTimeFill: ImageVector
    get() {
        if (_restTimeFill != null) return _restTimeFill!!
        _restTimeFill = remixIcon(
            name = "RestTimeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 6v8h8c0 4.418-3.582 8-8 8C6.582 22 3 18.418 3 14 3 9.665 6.58 6 11 6ZM21 2v2l-5.327 6h5.327v2h-8v-2L18.326 4h-5.326v-2h8Z"),
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
        return _restTimeFill!!
    }

private var _restTimeFill: ImageVector? = null

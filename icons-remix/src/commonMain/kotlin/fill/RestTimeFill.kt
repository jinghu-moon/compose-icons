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
                pathData = parseSvgPathData("M 11.000 6.000 L 11.000 14.000 L 19.000 14.000 C 19.000 18.418 15.418 22.000 11.000 22.000 C 6.582 22.000 3.000 18.418 3.000 14.000 C 3.000 9.665 6.580 6.000 11.000 6.000 ZM 21.000 2.000 L 21.000 4.000 L 15.673 10.000 L 21.000 10.000 L 21.000 12.000 L 13.000 12.000 L 13.000 10.000 L 18.326 4.000 L 13.000 4.000 L 13.000 2.000 L 21.000 2.000 Z"),
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
